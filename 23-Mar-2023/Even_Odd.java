//write a java program to find if number is even or odd

import java.util.Scanner; //Import Scanner Class
class Even_Odd  //Class Declaration
{
	public static void main(String args[])
	{
		int num; //Define Variable to Receive Input
		Scanner sc = new Scanner(System.in);  //Construct Scanner class Object
		System.out.println("Enter number :-"); //Read Input from Keyboard
		num= Integer.parseInt(sc.nextLine());
		if (num%2==0)// Checking the enter number is even or odd
		{
			System.out.println(" Even number");
		}
		else
		{
			System.out.println(" Odd number");
		}
	}
}