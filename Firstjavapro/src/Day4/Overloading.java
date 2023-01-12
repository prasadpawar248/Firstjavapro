
package Day4;

public class Overloading {

// Overloading method: here methods name should be same and data type or parameter should be different)
	
	void sum(int a, int b)
	{
		System.out.println(a+b);
	}
	
	void sum(int a, double b)
	{
		System.out.println(a+b);
	}
	
	void sum(double a, int b)
	{
		System.out.println(a+b);
	}
	
	void sum(int a, int b, int c)
	{
		System.out.println(a+b+c);
	}
	
	
	public static void main(String[] args) {
		Overloading obj = new Overloading();
		obj.sum(20, 30);
		obj.sum(20.5, 20);
		obj.sum(10, 10.5);
		obj.sum(20, 10, 30);
	

	}

}
