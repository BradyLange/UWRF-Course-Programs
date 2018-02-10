/*
 * Brady Lange
 * CSIS 162 Programming 
 * Program #1
 * Class that stores the area, volume, circumference, radius, and height of a cylinder.
 */

public class cylinder { //start of cylinder class
	
	public double area, volume, circumference, radius, height;

	public cylinder() //default constructor
	{
		radius = 0;
		height = 0;
	}

	public cylinder(double rad, double hei) //alternate constructor 
	{
		radius = rad;
		height = hei;
	}

	public void calcArea() //area calculation method
	{
		area = ((Math.PI * (radius* radius)) * 2) + ((2 * Math.PI * radius) * height);
	}

	public void calcCircum() //circumference calculation method
	{
		circumference = 2 * Math.PI * radius;
	}

	public void calcVolume() //volume calculation method
	{
		volume = Math.PI * (radius * radius) * height;
	}

	public void setCylinRad(double rad) //setter method
	{
		radius = rad;
	}

	public void setCylinHei(double hei) //setter method
	{
		height = hei;
	}

	public double getCylinRad() //getter method
	{
		return radius;
	}

	public double getCylinHei() //getter method
	{
		return height;
	}
	
	public double getCylinArea() //getter method
	{
		return area;
	}
	
	public double getCylinCircum() //getter method
	{
		return circumference;
	}

	public double getCylinVol() //getter method
	{
		return volume;
	}
	
	public String toString() //toString method
	{
		String data = "Circumference = " + circumference + " Area = " + area + " Volume = " + volume + " Radius: " + radius  + " Height: " + height;
		return data;
	}

} //end of cylinder class
