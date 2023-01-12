package Day8;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {

//How to Declare ArrayList

	
	ArrayList  abc = new ArrayList();
	
	abc.add("virat");   // Adding element to ArrayList
	abc.add("akshay"); 
	abc.add("rohit");
	abc.add("sachin");
	abc.add("ramesh");
	abc.add(1234);
	abc.add('a');
		
	System.out.println(abc);
	System.out.println(abc.size());  // find Size of ArrayList
	
	abc.remove(3);                   // remove 3 no of array element
	System.out.println(abc);
	System.out.println(abc.size());
	
	abc.add(1,"vivek");             //Add element through index.
	System.out.println(abc);
	System.out.println(abc.size());
	
	System.out.println(abc.get(4));  // get element by index
	abc.set(0, "kajal");   // Replace element through index
	System.out.println(abc);
	
	for(Object str:abc)         // Read ArrayList by enhanced for loop  // here Object type variable can hold any type of data.
	{
		System.out.println(str);
	}
	
	}

}
