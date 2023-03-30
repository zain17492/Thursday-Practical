/* Write a program in java showing overloading of Add method with 2 and 3 parameters.
 * In the user passes 2 values method with 2 parameters should be called if he passes
 *  3 value method with 3 parameters should be called*/
package Practical;

public class Assignment
{
	public void Add(String a, float b) //create method with 2 parameters
	{
		System.out.println("I am print method with 1 string and 1 float parameters");
	}
	public void Add(int a, double b, String c) // create method with 3 parameters
	{
		System.out.println("I am print method with 1 int, 1 double and 1 String  parameters");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment a1 = new Assignment();
		a1.Add("a", 60); //calling method
		//a1.Add(20, 30, "c"); //method calling

	}

}
