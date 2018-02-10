
public class parallelogram { //start of parallelogram class
	public double base;
	public double height;
	public double area;
	public double perimeter;
	
public parallelogram() //default constructor
{ //start of default constructor parallelogram
	base = 0;
	height = 0;
} //end of default constructor parallelogram 

public parallelogram(double bas, double hei) //alternate constructor
{ //start of alternate constructor parallelogram
	base = bas;
	height = hei;
} //end of alternate constructor parallelogram

public void calcArea() //area calculation method
{
	area = base * height;
}

public void calcPerimeter() //perimeter calculation method
{
	perimeter = 2 * (base * height);
}

public void setParalHeight(double hei) //setter method
{
	height = hei;
}

public void setParalBase(double bas) //setter method
{
	base = bas;
}

public double getParalHeight() //getter method
{
	return height;
}

public double getParalBase() //getter method
{
	return base;
}

public double getParalArea() //getter method
{
	return area;
}

public double getParalPeri() //getter method
{
	return perimeter;
}

public String toString() //toString method
{
	String data = "Perimeter = " + perimeter + " Area = " + area + " Height: " + height + " Base: " + base;
	return data;
}

} //end of parallelogram class
