/*
 * Brady Lange
 * CSIS 162 Programming
 * Program #1
 * Class holds the area, volume, perimeter, base, height, depth, side two, and side three of a triangular prism.
 */

public class triangularPrism { //start of triangularPrism class
	
	public double area, volume, perimeter, base, height, depth, side2, side3;
	
	public triangularPrism() //default constructor
	{
		base = 0;
		side2 = 0;
		side3 = 0;
		height = 0;
		depth = 0;
	}
	
	public triangularPrism(double bas, double sid2, double sid3, double hei, double dep) //alternate constructor
	{
		base = bas;
		side2 = sid2;
		side3 = sid3;
		height = hei;
		depth = dep;
	}
	
	public void calcArea() //area calculation method
	{
		area = (((base * depth) / 2.0) * 2) + (base * height) + (height * side2) + (height * side3);
	}
	
	public void calcVolume() //volume calculation method
	{
		volume = ((base * depth) / 2.0) * height;
	}
	
	public void calcPerimeter() //perimeter calculation method
	{
		perimeter = 2 * area + (base + side2 + side3) * height;
	}
	
	//Base Setter
	public void setTriPrismBase(double bas)
	{
		base = bas;
	}
	
	//Side2 Setter 
	public void setTriPrismSid2(double sid2)
	{
		side2 = sid2;
	}
	
	//Side3 Setter
	public void setTriPrismSid3(double sid3)
	{
		side3 = sid3;
	}
	
	//Depth Setter
	public void setTriPrismDep(double dep)
	{
		depth = dep;
	}
	
	//Height Setter
	public void setTriPrismHei(double hei)
	{
		height = hei;
	}
	
	//Base Getter
	public double getTriPrismBase()
	{
		return base;
	}
	
	//Side2 Getter
	public double getTriPrismSid2()
	{
		return side2;
	}
	
	//Side3 Getter
	public double getTriPrismSid3()
	{
		return side3;
	}
	
	//Depth Getter
	public double getTriPrismDep()
	{
		return depth;
	}
	
	//Height Getter
	public double getTriPrismHei()
	{
		return height;
	}
	
	public double getTriPrismArea() //getter method
	{
		return area;
	}
	
	public double getTriPrismPeri() //getter method
	{
		return perimeter;
	}
	
	public double getTriPrismVol() //getter method
	{
		return volume;
	}
	
	//toString Method
	public String toString()
	{
		String data = "Perimeter = " + perimeter + " Area = " + area + " Volume = " + volume + " Base: " + base + " Height: " + height + " Depth: " + depth + " Side 2: " + side2 + " Side 3: " + side3;
		return data;
	}
	
} //end of triangularPrism class
