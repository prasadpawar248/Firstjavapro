package Day5;

class A
{
	int a=10;
	
	void display()
	{
		System.out.println(a);
	}
	
}
class B extends A
{
	int b=20;
	void print()
	{
		System.out.println(b);
	}
}

class C extends B
{
	int c=30;
	void show()
	{
		System.out.println(a+b+c);
	}
}

public class Extend {
		
	public static void main(String[] args) {
	/*	A obj1 = new A();  
		obj1.display();*/
		
		System.out.println("------Single Inheritance-------");
		
		B obj2 = new B();  // Single inheritance (class A is parent for class B)
		obj2.display();
		obj2.print();
		
		System.out.println("------Multilevel Inheritance-------");
		
		C obj3 = new C();  // Multilevel inheritance (class A is parent for class B and B is parent class for C)
		obj3.show();
	
				
		

	}

}
 