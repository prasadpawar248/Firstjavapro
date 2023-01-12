package Day2;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,2,3,4,5,6};
		int b=5;
	
		
		for(int i=0; i<a.length; i++)
		{
			if ((b%2==0) && (b==a[i]))
			{
				System.out.println("b is even no"); 
			}
			else if(b==a[i])
			{
				System.out.println("b is odd no"); 
			}
			/*else                 // we need to resolve this
			{
				System.out.println("b is not in array");
			}*/
		}
		
		int c[]= {1,2,3};
		int d[]= {10,20,30};
		
		for (int j=0; j<c.length; j++)
		{ 
			for (int k=0; k<d.length; k++)
			
			{ 
				if(j==k)
				{
					System.out.println(c[j]+d[k]);     //   11,  cf, cf   ---- 	cf, 22, cf  ----  cf, cf,  33  
				}
			}
		}
		
		/*int a[][]= {{1,2},{3,4}};
		int b[][]= {{1,3},{2,4}};
		
		for(int i=0;i<a.length;i++);
		{
			for(int j=0;j<b.length;j++);
			 
			{
				if(i==j)
				{
					System.out.println(a[i]+b[j]);
				}
			}
			
		}*/
		
		
		
		
		
		
	}

}
