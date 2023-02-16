package javaCollections;

import java.util.Iterator;
import java.util.LinkedList;

public class ListILinkedList 
{
	public static void main(String [] args)
	{
		
	//Declare LinkedList
		//In LL insertion order is preserved
		//LL can allow duplicate data
		//LL can allow different data type
		
		// IF we want to add/delete data then we can used LL Instead of AL.
		// if we want Retrieve(Get) data then we don't need to used LL BCOZ more time is required for operation.
		
		LinkedList ll= new LinkedList();
		
//		LinkedList <Integer> lli= new LinkedList <Integer> ();   if we want integer data type element 
//		LinkedList <String> lls= new LinkedList <String> ();     if we want String data type element
		
		LinkedList ll1=new LinkedList();
		
	//Add element directly
		
		ll.add(100);
		ll.add('A');
		ll.add("Akshay");
		ll.add(10.5);
		ll.add(null);
		ll.add(true);
		
		System.out.println(ll);    //[100, A, Akshay, 10.5, null, true]
		
	//Add element by index
		
		ll.add(1,200);
		System.out.println(ll);  //[100, 200, A, Akshay, 10.5, null, true]
	
	//addAll element
		
		ll1.addAll(ll);
		
		System.out.println(ll1);  //[100, 200, A, Akshay, 10.5, null, true]
		
	//Size-length of ll
		
		System.out.println(ll.size());  //7
		
	//remove element
		ll.remove(0);
		System.out.println(ll);  //[200, A, Akshay, 10.5, null, true]
		
		ll.remove("Akshay");
		System.out.println(ll);  //[200, A, 10.5, null, true]
		
	//Retrieve data by index only
		
		System.out.println(ll.get(2));  //10.5
		
	//Replace element by set method
		
		ll.set(0, "Akahay");
		System.out.println(ll);  //[Akahay, A, 10.5, null, true]
		
	//Search element by contains method
		
		System.out.println(ll.contains('A'));  //true
		
	//Is Empty ll
		
		System.out.println(ll.isEmpty());  //false
		
		
		System.out.println("-------for loop--------");
		
		for(int i=0; i<ll.size(); i++)
		{
			System.out.println(ll.get(i));
		}

		System.out.println("-------Advance loop--------");
		for(Object j:ll)
		{
			System.out.println(j);
		}
		System.out.println("-------iterator--------");
		Iterator it=ll.iterator();
		while(it.hasNext())
		{
		System.out.println(it.next());
		}

		
	}

}
