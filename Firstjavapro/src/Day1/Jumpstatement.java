package Day1;

public class Jumpstatement {

	public static void main(String[] args) {
		
  // Jump statment - break
		System.out.println("------break condition--------");
		
		for (int i=1; i<=10; i++)
		{
			if(i==5)
			{
				 break;
			}
			System.out.println(i);
			
		}

// Jump statment- continue
		System.out.println("--------Continue condition(1 to 100 odd no.--------");
		
		for (int j=1; j<=100; j++)
		{
			if (j%2==0)
			{
				continue;
			}
			System.out.println(j);
		}
		
		
	}

}
