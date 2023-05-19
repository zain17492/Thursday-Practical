/*Write a java program to create an ArrayList (Name of Vehicles) with 10 elements and do the following things:

1. Print the arraylist.

2. Iterate through the Array List and print the arraylist

3. Insert an element at start and end of arraylist.

4. retrieve an element at index number 4.

5. update the element at index number  7 with vehicle name XUV300.

6. Search for the element "verna" if it is found just print 'found the vehicle' else print 'not found'

7. Copy this arraylist to the new arraylist*/
package Thursday_Practicals;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_Assignment
{
	public static void main(String[] args) 
	{
		ArrayList a1 = new ArrayList();
		a1.add("Kia");
		a1.add("Hyundai");
		a1.add("MercedesBenz");
		a1.add("Ford");
		a1.add("Jeep");
		a1.add("Lamborghini");
		a1.add("Jaguar");
		a1.add("Ferrari");
		a1.add("Volvo");
		a1.add("Maruti Swift");
		System.out.println(a1);
		
		System.out.println("Iterating arraylist ");
		Iterator itr = a1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		// Insert a color at the first and last position of the list
		a1.add(0, "BMW");
		a1.add(11, "Audi");
		System.out.println(a1); //Print the list
		
		//Retrive the fourth element
		String element=(String) a1.get(4);
		System.out.println("Fourth element:- " +element);
		
		//update the element at index number  7 
		a1.set(7, "XUV300.");
		System.out.println(a1);
		
		//Copy  arraylist to the new arraylist
		ArrayList<String> a2=new ArrayList<>();
		a2.add("Kia");
		a2.add("Hyundai");
		a2.add("MercedesBenz");
		a2.add("Ford");
		ArrayList<String> a3=new ArrayList<>();
		a3.addAll(a2);
		System.out.println("Original arraylist:- " +a2);
		System.out.println("Copy arraylist:- " +a3);
		

}
}
