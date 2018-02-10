import java.util.*; //using already coded code for the inputs

public class myMathProgram { //start of myMathProgram class

	/*
	 * Brady Lange
	 * CSIS 161 Programming
	 * Section: 02
	 * Meets: M,W, & F at 1:00 PM to 1:50 PM.
   	 * This program calculates the area of math shapes such as a triangle, circle, square, and rectangle.
	 */
	
     public static void main(String[] args) { //start of main method
        Scanner console = new Scanner(System.in); //inputs

        //Declaring Variables
        //(1) Area of triangle variables
        double base; //base of triangle
        double height; //height of triangle
        double baseHalf = 0.5; //whatever value that is entered for base it will be half of that value according to the equation
        double triResult; //area of the triangle
        String triFormatted; //formatted the area of the triangle to be just 2 decimal places

        //(2) Area of circle variables
        double radius; //radius of circle
        double cirResult; //area of circle
        String cirFormatted; //formatted area of circle to be just 2 decimal places
        String pi; //using pi as a variable so I can format pi to just 2 decimal places as well

        //(3) Area of square variables
        int side; //side length of square
        int squResult; //area of circle

        //(4) Area of rectangle variables
        int width; //width of rectangle
        int length; //length of rectangle
        int rectResult; //area of the rectangle


        //Inputting base of triangle (1)
        System.out.print("What is the base of the triangle?");
        base=console.nextDouble();
        //Inputting height of triangle
        System.out.print("What is the height of the triangle?");
        height=console.nextDouble();
        //Calculation
        triResult = baseHalf * base * height;
        triFormatted = String.format("%.2f", triResult); //2 decimal places
        System.out.println("The area of the triangle with the base of " + base +" and the height of " + height +" is " + triFormatted + ".\n");

        //Inputting the radius of the circle (2)
        System.out.print("What is the radius of the circle?");
        radius=console.nextDouble();
        //Calculation
        cirResult = radius * radius * Math.PI; //using Math.PI in place of putting 3.14
        pi = String.format("%.2f", Math.PI); //using only 2 decimal places for PI
        cirFormatted = String.format("%.2f", cirResult); //2 decimal places 
        System.out.println("The area of the circle with the radius of " + radius + " and PI of " + pi + " is " + cirFormatted + ".\n");

        //Inputting the side of the square (3)
        System.out.print("What is the length of the side of the square? (no fractions)");
        side=console.nextInt();
        //Calculation
        squResult = side * side;
        System.out.println("The area of the square with the sides of " + side + " in length is " + squResult + ".\n");

        //Inputting the width of the rectangle (4)
        System.out.print("What is the width of the rectangle? (no fractions)");
        width=console.nextInt();
        //Inputting the length of the rectangle
        System.out.print("What is the length of the rectangle? (no fractions)");
        length=console.nextInt();
        //Calculation
        rectResult = width * length;
        System.out.println("The area of the rectangle with the width of " + width + " and length of " + length + " is " + rectResult + ".");

        console.close(); //closing the console to avoid possible error

     } //end of main method

} //end of myMathProgram class
