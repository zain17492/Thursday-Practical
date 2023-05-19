package Practice_Program;

abstract class Vehicle
{
   abstract void vehicleModel();
   abstract void vehicleColor(); 
}
class Bike extends Vehicle
{
  public void vehiclePrice()
  {
    System.out.println("The Price of this bike is : 90000/-");
  }
  public void vehicleColor()
  {
	  System.out.println("The Color of this bike is black.");
  }
  public void vehicleModel()
  {
	  System.out.println("This bike is hero honda model.");
  }
}

class Car extends Vehicle
{
	public void vehiclePrice()
	{
	   System.out.println("The Price of this car is : 650000/-");	
	}
	public void vehicleColor()
	{
		System.out.println("The Color of this car is white.");
	}
	public void vehicleModel()
	{
		System.out.println("The model of this car is bmw.");
	}
}
public class Main_Vehicle 
{
	public static void main(String args[])
	{
		Car c1 = new Car();
		c1.vehicleColor();
		c1.vehicleModel();
		c1.vehiclePrice();
	}

}
