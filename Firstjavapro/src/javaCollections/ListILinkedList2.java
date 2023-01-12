package javaCollections;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class ListILinkedList2 
{
	public static void main(String [] args)
	{
		
		LinkedList name=new LinkedList();
		
		name.add("cat");
		name.add("dog");
		name.add("tiger");
		name.add("lion");
		name.add("wolf");
		
	//Sort element
		
		Collections.sort(name);
		System.out.println(name);  //[cat, dog, lion, tiger, wolf]
		
	//sort element to reverse
		
		Collections.sort(name, Collections.reverseOrder());
		
		System.out.println(name);   //[wolf, tiger, lion, dog, cat]
		
	//Shuffling random call element
		Collections.shuffle(name);
		System.out.println(name);   //[cat, tiger, lion, wolf, dog]
		
	//Add First and last
		
		name.addFirst("elephent");
		name.addLast("giraf");
		System.out.println(name);   //[elephent, wolf, tiger, lion, dog, cat, giraf]
		
	//Remove First and Last
		
		name.removeFirst();
		name.removeLast();
		System.out.println(name);  //[lion, tiger, cat, dog, wolf]
		
	//Get First and Last
		
		System.out.println(name.getFirst());  //lion
		System.out.println(name.getLast());   //wolf
		
		System.out.println("-------iterator-------");
		Iterator it=name.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

		
	}

}
