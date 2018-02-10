/*
 * Brady Lange
 * CSIS 162 Programming
 * Progam #1
 * Class that holds the area, circumference, volume, height, radius, and side of a cone.
 */

public class cone { //start of cone class
	
	public double area, circumference, volume, height, radius, side;
	
	public cone() //default constructor
	{
		radius = 0;
		side = 0;
		height = 0;
	}

	public cone(double hei, double sid, double rad) //alternate constructor 
	{
		radius = rad;
		side = sid;
		height = hei;
	}

	public void calcArea() //area calculation method
	{
		area = Math.PI * radius * side;
	}

	public void calcCircum() //circumference calculation method
	{
		circumference = 2 * Math.PI * radius;
	}

	public void calcVolume() //volume calculation method
	{
		volume = (1/3.0) * Math.PI * (radius * radius) * height;
	}
	
	public void setConeRad(double rad) //setter method
	{
		radius = rad;
	}

	public void setConeSide(double sid) //setter method
	{
		side = sid;
	}

	public void setConeHeight(double hei) //setter method
	{
		height = hei;
	}
	
	public double getConeRad() //getter method
	{
		return radius;
	}

	public double getConeHeight() //getter method
	{
		return height;
	}

	public double getConeSide() //getter method
	{
		return side;
	}
	
	public double getConeArea() //getter method
	{
		return area;
	}
	
	public double getConeCircum() //getter method
	{
		return circumference;
	}
	
	public double getConeVol() //getter method
	{
		return volume;
	}
	
	public String toString() //toString method
	{
		String data = "Circumference = " + circumference + " Area = " + area + " Volume = " + volume + " Height: " + height + " Radius: " + radius + " Side: " + side;
		return data;
	}

} //end of cone class
