package Day1;

public class Loopcondition 
{

	public static void main(String[] args) 
	{
	// while loop
		System.out.println("---------while loop---------");
		System.out.println("-----1 to 10 no.------");
		
		int i=1;
		
		while(i<=10)
		{
			System.out.println(i);  // 1, 2, 3, 
			i++;
		}
		
		System.out.println("--------even no. in 1 to 10 no.----------");
		
		int j=1;
		while (j<=10)
		{
			if(j%2==1)
			{
				System.out.println(j);   ///  
			}
		    j++;
			
		}
		
	// do while loop
		
		System.out.println("-------do while loop -------");
		
		int k=20;
		
		do
		{
			System.out.println(k);
		    k++;
		} 
		while(k<=10);
		
	// for loop
		System.out.println("---------1 to 10 no. in For loop--------");
		
		for(int l=1;l<10;l++)
		{
			System.out.println(l);
		}
	
	}

}
