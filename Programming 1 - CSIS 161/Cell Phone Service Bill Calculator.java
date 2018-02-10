/*
 * Brady Lange
 * CSIS 161 Programming
 * Section: 02
 * Meets: M,W, & F at 1:00 PM to 1:50 PM.
 */
/*
 * This program calculates the phone bill's of 2 types of services from a telephone company.
 */

import java.util.*; //importing already coded code

public class cellBill { //start of public class

	public static void main(String[] args) { //start of main method

Scanner console = new Scanner(System.in);	//to be able to use the code	
		
//Declaring variables
String name;
final int accountNum;
String service;

//Regular service variables
String reg = "REGULAR";
final int freeRegMins = 50;
final double regFee = 10.00;
double regCharge;
String rChargeForm;

//Premium service variables
int dayMins; //this will also work for the regular service statement
int nightMins;
String prem = "PREMIUM";
final int freePremDayMins = 75;
final int freePremNightMins = 100;
final double premFee = 25.00;
double premCharge;
String pChargeForm;

//Users inputs
System.out.print("What is your first name? ");
name = console.next();
System.out.print("What is your account number? ");
accountNum = console.nextInt();
System.out.print("What is your service type (Regular or Premium)? ");
service = console.next();

//Capitalizing users input
String capService = service.toUpperCase();

//Using if and else statements to execute which service is being used
if (service.equalsIgnoreCase(prem)) { //ignoring case sensitive 
System.out.print("How many night minutes did you use? (No decimals) ");
nightMins = console.nextInt();
System.out.print("How many day minutes did you use? (No decimals) ");
dayMins = console.nextInt();

if (dayMins > freePremDayMins && nightMins > freePremNightMins) {
premCharge = premFee + (nightMins - freePremNightMins) * 0.05 + (dayMins - freePremDayMins) * 0.10;
pChargeForm = String.format("%.2f", premCharge); //formatting the decimal to two places
System.out.println("Name: " + name);
System.out.println("Account number: " + accountNum);
System.out.println("Service type: " + capService);
System.out.println("Service minutes used (Night): " + nightMins);
System.out.println("Service minutes used (Day): " + dayMins);
System.out.println("Amount charged: $" + pChargeForm);
}		

if (dayMins < freePremDayMins && nightMins < freePremNightMins) {
premCharge = premFee;
pChargeForm = String.format("%.2f", premCharge); //formatting the decimal to two places
System.out.println("Name: " + name);
System.out.println("Account number: " + accountNum);
System.out.println("Service type: " + capService);
System.out.println("Service minutes used (Night): " + nightMins);
System.out.println("Service minutes used (Day): " + dayMins);
System.out.println("Amount charged: $" + pChargeForm);
}

if (dayMins > freePremDayMins && nightMins < freePremNightMins) {
premCharge = premFee + (dayMins - freePremDayMins) * 0.10;
pChargeForm = String.format("%.2f", premCharge); //formatting the decimal to two places
System.out.println("Name: " + name);
System.out.println("Account number: " + accountNum);
System.out.println("Service type: " + capService);
System.out.println("Service minutes used (Night): " + nightMins);
System.out.println("Service minutes used (Day): " + dayMins);
System.out.println("Amount charged: $" + pChargeForm);
}

if (dayMins < freePremDayMins && nightMins > freePremNightMins) {
premCharge = premFee + (nightMins - freePremNightMins) * 0.05;
pChargeForm = String.format("%.2f", premCharge); //formatting the decimal to two places
System.out.println("Name: " + name);
System.out.println("Account number: " + accountNum);
System.out.println("Service type: " + capService);
System.out.println("Service minutes used (Night): " + nightMins);
System.out.println("Service minutes used (Day): " + dayMins);
System.out.println("Amount charged: $" + pChargeForm);
}

} //first "if" statement's bracket

else if (service.equalsIgnoreCase(reg)) { //ignoring case sensitive
System.out.print("How many day minutes did you use? (No decimals) ");
dayMins = console.nextInt();

if (dayMins > freeRegMins) {
regCharge = regFee + (dayMins - freeRegMins) * 0.20;
rChargeForm = String.format("%.2f", regCharge); //formatting the decimal to two places
System.out.println("Name: " + name);
System.out.println("Account number: " + accountNum);
System.out.println("Service type: " + capService);
System.out.println("Service minutes used: " + dayMins);
System.out.println("Amount charged: $" + rChargeForm);
}
if (dayMins < freeRegMins) {
regCharge = regFee;
rChargeForm = String.format("%.2f", regCharge); //formatting the decimal to two places
System.out.println("Name: " + name);
System.out.println("Account number: " + accountNum);
System.out.println("Service type: " + capService);
System.out.println("Service minutes used: " + dayMins);
System.out.println("Amount charged: $" + rChargeForm);
}

} //first "else if" statements bracket

else
	System.out.println("Service type INVALID. Please try again.");
		
console.close(); //closing the console

	} //end of main method

} //end of public class
