
/*
 * Brady Lange
 * Class: CSIS 162 Programming
 * Program $5
 * Due Date: May 9th, 2017
 * This class calculates salaries and holds has-a relationships
 * It consists of these classes: Person, partTime, pets, Cat, bird, graduate, undergraduate, and mainClass.
 */

//implement the IS-A relationship via the extends keyword.
//partTime employee is-a person

public class partTime extends Person  //is-a
{
   private double payRate;     //store the pay rate
   private double pay;
   private double hoursWorked; //store the hours worked
   private Cat myCat; //has-a
   private bird myBird; //has-a
   private dog myDog; //has-a
  
	   //this is HAS-A relationship; Also called composition ; a person HAS-A a Cat
	   //notice it is not is-a relationships; saying a Cat IS-A Person does not make sense.
	   //adopting a cat
	   public void adoptAcat(Cat strayCat)
	   {
		   String cName = strayCat.getPetName(); 
		   myCat.setPetName(cName);
		   String breed = strayCat.getBreed();
		   myCat.setBreed(breed);
		   String dob = strayCat.getDateOfBirth();
		   myCat.setDateOfBirth(dob);
		   String hair = strayCat.getCatHairLength();
		   myCat.setCatHairLength(hair);
	   }

	   //adopting a dog
	   public void adoptAdog(dog strayDog)
	   {
		   String dName = strayDog.getPetName(); 
		   myDog.setPetName(dName);
		   String breed = strayDog.getBreed();
		   myDog.setBreed(breed);
		   String dob = strayDog.getDateOfBirth();
		   myDog.setDateOfBirth(dob);
		   boolean hunt = strayDog.getHDog();
		   myDog.setHDog(hunt);
		   boolean kidF = strayDog.getKFriendly();
		   myDog.setKFriendly(kidF);
		   String size  = strayDog.getSize();
		   myDog.setSize(size);
	   }

	   //adopting a bird
	   public void adoptAbird(bird strayBird)
	   {
		   String bName = strayBird.getPetName(); 
		   myBird.setPetName(bName);
		   String breed = strayBird.getBreed();
		   myBird.setBreed(breed);
		   String dob = strayBird.getDateOfBirth();
		   myBird.setDateOfBirth(dob);
		   String color = strayBird.getFeatherColor();
		   myBird.setFeatherColor(color);
		   int length = strayBird.getBeakLength();
		   myBird.setBeakLength(length);
	   }


	   public void catRunning()
	   {
		  myCat.running(); 
	   }


	   public void dotheHissing()
	   {
		  myCat.hiss();
	   }

	   //default constructor
	   public partTime()
	   {
	       super();
	       payRate = 0;
	       hoursWorked = 0;
	       myCat = new Cat();
	       myDog = new dog();
	       myBird = new bird();

	   }//end of default constructor

	   //cat name alternate constructor
	   public partTime(String first, String last, String ssn, double rate, double hours, String catName)
	   {
		   super(first,last,ssn);
		   payRate = rate;
		   hoursWorked = hours;
		   myCat= new Cat(catName); 
		   calculatePay();
	   }//end of alternate  

	   //alternate constructor
	   public partTime(String first, String last, String ssn, double rate, double hours, bird one, dog two, Cat three)
	   {
		   super(first, last, ssn);
		   payRate = rate;
		   hoursWorked = hours;
		   myBird = new bird(one);
		   myDog = new dog(two);
		   myCat = new Cat(three); 
		   calculatePay();
	   }


	   public String getCatName()
	   {
		   String catName=myCat.getPetName();
		   return catName;
	   }

	   public void playwithMyPets()
	   {
		   myCat.hiss();
		   myCat.running();
	   }


	   //Method to calculate and return the wages
	   public void calculatePay()
	   {
		   pay = (payRate * hoursWorked);
	   } //end of calculatePay


	   public double getPay()
	   {
		   return pay;
	   } //end of getPay


	   //Method to set the first name, last name, payRate, and hours
	   public void setNameRateHours(String first, String last, double rate, double hours)
	   {
		   setName(first,last);//super is not required
		   payRate = rate;
		   hoursWorked = hours;
	   } //end of setNAmeRateHours

	   //Method to return the pay rate
	   //Postcondition: The value of payRate is returned
	   public double getPayRate()
	   {
		   return payRate;
	   } //end of getPayRate

	   //Method to return the number of hours worked
	   public double getHoursWorked()
	   {
		   return hoursWorked;
	   } //end of getHoursWorked

	   //toString
	   public String toString()
	   {
		   String catData = myCat.toString();
		   String birdData = myBird.toString();
		   String dogData = myDog.toString();
		   String personData = super.toString();

		   String partTimedata= personData + "Wage is: $" + pay + "\n\n" + birdData + catData + dogData;
		   return partTimedata;
	   }


} //end of partTime


