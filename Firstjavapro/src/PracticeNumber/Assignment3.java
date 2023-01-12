package PracticeNumber;


public class Assignment3 {

	public static void main(String[] args) {

// print first even no and then odd nos.
		
		/*int a[]= {12,52,43,14,5,86,67,28,309,10};	
		
		System.out.println("-------Print even no first and odd no second---------");
		
			for(int i=0; i<a.length; i++) 
		{
			if(a[i]%2==0)
			{
				System.out.print(a[i]+" ");
			}
      		for (int j=0; j<a.length; j++)
		{
			if(a[j]%2!=0)
			{
				System.out.print(a[j]+" ");
			}
		}
		
// print reverse array nos.
		
		/*System.out.println("-------revers array-------");
		
		for(int i=a.length-1; i>=0; i-- )
		{
			System.out.print(a[i]+" ");
		}*/

// print missing no. of 1 to 10 natural no. in array
		
		int a[]= {1,2,3,4,5,6,8,9,10};  
		
		int b =(10*11)/2;
		int c=0;
		
		for(int i=0; i<a.length; i++)
		{
			c=c+a[i];
			
		}
		System.out.println(b-c);
		
	
	
		
		
	}
}

