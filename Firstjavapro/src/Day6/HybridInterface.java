package Day6;

interface black
{
	int a=40;
	void m11();
}

interface white
{
	int b=20;
	void m21();
}

class tree
{
	int x=10;
	void print()
	{
		System.out.println(x);
	}
}

public class HybridInterface extends tree implements black, white
{
	public void m11()
	{
		System.out.println(a);
	}
	
	public void m21()
	{
		System.out.println(b);
	}
	
	public static void main(String[] args) {
		
		HybridInterface obj = new HybridInterface();
		
		obj.print();
		obj.m11();
		obj.m21();
			
	}

}
