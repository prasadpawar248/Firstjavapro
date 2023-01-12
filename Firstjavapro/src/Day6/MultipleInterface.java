package Day6;


interface dog
{
	int a=10;  
	int b=20;
	void add1();  
}

interface cat
{
	int c=45;
	void sub1();
}

public class MultipleInterface implements dog,cat
{
	
	public void add1()
	
	{
	System.out.println(a+b);	
	}
	
	public void sub1()
	{
	System.out.print(c-(a+b));	
	}

	public static void main(String[] args)
	{
		/*dog abc = new MultipleInterface();   // by interface name
		abc.add1();
		cat xyz = new MultipleInterface();
		xyz.sub1();*/
		
		MultipleInterface abc = new MultipleInterface();
		abc.add1();
		abc.sub1();

	}


	

}
