package PracticeNumber;

public class FindPrimeNumber 
{

	public static void main(String[] args)
	{
		
		
		for(int x=1;x<=100;x++)
		{
		int count=0;
		for(int i=1;i<=x; i++)
		{
			if(x%i==0)
				count++;
		}
		if(count==2)
			{
				System.out.println(x);
			}
		/*else
			{
				System.out.println("number is not prime");
			}*/
		
		}
	}
		
}
	

