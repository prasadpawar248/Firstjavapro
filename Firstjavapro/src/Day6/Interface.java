package Day6;

interface A
{
	int a=10;  //this is a static & final variable
	int b=20;
	void m1();  // by default access   is public of method
}

public class Interface implements A  // implements method of inheritance in this class 
{
	
	public void m1()
	{
		System.out.println(a+b);
	}

	public static void main(String[] args) 
	{
		/*Interface obj = new Interface();
		obj.m1();*/
		
		A obj = new Interface();  // we can implement this by interface name instead of class name.
		obj.m1();
		
		
	}

}
