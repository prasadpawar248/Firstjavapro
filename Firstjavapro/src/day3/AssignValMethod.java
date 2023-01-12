package day3;

public class AssignValMethod {
	
	int x=10;
	int y=20;
	
//Case 1- Not taking parameter & not returned value
	
	/*void sum() {
		System.out.println(x+y);
	}*/
	
//Case 2- Not taking parameter & but returned value	
	
	/*int sum() 
	{
		return (x+y);
	}*/
	
//Case 3- Taking parameter & not returned value	

	/*void data(int a, int b)
	{
		x=a;
		y=b;
	}
	void sum() 
	{
		System.out.println(x+y);
	}*/
	
// case 4-Taking parameter & Returned value
	
	int sum( int a, int b)
	{
		return(a+b);
	}
		
	
}
