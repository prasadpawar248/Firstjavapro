package javaCollections;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueI 
{
	public static void main(String[] args)
	{
//Heterogeneous data is not allowed (int,string,char)
	// Insertion order is preserved
	// Duplicate elements allowed
	
	PriorityQueue <String> p=new PriorityQueue <String> ();
	
	p.add("A");
	p.add("B");
	p.add("C");
	p.add("D");
	p.offer("A");
	//p.add(10.2);      only homogeneous data allowed
	
	
	System.out.println(p);
	
//Get head
	//System.out.println(p.element());  //200    if p will empty then output will NoSuchElementException
	//System.out.println(p.peek());  //200  if p will empty then output null
	
//remove head element
	
	System.out.println(p.remove());
	System.out.println(p);  //[3, 5, 4, 6]  if p will empty then output will NoSuchElementException
	
	System.out.println(p.poll());
	System.out.println(p);  //[4, 5, 6]   if p will empty then output null
	
	
	
	Iterator a=p.iterator();
	
	while(a.hasNext())
	{
		System.out.println(a.next());
	}
	
	/*for(Object b:p)
	{
		System.out.println(b);
	}*/
	
	}

}
