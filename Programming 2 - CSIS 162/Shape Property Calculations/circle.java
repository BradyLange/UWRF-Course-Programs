/*
 * Brady Lange
 * CSIS 162 Programming
 * Program #1
 * Class that holds the radius, diameter, area, and circumference of a circle.
 */

public class circle { //start of circle class
	
	public double radius, diameter, area, circumference;
	
	public circle() //default constructor
	{
		radius = 0;
		diameter = 0;
	}

	public circle(double radi, double diam) //alternate constructor
	{
		radius = radi;
		diameter = diam;
	}

	public void calcArea() //area calculation method
	{
		area = Math.PI * (radius * radius);
	}
	
	public void calcCircum() //circumference calculation method
	{
		circumference = Math.PI * diameter;
	}

	public void setCircleDiam(double diam) //setter method
	{
		diameter = diam;
	}

	public void setCircleRadius(double radi) //setter method
	{
		radius = radi;
	}

	public double getCircleDiam() //getter method
	{
		return diameter;
	}

	public double getCircleRadius() //getter method
	{
		return radius;
	}
	
	public double getCircleArea() //getter method
	{
		return area;
	}

	public double getCircleCircum() //getter method
	{
		return circumference;
	}
	
	public String toString() //toString method
	{
		String data = " Circumference: " + circumference + " Area: " + area + " Area: " + area + " Radius: " + radius + " Diameter: " + diameter;
		return data;
	}

} //end of circle class
