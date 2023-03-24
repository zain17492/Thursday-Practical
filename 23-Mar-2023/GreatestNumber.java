//Write a java program to take 3 number and find the greatest of all the 3 number

class GreatestNumber // Class Declaration
{
	public static void main(String [] args)
	{
		int x=80;
		int y=56;
		int z=705;
		if(x>y && x>z) //Checking the X is greatest number or not
		{
			System.out.println("X is greatest number");
		}
		else if(y>x && y>z) //Checking the Y is greatest number or not
		{
			System.out.println("Y is greatest number");
		}
		else //If both condition are false than Z is greatest number
		{
			System.out.println("Z is greatest number");
		}
	}
}