
public class trapezoid { //start of trapezoid class
	public double base1, base2, height, leftSide, rightSide, area, perimeter;

	public trapezoid() //default constructor
	{
		base1 = 0;
		base2 = 0;
		height = 0;
		leftSide = 0;
		rightSide = 0;
	}

	public trapezoid(double bas1, double bas2, double hei, double lside, double rside) //alternate constructor
	{
		base1 = bas1;
		base2 = bas2;
		height = hei;
		leftSide = lside;
		rightSide = rside;
	}
	
	public void calcArea() //area calculation method
	{
		area = ((base1 + base2) / 2) * height;
	}

	public void calcPerimeter() //perimeter calculation method
	{
		perimeter = base1 + base2 + leftSide + rightSide;
	}

	public void setTrapBase1(double bas1) //setter method
	{
		base1 = bas1;
	}
	
	public void setTrapBase2(double bas2) //setter method
	{
		base2 = bas2;
	}

	public void setTrapHeight(double hei) //setter method
	{
		height = hei;
	}

	public void setTrapLeftSide(double lside) //setter method
	{
		leftSide = lside;
	}

	public void setTrapRightSide(double rside) //setter method
	{
		rightSide = rside;
	}

	public double getTrapBase1() //getter method
	{
		return base1;
	}

	public double getTrapBase2() //getter method
	{
		return base2;
	}

	public double getTrapHeight() //getter method
	{
		return height;
	}

	public double getTrapLeftSide() //getter method
	{
		return leftSide;
	}

	public double getTrapRightSide() //getter method
	{
		return rightSide;
	}
	
	public double getTrapArea() //getter method
	{
		return area;
	}
	
	public double getTrapPeri() //getter method
	{
		return perimeter;
	}
	
	public String toString() //toString method
	{
		String data = "Perimeter: " + perimeter + " Area: " + area + " Base 1: " + base1 + " Base 2: " + base2 + " Height: " + height + " Left Side: " + leftSide + " Right Side: " + rightSide;
		return data;
	}

} //end of trapezoid class
