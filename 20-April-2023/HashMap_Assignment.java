/*Write a program to create HashMap (Key-Value) of Students and perform following operations on it:

1. Check if the map contains the mapping for specified key(105)

2. Count the number of key-value(size) mapping in a map.

3. Copy the mapping from specified map to another map*/

package Thursday_Practicals;

import java.util.HashMap;
import java.util.Map;

public class HashMap_Assignment 
{
	public static void main(String[] args)
	{
		Map<Integer,String> mp = new HashMap<Integer,String>();
		mp.put(101, "Raj");
		mp.put(102, "Riya");
		mp.put(103, "Aman");
		mp.put(104, "Komal");
		mp.put(105, "Sham");
		
      //Check if the hashmap contains the mapping for key 105
		if(mp.containsKey(105)) 
		{
			System.out.println("HashMap contains the mapping for key 105");
		}
		else
		{
			System.out.println("HashMap does not contain the mapping for key 105");
		}
		
		//count the no. of key-value mapping in the Hashmap
		int size =mp.size();
		System.out.println("No. of key-value mapping in the hashmap:-"+size);
		
		//copy the mapping from the HashMap to another HashMap
		
		Map<Integer,String> newMp = new HashMap<>(mp);
		System.out.println("New HashMap:-" + newMp);
}
}
	
