/*Create an abstract class called "Shape" with an abstract method called "calculateArea".
 * Create two subclasses called "Circle" and "Rectangle" that inherit from Shape and implement
 * the "calculateArea" method. Create objects of both Circle and Rectangle classes and call
 * their respective "calculatArea" methods.*/
package Practice_Program;

abstract class Shape //parent class and abstract class
{
   public abstract double calculateArea(); //abstract method
}

class Circle extends Shape //child class
{
	double radius;
	
	public Circle(double radius) 
	{
		this.radius = radius;
	}

	@Override
	public double calculateArea() 
	{
		//define body for abstract method
		return Math.PI *radius *radius;
	}

	
}

class Rectangle extends Shape //child class
{
    double width;
    double height;
    
	public Rectangle(double width, double height) 
	{
		this.width = width;
		this.height = height;
	}

	@Override
	public double calculateArea() 
	{
		//define body for abstract method
		return width * height;
	}	
}

public class Main_Abstract {

	public static void main(String[] args) 
	{
		Circle c1 = new Circle(7.0); // object created
		double circleArea = c1.calculateArea(); //calling method
		System.out.println("The Area of Circle is:- " +circleArea);
		
		Rectangle r1 = new Rectangle(5.0, 6.0); //object created
		double recArea = r1.calculateArea(); //calling method
		System.out.println("The Area of Rectangle is:- " +recArea);
		
	}

}
