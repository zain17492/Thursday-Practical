/*Write a Program to create  thread. Where you will take the input from the user and find if the number is odd or even*/
package Thursday_Practicals;

import java.util.Scanner;

class OddEven extends Thread// Extending thread class
{
   int num;
   public OddEven(int num)//constructor
   {
	   this.num=num;
   }
   public void run()//Run method
   {
	   if (num%2==0)// Checking the enter number is even or odd
		{
			System.out.println(num + " Number is Even");
		}
		else
		{
			System.out.println(num +" Number is Odd");
		}
   }
}

public class Odd_EvenUsingThread//Main class
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number:- ");
		OddEven oe=new OddEven(sc.nextInt());//creating object
		oe.start();// using start method to run the thread
	}

}
