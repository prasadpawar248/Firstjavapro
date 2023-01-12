package PracticeNumber;

import java.util.Scanner;

public class HowManyDigitsInNumber {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		int count=0;
		while(num>0)	
		{
		
			num=num/10;  //123/10-12   12/10- 1   1/10-0
			count++;     //1           2          3
		}
		System.out.println(count);

	}

}
