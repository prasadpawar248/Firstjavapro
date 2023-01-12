package Day1;

public class Assignment {

	public static void main(String[] args) {
		
// find number is positive or negative
		System.out.println("----------positive or negative no.-----------");
		int i=22;
		if (i>=0)
		{
			System.out.println("no. is positive");
		}
		else 
		{
			System.out.println("no. is negative");
		}
		
		
// multiplication of 5
		System.out.println("---------multiplication of 5-------");
	    int num=5;
	for(int j=0;j<=10; j++)
	{   
		System.out.println(num*j);
	    
	}	
	
// swap a and b
	
	System.out.println("----------swap the value of a and b---------");
	int a=10;
	int b=20;
	int c=a;
	
	System.out.println(a=b);
	System.out.println(b=c);
	
// greates no. of 3 number
	
	System.out.println("-------------Greatest no. out of 3 number-------------");
	int u=15;
	int v=5000;
	int w=16;
	
	if ((u>v) && (u>w))  // here if we replace >=< then lesser no. will get.
	{	
		System.out.println(u);
	}
	else if((v>u) && (v>w))
	{
		System.out.println(v);
		
	}
	else
	{
		System.out.println(w);
	}

	
}

}
