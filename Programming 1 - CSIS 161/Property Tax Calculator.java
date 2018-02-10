/*
 * Brady Lange
 * CSIS 161 Programming
 * Section: 02
 * Meets: M,W, & F at 1:00 PM to 1:50 PM.
 * This program calculates property tax.
 */

import javax.swing.*; //importing already coded code to make it easier for me, used for the dialog box
public class propertyTax { //start of public class

	public static void main(String[] args) { //start of main method

//Declaring variables
String name;
final double taxRate = 1.05;
double propTax;
final double taxPerc = 0.92;
double taxAmount;
double assValue;
String assValStr; //string for dialog box
String sign = "$";

//Output variable for dialog box
//String finalOutput;

//Asking user for input
name = 
JOptionPane.showInputDialog("What is your name?");
assValStr = 
JOptionPane.showInputDialog("What is your property's assessed value?");
assValue = Double.parseDouble(assValStr); //converting from string to double

//Calculations
taxAmount = assValue * taxPerc;
propTax = taxAmount / 100 * taxRate;

//I am not sure how to use put "print f" statements in the dialog box and you said we have to use the "print f" statements
//Below I have the output dialog box style
//Formatting to only 2 decimal places and lining them up with spaces
//String nameForm = String.format("%15s", name);
//String assValueForm = String.format("%19s%15.2f", sign, assValue);
//String taxAmountForm = String.format("%19s%15.2f", sign, taxAmount);
//String propTaxForm = String.format("%25s%15.2f", sign, propTax);
//String taxRateForm = String.format("%6s%15.2f", sign, taxRate);

//Printf statements for output 
System.out.println("Property Tax");
System.out.println("Name: " + name);
System.out.printf("Assessed Value:%20s%15.2f%n", sign, assValue);
System.out.printf("Taxable Amount:%20s%15.2f%n" , sign, taxAmount);
System.out.printf("Tax Rate for each $100:%12s%15.2f%n", sign, taxRate);
System.out.printf("Property Tax:%22s%15.2f%n", sign, propTax);
				
	} //end of main method

} //end of public class
