package javaCollections;

import java.util.HashSet;

public class SetIHashSet2 
{
	public static void main(String[] args)
	{
		HashSet <Integer> number= new HashSet <Integer> ();
		
		number.add(2);
		number.add(3);
		number.add(4);
		number.add(6);
		
		System.out.println(number);   //[2, 3, 4, 6]
		
		
		HashSet <Integer> number1= new HashSet <Integer> ();
		
		number1.addAll(number);
		
		number1.add(5);
		number1.add(7);
		
		System.out.println(number1);   //[2, 3, 4, 5, 6, 7]
		
	//Intersect element (common numbers from both hashSet)
		
		number.retainAll(number1);
		System.out.println("intersect: "+number);   //intersect: [2, 3, 4, 6]
		
	//subset of hs
		
		System.out.println(number1.containsAll(number));   //true
		
	//Difference element
		
		number1.removeAll(number);
		System.out.println(number1);   //[5, 7]
		
	//Union element (Unique Number from both HS)
		
		number.addAll(number1);
		System.out.println("union: "+ number);   //union: [2, 3, 4, 5, 6, 7]
		
	

		
	}

}
