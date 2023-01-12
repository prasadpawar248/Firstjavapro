package PracticeNumber;

import java.util.Scanner;

public class LargestOf3Number {

	public static void main(String[] args) {
		
		/*int a=423;
		int b=78;
		int c=564;
		
		if ((a>b) && (a>c))
		{
			System.out.println("a is greater number");
		}
		else if((b>a)&&(b>c))
		{
			System.out.println("b is greater number");
		}
		else
		{
			System.out.println("c is greater number");
		}*/
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter 1st value");
		int a=sc.nextInt();
		
		System.out.println("enter 2nd value");
		int b=sc.nextInt();
		
		System.out.println("enter 3 rd value");
		int c=sc.nextInt();
		
//Ternary Operator
		
		int d=a>b?a:b;
		int ln=c>d?c:d;
		
		//int d=c>(a>b?a:b)?c:(a>b?a:b);
		
		System.out.println("largest value is:"+ln);
		
	}

}
