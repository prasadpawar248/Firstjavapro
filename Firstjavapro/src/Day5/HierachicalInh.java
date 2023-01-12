package Day5;

class parent
{
	int x=20;
	void display()
	{
		System.out.println(x);
	}
}
class child1 extends parent
{
	int y=30;
	void print()
	{
		System.out.println(x+y);
	}
}
class child2 extends parent
{
	int z=50;
	void show()
	{
	System.out.println(x+z);
	}
}


public class HierachicalInh {

	public static void main(String[] args) {
		
		System.out.println("------Hierarchical Inheritance------");
		
		child1 obj1 = new child1();            // Hierarchical inheritance
		obj1.print();
		
		child2 obj2 = new child2();
		obj2.show();
		
		
	}

}
