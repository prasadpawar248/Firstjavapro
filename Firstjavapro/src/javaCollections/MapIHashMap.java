package javaCollections;

import java.util.HashMap;
import java.util.Map;

public class MapIHashMap 
{
	public static void main(String[]args)
	{
		HashMap <Integer,String> hm=new HashMap<Integer,String>();
		
		//Insertion order is not preserved.
		//duplicates allowed
		//Key and value data type can be anything but after declaring we can not change.
		//it can allowed Heterogeneous data
		
		hm.put(10, "akshay");
		hm.put(20, "rohit");
		hm.put(30, "kajal");
		hm.put(40, "vijay");
		hm.put(50, "sagar");
		hm.put(50, "akshay");
		hm.put(20, "ramesh");
		
		hm.remove(50);
		System.out.println(hm);
		
		for(Map.Entry h:hm.entrySet())
		{
			System.out.println(h.getKey()+" "+h.getValue());
		}
		
	}

}
