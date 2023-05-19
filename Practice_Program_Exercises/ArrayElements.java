/*Find largest and smallest elements of an array.*/
package Practice_Program;

public class ArrayElements {

	public static void main(String[] args) 
	{
		int[] arr= {77,48,33,95,34,20}; //initialized an array
		
		int smallest=arr[0];
		int largest =arr[0];
		
		for(int j=0;j<arr.length;j++)
		{
			if(arr[j]< smallest)
			{
				smallest=arr[j];
			}
			if(arr[j] > largest)
			{
				largest=arr[j];
			}
		}
		
		System.out.println("Smallest element is "+smallest);
		System.out.println("Largest element is "+largest);
		
		
	}

}
