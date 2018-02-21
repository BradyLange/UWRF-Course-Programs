//This class creates a circle object using a has-a relationship for one of its variables.

public class Circle { //start of the class Circle
	//class variables
	private double radius;
	//has-a relationship
	private Point center;
	
	//default constructor
	public Circle()
	{ //start of default constructor
		radius = 0;
		center = new Point();
	} //end of default constructor

	//alternate constructor
	public Circle(double rad, int x, int y)
	{ //start of alternate constructor
		center = new Point(x,y);
		radius = rad;
	} //end of alternate constructor
	
	//copy constructor
	public Circle(Circle obj)
	{ //start of circle copy constructor
		this.radius = obj.radius;
		this.center = obj.center;
	} //end of circle copy constructor
	
	//setters
	public void setRadius(double rad)
	{ //start of setRadius method
		radius = rad;
	} //end of setRadius method
	
	public void setCenter(int x, int y)
	{ //start of setCenter method
		Point newPoint = new Point(x,y);
		center = newPoint;
	} //end of setCenter method
	
	//getters
	public double getRadius()
	{ //start of getRadius method
		return radius;
	} //end of getRadius method
	
	public Point getCenter()
	{ //start of getCenter method
		return center;
	} //end of getCenter method
	
	//toString method
	public String toString()
	{ //start of toString method
		String data = "Radius = " + radius + "\nCenter = " + center;
		return data;
	} //end of toString method
	
	//other methods
	//area calculation
	public double calcArea()
	{ //start of calcArea method
		double calc = radius * radius * Math.PI;
		return calc;
	} //end of calcArea method
	
	//move the center of the circle
	public void move(Point cen)
	{ //start of move method
		center = cen;
	} //end of move method
	
	//resizing the radius
	public void resize(double size)
	{ //start of resize method
		radius = (radius * size);
	} //end of resize method
} //end of Circle class
