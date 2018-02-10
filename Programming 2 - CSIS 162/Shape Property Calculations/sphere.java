/*
 * Brady Lange
 * CSIS 162 Programming
 * Program #1 
 * Class holds the area, volume, circumference, and radius of a sphere.
 */

public class sphere { //start of sphere class
	
	public double area, volume, circumference, radius;
	
	public sphere() //default constructor
	{
		radius = 0;
	}
	
	public sphere(double rad) //alternate constructor
	{
		radius = rad;
	}
	
	public void calcArea() //area calculation method
	{
		area = 	4 * Math.PI * (radius * radius);
	}
	
	public void calcVolume() //volume calculation method
	{
		volume = 	(4/3.0) * Math.PI * (radius * radius * radius);
	}
	
	public void calcCircum() //cirumference calcultion method
	{
		circumference = 2 * Math.PI * radius;
	}
	
	public void setSphRad(double rad) //setter method
	{
		radius = rad;
	}
	
	public double getSphRad() //getter method
	{
		return radius;
	}
	
	public double getSphArea() //getter method
	{
		return area;
	}
	
	public double getSphCircum() //getter method
	{
		return circumference;
	}
	
	public double getSphVol() //getter method
	{
		return volume;
	}
	
	public String toString() //toString method
	{
		String data = "Circumference = " + circumference + " Area = " + area + " Volume = " + volume + " Radius: " + radius;
		return data;
	}
	
} //end of sphere class
