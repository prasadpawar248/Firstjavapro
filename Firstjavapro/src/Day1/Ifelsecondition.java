package Day1;

public class Ifelsecondition 
{

	public static void main(String[] args) 
	{
		
		
	// IF else condition 
		
		System.out.println("------if else condition-------");
		
		int a=20;
		if (a>18)
		{
			System.out.println("Eligible for vote");
		}
		else
		{
			System.out.println("Not eleigible for vote");
		}
		
	// even or odd number
		
		System.out.println("-------even or odd number-------");
		
		int num=10;
		
		if (num%2==0)  // % means remain value ( not divide value)
		{
			System.out.println("Number is even no.");
		}
		else
		{
			System.out.println("Number is odd no.");
		}
	// find largest number
		
		System.out.println("------------largest number-----------");
		
		int x=10;
		int y=20;
		
		if (x>y)
		{
			System.out.println("x is larger no");
		}
		else
		{
			System.out.println("y is larger no");
		}
		
	// if else if condition
		System.out.println("----------Nested if else--------");
		
		int day=7;
		
		if (day==1)
		{
			System.out.println("sunday");
		}
		else if (day==2)
		{
			System.out.println("monday");
		}
		else if (day==3)
		{
			System.out.println("tuesday");
		}
		else if (day==4)
		{
			System.out.println("wednesday");
		}
		else if (day==5)
		{
			System.out.println("thurday");
		}
		else if (day==6)
		{
			System.out.println("friday");
		}
		else if (day==7)
		{
			System.out.println("saturday");
		}
		else
		{
			System.out.println("no. is invalid");
		}
		
	// Switch case condition
		
		System.out.println("--------Switch case condition--------");
		
		int dya=5;
		
				switch (dya)
				{
				case 1: System.out.println("sunday"); break;  // here 1 is the data which we assign to dya(day)
				case 2: System.out.println("monday"); break;
				case 3: System.out.println("tuesday"); break;
				case 4: System.out.println("wednesday"); break;
				case 5: System.out.println("thursday"); break;
				case 6: System.out.println("friday"); break;
				case 7: System.out.println("saturday"); break;
				default: System.out.println("invalid no.");
				}
				
//				int d[]= {1,2,3,4,5};
//				for(int i=0;i<d.length;i++)
//				{
//					System.out.print(d[i]);
//					if(i<d.length-1)
//					{
//						System.out.print(",");
//					}
//				}
				
		
	}

}
