package Day4;

public class ConstructorOverloading {

	
	
	ConstructorOverloading (int a, int b)
		{
			System.out.println(a+b);
		}
	
	ConstructorOverloading (double a, int b)
		{
			System.out.println(a+b);
		}

	ConstructorOverloading (int a, double b)
		{
			System.out.println(a+b);
		}

	ConstructorOverloading (int a, int b, int c)
		{
			System.out.println(a+b+c);
		}
	
	@SuppressWarnings("unused")
	public static void main(String[] args) 
	{
		
		ConstructorOverloading obj0 = new ConstructorOverloading(10,20);
		ConstructorOverloading obj1 = new ConstructorOverloading(20.5,20);
		ConstructorOverloading obj2 = new ConstructorOverloading(10,20.5);
		ConstructorOverloading obj3 = new ConstructorOverloading(10,20,50);
		
	}

}
