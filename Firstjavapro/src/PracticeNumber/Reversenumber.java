package PracticeNumber;

import java.util.Scanner;

public class Reversenumber {

	public static void main(String[] args) {
		
	@SuppressWarnings("resource")
	Scanner sc=new 	Scanner(System.in);
	
		System.out.println("Enter a number:");
		int num=sc.nextInt();  
		
		int rev=0;
		
		while(num>0)             //123
		{
			rev=rev*10+num%10;   //      3         30+12%10=2 --32    320+1%10=1--321
			num=num/10;         //   123/10-12     12/10=1            1/10=0
		}
		
		
		System.out.println(rev);

	}

}
