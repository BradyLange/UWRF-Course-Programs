//This class is used to be a variable for the Circle class.

public class Point { //start of Point class

	//class variables
	private int x, y;
	
	//default constructor
	public Point()
	{ //start of default constructor
		x = 0;
		y = 0;
	} //end of default constructor
	
	//alternate constructor
	public Point(int x, int y)
	{ //start of alternate constructor
		this.x = x;
		this.y = y;
	} //end of alternate constructor

	//copy constructor
	public Point(Point obj)
	{ //start of copy constructor
		this.x = obj.x;
		this.y = obj.y;
	} //end of copy constructor
	
	//setters
	public void setx(int x)
	{
		this.x = x;
	} //end of setx
	
	public void sety(int y)
	{
		this.y = y;
	} //end of sety
	
	public void setxy(int x, int y)
	{
		this.x = x;
		this.y = y;
	} //end of setxy
	
	//getters
	public double getx()
	{
		return x;
	} //end of getx
	
	public double gety()
	{
		return y;
	} //end of gety
	
	public Point getxy()
	{
		Point newPoint = new Point(x,y);
		return newPoint; 
	} //end of getxy
	
	
	
	//toString
	public String toString()
	{
		String data = "(" + x + "," + y + ")";
		return data;
	} //end of toString
	
	
	
	
	
	
	
	
	
	
	
	
	
} //end of Point class
