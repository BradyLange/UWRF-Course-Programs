/*
 * Brady Lange
 * CSIS 162 Programming
 * Program #1 
 * Class holds the area, perimeter, height, base, and side of a triangle.
 */

public class triangle { //start of triangle class
	
	public double area;
	public double perimeter;
	public double height;
	public double base;
	public double side;

	public triangle() //default constructor
	{ //start of triangle default constructor
		base = 0; //setting variables to null values since its default
		height = 0; 
	} //end of triangle default constructor

	public triangle(double bas, double hei, double sid) //alternate constructor
	{
		base = bas;
		height = hei;
		side = sid;
	}

	public void calcArea() //area calculation method
	{
		area = (1/2.0 * base) * height;
	}

	public void calcPerimeter() //perimeter calculation method
	{
		perimeter = base + height + side;
	}

	public void setTriHeight(double hei) //setter method
	{
		height = hei;
	}

	public void setTriBase(double bas) //setter method
	{
		base = bas;
	}

	public void setTriSide(double sid) //setter method
	{
		side = sid;
	}

	public double getTriHeight() //getter method
	{
		return height;
	}

	public double getTriBase() //getter method
	{
		return base;
	}

	public double getTriSide() //getter method
	{
		return side;
	}

	public double getTriArea() //getter method
	{
		return area;
	}

	public double getTriPeri() //getter method
	{
		return perimeter;
	}

	public String toString() //toString method
	{
		String data = "Perimeter = " + perimeter + " Area = " + area + " Height: " + height + " Base: " + base + " Side: " + side;
		return data;
	}

} //end of triangle class
