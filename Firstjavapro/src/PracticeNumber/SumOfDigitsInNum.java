package PracticeNumber;

import java.util.Scanner;

public class SumOfDigitsInNum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number:");
		int a= sc.nextInt();
		
		//int a=523;
		int num=0;
		
		while(a>0)
		{	
			num=num+a%10;
			a=a/10;
		
		}
		System.out.println(num);
		
		

	}

}
