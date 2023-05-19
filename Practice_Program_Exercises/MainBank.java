/*Create an interface called "BankAccount" with method called "deposit" and "withdraw".
 *create a class called "CheckingAccount" that implements the BankAccount interface and
 *implements the "deposit" and "withdraw" method.Create an object of the  CheckingAccount
 *class and call both "deposit" and "withdraw" methods.*/
package Practice_Program;

interface BankAccount //interface
{
	public void deposit();
	public void withdraw();
}

class CheckingAccount implements BankAccount //implementing the interface
{

	
	public void deposit() //providing body to abstract method
	{
		System.out.println("This is deposit method");
		
	}

	public void withdraw() 
	{
	   System.out.println("This is withdraw method");	
	}
	}

public class MainBank //main class
{

	public static void main(String[] args) 
	{
		CheckingAccount ca = new CheckingAccount(); //creating the object
		ca.deposit(); //calling method
		ca.withdraw();
	}

}
