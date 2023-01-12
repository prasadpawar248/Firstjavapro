package javaCollections;

import java.util.HashSet;

public class SetIHashSet 
{
	public static void main(String[] args)
	{
		
		//Declare HashSet
		
		  //In HS insertion order is not preserved
		  //HS can not allow duplicate data
		  //HS can allow different data type
		
		 // here we can not add/delete element by index
		
		 HashSet hs=new HashSet();
		 
	//add element
		 
		 hs.add(100);
		 hs.add(25.5);
		 hs.add("akshay");
		 hs.add('a');
		 hs.add(true);
		 hs.add(null);
		 
		 System.out.println(hs);   //[null, a, 100, akshay, 25.5, true]
		 
	//remove element
		 
		 hs.remove(null);
		 System.out.println(hs);   //[a, 100, akshay, 25.5, true]
		 
	//Contains element
		 
		 System.out.println(hs.contains(100));  //true
		 System.out.println(hs.contains("python"));   //false
		 
	//Is Empty
		 
		 System.out.println(hs.isEmpty());   //false
		 
	//print element in hash set through advance for loop
		 
		 for(Object a:hs)
		 {
			 System.out.println(a);
		 }
		 
	
		 
		 
		
		
		
		
		
		
		
		
		
	}

}
