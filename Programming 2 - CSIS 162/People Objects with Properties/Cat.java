
/*
 * Brady Lange
 * Class: CSIS 162 Programming II
 * Program 5
 * Due Date: May 9th, 2017
 * This class has cat specific attributes
 * It consists of these classes: Person, partTime, pets, Cat, bird, graduate, undergraduate, and mainClass.
 */

public class Cat extends pets { //is-a pet
	
	private String hairLength;
	
	//default constructor
	public Cat (){
		super();
		hairLength = "N/A";
	}//end of default constructor
	
	//alternate constructor
	public Cat(String hair, String breed, String petName, String dateOfBirth)
	{
		super(breed, petName, dateOfBirth);
		this.hairLength = hair;
	}
	
	//setters
	public Cat (String hair)
	{
		this.hairLength=hair;
	}//end of alternate constructor
	
	public void setCatHairLength(String hair)
	{
		this.hairLength = hair;
	}
	
	public Cat(Cat obj)
	{
		super(obj);
		this.hairLength = obj.hairLength;
	}
	///cat hissing
	public void hiss ()
	   {
	      System.out.println (petName + "\n   I am mad and Hissing!");
	   }//end of his
	
	   //cat is escaping
	   public void running (){
		   System.out.println(petName + "\n   I am running away had enough");
	   }//end of running
	   
	   //makeCopy method
	   public void makeCopy(Cat obj)
	   {
		   this.hairLength = obj.hairLength;
	   }
	    
	   //getters
	   public String getCatHairLength(){
		   return hairLength;
	   }//end of getCatName
	 
	   public String toString(){
		   String petsData = super.toString(); //not including as we are using has-a in the graduate and undergraduate classes of pets information
		   return "CAT: " + "\n" + petName + "'s hair length: " + hairLength +"\n" + petsData + "\n";
		   
	   }//end of toString


}//end of class cat

