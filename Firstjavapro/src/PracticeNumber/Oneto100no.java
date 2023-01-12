package PracticeNumber;


public class Oneto100no {
	
	public static void main(String[] args) 
	{
		/*for(int i=1; i<=10; i++)
		{
			for(int j=2; j<=10; j++)
			{
				int k= i*j;
				System.out.println(\n k);
			}
		}*/
		
		
		String x="";
		
		for(int i=2; i<=10; i++)
		{
			x=x+"  "+i;
		}
		System.out.println(x.trim());
		
			
		
			for(int p=2; p<=10; p++)
				
			{	int k=0;
				String y="";
				for(int j=2;j<=10; j++)
				{
				k=p*j;
				y=y+" "+k;
				}
				System.out.println(y.trim());
			}
	
	}
	
}


