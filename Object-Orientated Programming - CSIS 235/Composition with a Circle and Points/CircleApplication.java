/* 
 * Brady Lange 
 * Object Oriented Programming 235
 * This program uses composition (has-a relationship) to make a center of a circle.
 */
public class TestCircle { //start of TestCircle class

	public static void main(String[] args) { //start of main method
		
		//creating a circle with values
		Circle shape1 = new Circle(1.0, 0,0);
		//calculating the area of the circle
		double calcArea = shape1.calcArea();
		String sCalcArea = String.format("%.2f", calcArea); //formatting the area to only two decimal spots
		Point center = shape1.getCenter();
		//printing the area and the center of the circle
		System.out.println("Circle's Area: " + sCalcArea + "\nCircle's Center: " + center);
		//moving the center of the circle
		Point movePoint = new Point(-3,6);
		shape1.move(movePoint);
		//resizing the radius of the circle
		shape1.resize(0.50);
		//calculating the new area of the circle
		double newArea = shape1.calcArea();
		String sNewArea = String.format("%.2f", newArea);
		//printing the area and the center of the circle
		System.out.println();
		System.out.println("Circle's New Area: " + sNewArea + "\nCircle's New Center: " + shape1.getCenter());
		

	} //end of main method

} //end of TestCircle class
