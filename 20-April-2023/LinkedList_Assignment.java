/*Write a program to create a LinkedList(Colors) using collections in java and perform following operations on them:

1. Append "Red" at the end of the linked list

2. Iterate through all the elements of the linkedlist starting from the element 4

3. Iterate the linked list in the reverse order.*/
package Thursday_Practicals;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList_Assignment 
{
	public static void main(String args[])
	{
		LinkedList<String> l = new LinkedList<String>();
		l.add("Black");
		l.add("Blue");
		l.add("Orange");
		l.add("Yellow");
		l.add("Pink");
		System.out.println("Original Linked List  :- " +    l);
		
		//Append "Red" at the end of the linked lis
		l.addLast("Red"); 
		System.out.println("The Linkedlist is :- " + l);
		
		//Iterate through all the element of the linked list  Starting from the element 4
		System.out.println("Element starting from index 4:- ");
		Iterator i = l.listIterator(4);
		
		while (i.hasNext())
		{
			System.out.println(i.next());
		}
		
		
		//Iterate the linked list in reverse order
		Iterator<String> itr =l.descendingIterator();
		System.out.println("Linked List in reverse order ");
		while(itr.hasNext())
		{
			
			System.out.println(itr.next());
		}
		
		
	}

}
