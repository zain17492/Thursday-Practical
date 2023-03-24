//Write a java program. create a class Calculation add method
//addition,subtraction,multiplication and division to it.
//create a object and access thosemethods.

class Calculator //Class Declaration
{
	int a=30,b=20;
	 void addition() //Create a addition method
	 {
		 System.out.println("Addition of two number is: " + (a+b));
	 }
	 void subtraction() //Create a subtraction method
	 {
		 System.out.println("Subtraction of two number is: " +(a-b));
	 }
	 void multiplication() //Create a multiplication method
	 {
		 System.out.println("Multiplication of two number is:" +(a*b));
	 }
	  void division() //Create a division method
	 {
		 System.out.println("Division of two number is: " +(a/b));
	 }
}

class Main_Calculator //Main class
{
	public static void main(String args[]) // Main method create 
	{
		Calculator c1 = new Calculator(); //create a object of calculator class
		c1.addition(); //call addition()method
		c1.subtraction(); //call subtraction()method
		c1.multiplication(); //call multiplication()method
		c1.division(); //call division method
	}
}