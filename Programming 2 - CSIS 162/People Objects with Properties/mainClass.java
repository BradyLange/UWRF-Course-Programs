
/*
 * Brady Lange
 * CSIS 162 Programming
 * Program #5
 * Due Date: May 9th, 2017
 * This class creates people objects 
 * It consists of these classes: Person, partTime, pets, Cat, bird, graduate, undergraduate, and mainClass.
 */

public class mainClass {
	   
	public static void main(String[] arg)
	{
		   
		  //partTime empOne= new partTime("Jack", "Smith", 
		  //"434-98-9832", 12.2, 43, "Willow");
		  //System.out.println(empOne);
		  //empOne.catRunning();
		    
		  //Cat strayCat = new Cat("Morris");
		  //partTime empTwo= new partTime();
		  //System.out.println(empTwo);
		    
		  //empTwo.adoptAcat(strayCat);
		  //System.out.println(empTwo);
		   
		   //MARY ANDERSON OBJECT
		    bird newBird = new bird("Red", 2, "Crow", "Beaky", "January 12, 1999"); //instantiate the bird object with values //has a bird
		    Cat newCat = new Cat(); //has no cat
		    dog newDog = new dog(); //has no dog
		    undergraduate Mary = new undergraduate(3.5, "Junior", "Mary", "Anderson", "342-45-9812", 10.50, 20, newBird, newDog, newCat);
		    System.out.print(Mary); //prints out object
		
		   //JOHN SMITH OBJECT
		    Cat newCat2 = new Cat("Long", "Maine Coon", "Tigger", "May 6, 2011"); //has a cat
		    dog newDog2 = new dog("Large", false, true, "Great Dang", "Sparky", "April 2, 2007"); //has a dog
		    bird newBird2 = new bird(); //has no bird
		    graduate John = new graduate("N/A", "Art", 3750, "John", "Smith", "367-44-0900", 21.50, 40, newBird2, newDog2, newCat2); //couldn't get the salary to exactly equal $45000
		    System.out.println(John); //prints out object

		  //Printing the color of Mary's bird
		    String featherColor = newBird.getFeatherColor();
		    System.out.println("Mary's bird's feather color: " + featherColor);
		    
		  //Printing the salary of John
		    double salary = John.getPay();
		    double totalSal = salary * 52.012; //getting John's salary for the year that I couldn't get to equal exactly 45,000 dollars because of vacation days/time difference each year has
		    System.out.println("John's salary: " + totalSal + "\n");
		    
		  //Mary adopted a cat
		    Cat newCat3 = new Cat("Short", "Persian", "Stripe", "June 11th, 2004"); //adopted a cat
		    Mary.adoptAcat(newCat3); //adopting a new cat for Mary
		    System.out.println("NEW MARY OBJECT WITH CAT: \n" + Mary); //prints out update Mary object
		    
		  //Mary's cat's breed
		    String catsBreed = newCat3.getBreed(); //getting Mary's cat's breed
		    System.out.println("Mary's cat's breed is: " + catsBreed); //printing it out
		    
	}//end of main
	      
}//end of class
