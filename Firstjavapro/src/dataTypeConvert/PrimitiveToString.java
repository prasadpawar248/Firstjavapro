package dataTypeConvert;

public class PrimitiveToString 
{
	public static void main(String[]args)
	{
		
	//int to String
		
		int a=10;
		
		String b=Integer.toString(a);  //1 way
		System.out.println(b);
		
		b=a+"";                    //2 way
		b=String.valueOf(a);      //3 way
		
		//string to int
		String value1="1234";
		int num1=Integer.parseInt(value1);
		System.out.println(num1); //1234
		
	//double to string
		
		double c=10.51;
		String d=Double.toString(c);  //1 way
		System.out.println(d);
		
		d=c+"";                    //2 way
		d=String.valueOf(c);      //3 way
		
		//string to double
		String value2="12.3456";
		double num2=Double.parseDouble(value2);
		System.out.println(num2);  //12.3456
		
	//char to string
		
		char x='a';
		String y=Character.toString(x);  //  1 way
		
		y=x+"";    // 2 way
		y=String.valueOf(x);  // 3 way
}
	
}

