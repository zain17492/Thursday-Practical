/*Create a class named "Rectangle" with two data member 'lenght' and'breadth' and two
 *methods to print the area and perimeter of the rectangle respectively.Its constructor 
 *having parameters for length and breadth of the rectangle.print the area and perimeter
 *of a rectangle*/
package Practical;

class Rectangle 
{
	
	double length;
	double breadth;
	
	public Rectangle(double length, double breadth) //constructor
	{
		this.length = length;
		this.breadth = breadth;
	}
	
	

	public void area() //Create Method
	{
		System.out.println("Area of rectangle is:- " +breadth*length);
	}
	
	public void perimeter() //Create Method
	{
		System.out.println("Perimerter of rectangle is:- " +2*(breadth + length));
	}
}


public class Main_Rectangle {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(5, 5);  //Parameterized constructor is called
		r1.area(); //calling method
		r1.perimeter(); //calling method

	}

}
