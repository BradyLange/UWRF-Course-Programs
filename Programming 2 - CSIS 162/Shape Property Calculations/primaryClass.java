/*
 * Main class - driver class
 * Brady Lange
 * CSIS 162 Programming
 * Program #1
 * Due Date: 02/13/17
 * Program that calculates the area, perimeter, and volume of various different shapes using methods.
 */

public class primaryClass { //start of primaryClass

	public static void main(String [] args) { //start of main method
	
		//RECTANGLE
		//Default Constructor
		rectangle data = new rectangle();
		System.out.println("Rectangle DEFAULT CONSTRUCTOR: " + data);
		
		//Length Setter
		data.setRectangleLen(30); //changing the default constructors null values using the setter method
		double newLength = data.getRectangleLen(); //testing one setter/getter for each constructor to see if the program is working properly
		System.out.println("Rectangle SETTER changing DEFAULT CONSTRUCTOR length: " + newLength);
		
		//Width Setter
		data.setRectangleWid(10);
		
		//Calculations
		data.calcArea(); //area method
		data.calcPerimeter(); //perimeter method
		System.out.println("Rectangle " + data);
		
		//TESTING FOR THE SHAPE SQUARE
		//Length Setter
		data.setRectangleLen(15);
		
		//Width Setter
		data.setRectangleWid(15);
		
		//Square Calculations
		data.calcArea();
		data.calcPerimeter();
		System.out.println("Square: " + data);
		
		//Alternate Constructor
		rectangle data2 = new rectangle(20, 6);
		data2.calcArea();		
		data2.calcPerimeter();
		System.out.println("Rectangle ALTERNATE CONSTRUCTOR: " + data2);
				
		//Area Getter
		double a = data2.getRectangleArea(); //getting the area with the getter method
		System.out.println("Rectangle GETTER getting ALTERNATE CONSTRUCTOR area: " + a);
		
		//PARALELLOGRAM
		//Default Constructor
		parallelogram data3 = new parallelogram();
		System.out.println("Parallelogram DEFAULT CONSTRUCTOR: " + data3);
		
		//Base Setter
		data3.setParalBase(60); //changing the default constructors null values using the setter method
		double newBase = data3.getParalBase(); //getting the alternate constructors data with the getter method
		System.out.println("Parallelogram SETTER changing DEFAULT CONSTRUCTOR base: " + newBase);
				
		//Height Setter
		data3.setParalHeight(40);
		
		//Calculations
		data3.calcArea();
		data3.calcPerimeter();
		System.out.println("Parallelogram " + data3);
		
		//Alternate Constructor
		parallelogram data4 = new parallelogram(12, 6); 
		data4.calcArea();
		data4.calcPerimeter();
		System.out.println("Parallelogram ALTERNATE CONSTRUCTOR: " + data4);
		
		//Height Getter
		double newHeight = data4.getParalHeight();
		System.out.println("Parallelogram GETTER getting ALTERNATE CONSTRUCTOR height: " + newHeight);
		
		//TRIANGLE
		//Default Constructor
		triangle data5 = new triangle(); 
		System.out.println("Triangle DEFAULT CONSTRUCTOR: " + data5);
		
		//Base Setter
		data5.setTriBase(40);
		double newBase2 = data5.getTriBase();
		System.out.println("Triangle SETTER changing DEFAULT CONSTRUCTOR base: " + newBase2);
		
		//Height Setter
		data5.setTriHeight(23);
		
		//Side Setter
		data5.setTriSide(32);
		
		//Calculations
		data5.calcArea();
		data5.calcPerimeter();
		System.out.println("Triangle " + data5);
		
		//Alternate Constructor
		triangle data6 = new triangle(35, 21, 56);
		data6.calcArea();
		data6.calcPerimeter();
		System.out.println("Triangle ALTERNATE CONSTRUCTOR: " + data6);
		
		//Height Getter
		double newHeight2 = data6.getTriHeight();
		System.out.println("Triangle GETTER getting ALTERNATE CONSTRUCTOR height: " + newHeight2);
		
		//TRAPZOID
		//Default Constructor
		trapezoid data7 = new trapezoid(); 
		System.out.println("Trapezoid DEFAULT CONSTRUCTOR: " + data7);
		
		//Base1 Setter
		data7.setTrapBase1(12);
		double base3 = data7.getTrapBase1();
		System.out.println("Trapezoid SETTER changing DEFAULT CONSTRUCTOR base1: " + base3);
		
		//Base2 Setter 
		data7.setTrapBase2(20);
		
		//Left Side Setter
		data7.setTrapLeftSide(22);
		
		//Right Side Setter
		data7.setTrapRightSide(10);
		
		//Height Setter
		data7.setTrapHeight(21);
		
		//Calculations
		data7.calcArea();
		data7.calcPerimeter();
		System.out.println("Trapezoid " + data7);
		
		//Alternate Constructor
		trapezoid data8 = new trapezoid(10, 8, 9, 12, 15);
		data8.calcArea();
		data8.calcPerimeter();
		System.out.println("Trapezoid ALTERNATE CONSTRUCTOR: " + data8);
		
		//Height Getter
		double newHeight3 = data8.getTrapHeight();
		System.out.println("Trapezoid GETTER getting ALTERNATE CONSTRUCTOR height: " + newHeight3);
		
		//CIRCLE
		//Default Constructor
		circle data9 = new circle(); 
		System.out.println("Circle DEFAULT CONSTRUCTOR: " + data9);
		
		//Diameter Setter
		data9.setCircleDiam(20);
		double newDiameter = data9.getCircleDiam();
		System.out.println("Circle SETTER changing DEFAULT CONSTRUCTOR diameter: " + newDiameter);
		
		//Radius Setter
		data9.setCircleRadius(10);
		
		//Calculations
		data9.calcArea();
		data9.calcCircum(); //circumference method
		System.out.println("Circle " + data9);
		
		//Alternate Constructor
		circle data10 = new circle(5, 10);
		data10.calcArea();
		data10.calcCircum();
		System.out.println("Circle ALTERNATE CONSTRUCTOR: " + data10);
		
		//Radius Getter
		double newRadius = data10.getCircleRadius();
		System.out.println("Circle GETTER getting ALTERNATE CONSTRUCTOR radius: " + newRadius);
		
		//RECTANGULAR SOLID
		//Default Constructor
		rectangularSolid data11 = new rectangularSolid(); 
		System.out.println("Rectangular Solid DEFAULT CONSTRUCTOR: " + data11);
		
		//Height Setter
		data11.setRecSolHei(56);
		double newHeight4 = data11.getRecSolHei();
		System.out.println("Rectangular Solid SETTER changing DEFAULT CONSTRUCTOR height: " + newHeight4);
		
		//Length Setter
		data11.setRecSolLen(45);
		
		//Width Setter
		data11.setRecSolWid(33);
		
		//Calculations
		data11.calcArea();
		data11.calcPerimeter();
		data11.calcVolume(); //volume method
		System.out.println("Rectangular Solid " + data11);
		
		//Alternate Constructor
		rectangularSolid data12 = new rectangularSolid(100, 77, 88); 
		data12.calcArea();
		data12.calcPerimeter();
		data12.calcVolume();
		System.out.println("Rectangular Solid ALTERNATE CONSTRUCTOR: " + data12);
		
		//Length Getter
		double newLength4 = data12.getRecSolLen();
		System.out.println("Rectangular GETTER getting ALTERNATE CONSTRUCTOR: " + newLength4);
		
		//TRIANGULAR PRISM
		//Default Constructor
		triangularPrism data13 = new triangularPrism(); 
		System.out.println("Triangular Prism DEFAULT CONSTRUCTOR: " + data13);
		
		//Base Setter
		data13.setTriPrismBase(67);
		double newBase5 = data13.getTriPrismBase();
		System.out.println("Triangular Prism SETTER changing DEFAULT CONSTRUCTOR: " + newBase5);
		
		//Side 2 Setter
		data13.setTriPrismSid2(89);
		
		//Side 3 Setter
		data13.setTriPrismSid3(44);
		
		//Depth Setter
		data13.setTriPrismDep(25);
		
		//Height Setter
		data13.setTriPrismHei(45);
		
		//Calculations
		data13.calcArea();
		data13.calcPerimeter();
		data13.calcVolume();
		System.out.println("Triangular Prism: " + data13);
		
		//Alternate Constructor
		triangularPrism data14 = new triangularPrism(5, 10, 17, 19, 27);
		data14.calcArea();
		data14.calcPerimeter();
		data14.calcVolume();
		System.out.println("Triangular Prism ALTERNATE CONSTRUCTOR: " + data14);
	
		//Side 2 Getter
		double newSide2Five = data14.getTriPrismSid2();
		System.out.println("Triangular Prism GETTER getting ALTERNATE CONSTRUCTOR side 2: " + newSide2Five);
		
		//CYLINDER
		//Default Constructor
		cylinder data15 = new cylinder();
		System.out.println("Cylinder DEFAULT CONSTRUCTOR: " + data15);
		
		//Radius Setter
		data15.setCylinRad(21);
		double newRadius6 = data15.getCylinRad();
		System.out.println("Cylinder SETTER changing DEFAULT CONSTRUCTOR radius: " + newRadius6);
		
		//Height Setter
		data15.setCylinHei(18);
		
		//Calculations
		data15.calcArea();
		data15.calcCircum();
		data15.calcVolume();
		System.out.println("Cylinder: " + data15);
		
		//Alternate Constructor
		cylinder data16 = new cylinder(17, 31);
		data16.calcArea();
		data16.calcCircum();
		data16.calcVolume();
		System.out.println("Cylinder ALTERNATE CONSTRUCTOR: ");
	
		//Height Getter
		double newHeight6 = data16.getCylinHei();
		System.out.println("Cylinder GETTER getting ALTERNATE CONSTRUCTOR height: " + newHeight6);
		
		//CONE
		//Default Constructor
		cone data17 = new cone(); 
		System.out.println("Cone DEFAULT CONSTRUCTOR: " + data17);
		
		//Radius Setter
		data17.setConeRad(7);
		double newRadius7 = data17.getConeRad();
		System.out.println("Cone SETTER changing DEFAULT CONSTRUCTOR radius: " + newRadius7);
		
		//Height Setter
		data17.setConeHeight(10);
		
		//Side Setter
		data17.setConeSide(5);
		
		//Calculations
		data17.calcArea();
		data17.calcCircum();
		data17.calcVolume();
		System.out.println("Cone: " + data17);
		
		//Alternate Constructor
		cone data18 = new cone(12, 20, 11);
		data18.calcVolume();
		data18.calcArea();
		data18.calcCircum();
		System.out.println("Cone ALTERNATE CONSTRUCTOR: " + data18);
		
		//Height Getter
		double newHeight7 = data18.getConeHeight();
		System.out.println("Cone GETTER getting ALTERNATE CONSTRUCTOR height: " + newHeight7);
	
		//SPHERE
		//Default Constructor
		sphere data19 = new sphere(); 
		System.out.println("Sphere DEFAULT CONSTRUCTOR: " + data19);
		
		//Radius Setter
		data19.setSphRad(77);
		double newRadius8 = data19.getSphRad();
		System.out.println("Sphere SETTER changing DEFAULT CONSTRUCTOR radius: " + newRadius8);
		
		//Calculations
		data19.calcArea();
		data19.calcCircum();
		data19.calcVolume();
		System.out.println("Sphere: " + data19);
		
		//Alternate Constructor
		sphere data20 = new sphere(10); 
		data20.calcArea();
		data20.calcCircum();
		data20.calcVolume();
		System.out.println("Sphere ALTERNATE CONSTRUCTOR: " + data20);
		
		//Radius Getter
		double newRadius9 = data20.getSphRad();
		System.out.println("Sphere GETTER getting ALTERNATE CONSTRUCTOR radius: " + newRadius9);
		
	} //end of main method
	
} //end of primaryClass
