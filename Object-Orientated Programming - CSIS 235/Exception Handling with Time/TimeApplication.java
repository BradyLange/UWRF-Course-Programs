package Time;

import java.io.*;
import java.util.*;

public class Driver
{
    static Scanner console = new Scanner(System.in);

    public static void main(String[] args)
    {
   
        int hours;
        int minutes;
        int seconds;
        String str;
        hours = getHours();
        minutes = getMinutes();
        seconds = getSeconds();
        str = getPeriod();
        System.out.println();
        
        System.out.print("24 hour clock time: ");
        
        print24HourTime(hours, minutes, seconds, str);
 
    }//end of main

    //Define the getHours, getMinutes, getSeconds,
    //getPeriod as well as print24HourTime.
    public static int getHours()
    {
    	int hour = 1;
    	boolean hrDone = false;
    	String str;
    	
    	do {
    		try {
    			System.out.print("Enter the hour:");
    			hour = console.nextInt();
    			
    			if(hour < 1)
    				throw new InvalidHrException("Hours cannot be negative.");
    			if(hour > 12)
    				throw new InvalidHrException("Hours cannot be more than 12.");
    			
    			hrDone = true;
    		} //end of try block
    		
    		catch (InputMismatchException ime) {
    			 str = console.next();
    			 System.out.println("Exception: " + ime.toString() + " " + str);
    		} //end of catch block
    		
    		catch (InvalidHrException ihe) {
    			System.out.println("Exception: " + ihe.toString());
    		} //end of catch block
    		
    		} while(!hrDone); //end of do while loop
    	return hour;
    } //end of getHours
    
    public static int getMinutes()
    {
    	int minutes = 1;
    	String str;
    	boolean minDone = false;
    	
    	do {
    		try {
    			System.out.print("Enter minutes:");
    			minutes = console.nextInt();
    			
    			if(minutes < 1)
    				throw new InvalidMinException("Minutes cannot be negative.");
    			if(minutes > 59)
    				throw new InvalidMinException("Minutes cannot be more than 59.");
    			
    			minDone = true;
    		} //end of try block
    		
    		catch (InputMismatchException ime) {
    			str = console.next();
    			System.out.println("Exception: " + ime.toString() + " " + str);
    		} //end of catch block
    		
    		catch (InvalidMinException imine) {
    			System.out.println("Exception: " + imine.toString());
    		} //end of catch block
    	} while(!minDone); //end of do while loop
    	return minutes;
    } //end of getMinutes
    
    public static int getSeconds()
    {
    	int seconds = 1;
    	String str;
    	boolean secDone = false;
    			
    	do {
    		try {
    			System.out.print("Enter seconds:");
    			seconds = console.nextInt();
    			
    			if(seconds < 1)
    				throw new InvalidSecException("Seconds cannot be negative.");
    			if(seconds > 59)
    				throw new InvalidSecException("Seconds cannot be more than 59.");
    			
    			secDone = true;
    		} //end of try block
    		
    		catch (InputMismatchException ime) {
    			str = console.next();
    			System.out.println("Exception: " + ime.toString() + " " + str);
    		} //end of catch block
    		
    		catch (InvalidSecException ise) {
    			System.out.println("Exception: " + ise.toString());
    		}
    	} while(!secDone); //end of do while loop
    	return seconds;
    } //end of getSeconds
    
    public static String getPeriod()
    {
    	String period = "";
    	String str; 
    	boolean perDone = false;
    	//int hours = getHours();
    	
    	do {
    		try {
    			System.out.print("Enter time period:");
    			period = console.next();
    			
    			if(!period.equalsIgnoreCase("pm") && !period.equalsIgnoreCase("am"))
    				throw new InvalidPrdException();
    			
    				perDone = true;
    		} //end of try block

    		catch (InputMismatchException ime) {
    			str = console.next();
    			System.out.println("Exception: " + ime.toString() + " " + str);
    		} //end of catch block
    		
    		catch (InvalidPrdException ipe) {
    			System.out.println("Exception: " + ipe.toString());
    		}
    		
    	} while(!perDone); //end of do while loop
    	return period;
    } //end of getPeriod
    
    public static void print24HourTime(int hours, int minutes, int seconds, String period)
    {
    	int pmHours = 12;
    	int twelveAM = 12;
    	
	    	if(period.equalsIgnoreCase("pm"))
	    	{
	    		if(hours == 12)
	    			System.out.println(hours + ":" + minutes + ":" + seconds + " " + period);
	    		else {
	    		 hours += pmHours; 
	    			System.out.println(hours + ":" + minutes + ":" + seconds + " " + period);
	    		}
	    	}
    	
	    	if(period.equalsIgnoreCase("am"))
	    	{
	    		if(hours == 12)
	    		{
	    			hours -= twelveAM;
	    			System.out.println(hours + ":" + minutes + ":" + seconds + " " + period);
	    		}
	    		else
	    			System.out.println(hours + ":" + minutes + ":" + seconds + " " + period);
	    	}
    	
    } //end of print24HourTime
    
       
}//end of class
