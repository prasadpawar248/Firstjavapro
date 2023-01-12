package Day8;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {

// HashMap Declaration 
		
		//HashMap hm= new HashMap();
		
		HashMap hm = new HashMap();  // If we want specific data type of key & value.
		
		hm.put(101, "Akshay");
		hm.put(102, "ramesh");
		hm.put(103, "rohit");
		hm.put(104, "vivek");
		
		System.out.println(hm);
		
		
		hm.remove(103);              // remove pair from HashMap
		System.out.println(hm);
		
		hm.put(105,"kajal");
		System.out.println(hm);
		
	/*	for(Map.Entry m:hm.entrySet())
		{				
		System.out.println(m.getKey()+" "+m.getValue());
		}*/
	}

}
