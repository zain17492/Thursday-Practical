/*Write a program to take input of marks of 3 subject from the user. Check if the total of
 *  marks given by the user is greater than 50 else throw an exception saying "You Failed".
 *  Or else print Grade is A if total is greater than 280. Grade B if the total is greater  
 *  than 200. Grade C if the total is greater than 150. Grade D if the total is greater than 50.*/
package Thursday_Practicals;

import java.util.Scanner;

class Marks extends Exception //class Marks defined exception for user
{
	public Marks(String str)//constructor
	{
		super(str);
	}	
}
public class Marksheet //Main class
{
	public static void CheckMarks(int c)throws Marks //Method for check
	{
		if(c<50)
		{
			throw new Marks("You Failed");// throwing the user defined exception
		}
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three subjects marks:-");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int total=a*b*c;
		try
		{
			CheckMarks(total);
		}
		catch(Marks e)
		{
			System.out.println(e);
		}
		if(total>280)
		{
			System.out.println("Grade A");
		}
		else if(total>200)
		{
			System.out.println("Grade B");
		}
		else if(total>150)
		{
			System.out.println("Grade C");
		}
		else if(total>50)
		{
			System.out.println("Grade D");
		}



	}

}
