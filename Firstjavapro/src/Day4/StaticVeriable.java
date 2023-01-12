package Day4;

public class StaticVeriable {
	
	
	static int a=20; // static variable
	int b=10;           // non static variable
	
	static void method1(int c, int d)   // static method

	{
		System.out.println(c+d);
	}
	
	void method2()      //      non static method
	{
		System.out.println("This is non static method");
	}
	
	
	public static void main(String[] args)
	{
	
	System.out.println(a);   //static variable output
	method1(25,25);    // static method output
	
	
	
	
	
	
	
	
	
		

	}

}
