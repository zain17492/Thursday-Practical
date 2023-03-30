/*Create a parent class called "Vehicle" with attributes such as brand,model and year, and
 *a method called "drive". create a child class called "Car" that inherits from Vehicle and has
 *an additional attribute called "color" and a method called "Type". Create an object of the Car 
 *class and call both the "drive" and "Type" methods*/
package Practical;

//Parent class vehicle
class Vehicle
{
	String brand; //attribute
	String model;
	int year;
	
	public void Drive() //Create a method
	{
		System.out.println("This is best vehicle to buy");
	}
	
}

class Car extends Vehicle //child class //inheriting the parent class
{
    String color;
	
    public void Type() // Create a method
    {
    	System.out.println("This is best car");
    }
}

public class Main_Vehicle {
	public static void main(String[] args) {
		Car c1 = new Car();
		c1.brand ="Skoda";
		c1.model ="Skoda Superb";
		c1.year = 2023;
		c1.color= "Black";
		c1.Drive(); //calling method
		c1.Type();  //calling method

	}

}
