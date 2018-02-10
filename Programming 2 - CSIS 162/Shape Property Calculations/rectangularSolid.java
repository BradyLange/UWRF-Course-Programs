/*
 * Brady Lange
 * CSIS 162 Programming
 * Program #1
 * Class that holds the area, volume, perimeter, length, width, and height of a rectangular solid.
 */

public class rectangularSolid {

	public double area, volume, perimeter, length, width, height;
	
	public rectangularSolid() //default constructor
	{
		length = 0; 
		width = 0;
		height = 0;
	}
	
	public rectangularSolid(double len, double wid, double hei) //alternate constructor 
	{
		length = len;
		width = wid;
		height = hei;
	}
	
	public void calcArea() //area calculation method
	{
		area = 2 * (width * length + height * length + height * width);
	}
	
	public void calcVolume() //volume calculation method
	{
		volume = length * width * height;
	}
	
	public void calcPerimeter() //perimeter calculation method
	{
		perimeter = 2 * width + 2 * length;
	}
	
	public void setRecSolLen(double len) //setter method
	{
		length = len;
	}
	
	public void setRecSolWid(double wid) //setter method
	{
		width = wid;
	}
	
	public void setRecSolHei(double hei) //setter method
	{
		height = hei;
	}
	
	public double getRecSolLen() //getter method
	{
		return length;
	}
	
	public double getRecSolWid() //getter method
	{
		return width;
	}
	
	public double getRecSolHei() //getter method
	{
		return height;
	}
	
	public double getRecSolArea() //getter method
	{
		return area;
	}
	
	public double getRecSolPeri() //getter method
	{
		return perimeter;
	}
	
	public double getRecSolVol() //getter method
	{
		return volume;
	}
	
	public String toString() //toString method
	{
		String data = "Perimeter =  " + perimeter + " Area = " + area + " Length: " + length + " Width: " + width + " Height: " + height;
		return data;
	}
	
} //end of rectangular solid class
