/*
 * Brady Lange
 * CSIS 161 Programming
 * Program #3
 * Section: 02
 * Meets: M,W, & F at 1:00 PM to 1:50 PM.
 * This program calculates the users age on other planets than Earth in our Solar System such as Jupiter, Venus, Mercury, and Saturn.
 */

import javax.swing.*; //importing already coded code to make it easier for me, used for the dialog box

public class ageOnPlanets { //start of public class

	public static void main(String[] args) { //main method

		//Declaring Variables
		final int earthOrbit = 365; //number won't change because it's final, earth's orbit around the sun
		double earthAge; //User's Earth age
		double ageOnEarth; //Age if on Earth
		String name; //users name

		//Mercury variables
		final int mercuryOrbit = 88; //number won't change because it's final, Mercury's orbit around the sun
		double mercuryAge; //Age if on Mercury

		//Venus variables
		final int venusOrbit = 225; //number won't change because it's final, Venus's orbit around the sun
		double venusAge; //Age if on Venus

		//Jupiter variables
		final int jupiterOrbit = 4380; //number won't change because it's final, Jupiter's orbit around the sun
		double jupiterAge; //Age if on Jupiter

		//Saturn variables
		final int saturnOrbit = 10767; //number won't change because it's final, Saturn's orbit around the sun
		double saturnAge; //Age if on Saturn

		//Output for all planets for the output dialog box
		String agePlanetsOutput;

		//Asking user for input
		name = 
		JOptionPane.showInputDialog("What is your name?");
		String earthageStr = 
		JOptionPane.showInputDialog("What is your age?");
		earthAge = Integer.parseInt(earthageStr); //converting from string to integer

		//Calculations (age on planet = earth age * earth's orbit / planets orbit)
		ageOnEarth = earthAge * earthOrbit / earthOrbit;
		mercuryAge = earthAge * earthOrbit / mercuryOrbit;
		venusAge = earthAge * earthOrbit / venusOrbit;
		jupiterAge = earthAge * earthOrbit / jupiterOrbit;
		saturnAge = earthAge * earthOrbit / saturnOrbit;

		//Formatting to only 2 decimal places
		String earthAgeFormatted = String.format("%.2f", ageOnEarth);
		String mercuryAgeFormatted = String.format("%.2f", mercuryAge);
		String venusAgeFormatted = String.format("%.2f", venusAge);
		String jupiterAgeFormatted = String.format("%.2f", jupiterAge);
		String saturnAgeFormatted = String.format("%.2f", saturnAge);

		//Storing output into a String
		agePlanetsOutput = name + " is " + earthAgeFormatted + " years old on Earth and much older on Mercury with " + 
		mercuryAgeFormatted + " years. \nYou are a little bit older on Venus with " + venusAgeFormatted + " years, but very young on Jupiter with\n" + jupiterAgeFormatted +
		" years and even more young on Saturn with " + saturnAgeFormatted + " years."; //I don't have to create multiple programs for these statements just this one and saves me time

		//Putting output in output dialog box
		JOptionPane.showMessageDialog(null, agePlanetsOutput);

	} //end of main method

} //end of public class
