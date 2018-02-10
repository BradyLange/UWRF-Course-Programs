/*
 * Brady Lange
 * 9/24/16
 * This program displays information about River Falls, WI like it's location and population size.
 */
public class class1 {

	public static void main(String[] args) {
String myCity = "River Falls";
String myState = "Wisconsin";
String countyOne = "Pierce";
String countyTwo = "St. Croix";
int censusYear = 2010;
int population = 15000;
String cenBureau = "Census Bureau";
double ttlArea = 6.60;
double landArea = 6.52;
double waterArea = 0.08;
String river = "Kinnickinnic";
String uwrf = "University of Wisconsin-River Falls";
int sect = 2;

System.out.println(myCity + ", " + myState + ":\n");
System.out.println(myCity + " is a city in " + countyOne + " and " + countyTwo + " counties in the U.S. state of " + myState + ". As of the census of");
System.out.println(censusYear + ", there were " + population + " people.\n");
System.out.println("According to the United States " + cenBureau + ", the city has a total area of " + ttlArea + " square miles, of which,");
System.out.println(landArea + " square miles is land and " + waterArea + " square miles is water.\n");
System.out.println(myCity + " lies on the banks of the " + river + " River, The South Fork of the " + river + " River runs");
System.out.println("through the city, dividing the campus of the " + uwrf + " into " + sect + " sections.");



	}

}
