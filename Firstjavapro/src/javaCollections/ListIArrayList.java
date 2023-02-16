package javaCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ListIArrayList 
{
	public static void main(String [] args)
	{
		
	//Declare ArrayList
	  //In AL insertion order is preserved
	  //AL can allow duplicate data
	  //AL can allow different data type
		
		// IF we want to Retrieve(Get)data then we can used AL Instead of LL.
		// if we want add/delete then we don't need to used AL BCOZ more time is required for operation.
		
		ArrayList al=new ArrayList();  
		
		//ArrayList <Integer> al1=new ArrayList <Integer> ();   if we want only integer data in AL
		//ArrayList <String> al2=new ArrayList <String> ();   if we want only string data in AL
		
		ArrayList al1 = new ArrayList();
		
	//add new elements
		
		al.add(100);
		al.add('A');
		al.add("Akshay");
		al.add(100);
		al.add(20.50);
		al.add(true);
		al.add(null);
		al.add("Akshay");
		
	//print data of al
		System.out.println(al);  //[100, A, Akshay, 100, 20.5, true, null]
		
	//size of al
		System.out.println(al.size());  //7
		
	//remove element
		al.remove(3);
		System.out.println(al);  //[100, A, Akshay, 20.5, true, null]
		al.remove("Akshay");
		System.out.println(al);  //[100, A, 20.5, true, null]
		
	//add element by index
		al.add(0,"Akshay");
		//al.add(3,'B');
		System.out.println(al);  //[Akshay, 100, A, 20.5, true, null]
		
		al1.addAll(al);
		System.out.println(al1);  //[Akshay, 100, A, 20.5, true, null]
		
	//Get element by index
		System.out.println(al.get(0));  //Akshay
		System.out.println(al.get(3));  //20.5
		
	//Replace element by set method
		al.set(1, 200);
		al.set(4, false);
		System.out.println(al);  //[Akshay, 200, A, 20.5, false, null]
		
	//Search element
		System.out.println(al.contains('A'));  //true
		System.out.println(al.contains("rohit"));  //false
		
	//Is Empty
		System.out.println(al.isEmpty());  //false
		al.clear();  //clear all data
		al.equals(al1); //false
		Collections.sort(al);
		Collections.sort(al,Collections.reverseOrder());
		
		
	//Print all element by For Loop
		
		System.out.println("---------for loop---------");		
		for(int i=0; i<al.size(); i++)
		{
			System.out.println(al.get(i));
		}
		
		System.out.println("--------Advance for loop--------");
		
		for(Object j:al)
		{
			System.out.println(j);
		}
		
		System.out.println("--------iterator method--------");

		Iterator it=al.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}

}



/*


-Insertion order is preserved
-dublicates are allowed
-any data types are allowed
-if we want to retrieve data then we prefer ArrayList

ArrayList obj=new ArrayList(); //this is combination of data.
ArrayList <Integer> obj1=new ArrayList<Integer>(); //this is for multiple data type.
ArrayList obj3=new ArrayList()

obj.add("akshay");
obj.size() //find length
obj.add(1,"pawar");
obj.get(0) //akshay
obj.set(1,"prasad") //replace
obj.remove("akshay")
obj.remove(0)
obj.contains("akshay") //false
obj.isEmpty() // false

obj3.addAll(obj);

*/