/*Create two thread one thread is finding average of first 50 number and other thread is printing
 * square of number store in array arr={10,15,20,25,30}.*/
package Thursday_Practicals;

class Average extends Thread//Extending the thread class
{
    public void run()//run method
    {
    	int num=50;
    	int sum=0;
    	for(int i=1;i<=num; i++) 
        { 
            sum=sum+i;
        } 
     double average=(double)(sum/num); //Finding average of first 50 numbers
     System.out.println("Average of first 50 Numbers  is = " + average); 
    }
}

class Square extends Thread//Extending the thread class
{
	public void run()//Run method
	{
		int[] arr= {10,15,20,25,30};
		System.out.println("Print the square of given array element:- ");
		for(int s:arr)
		{
			System.out.println(s*s);//Print the square of given array element
		}
	}
}

public class AverageNumber //Main class
{

	public static void main(String[] args) 
	{
		Average a1 = new Average();//Creating obj of average class
		Square s1 = new Square();// Creating obj of square class
		a1.start(); //using start method to run the thread
		s1.start(); //using start method to run the thread
	}

}

