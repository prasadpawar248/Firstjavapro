package PracticeNumber;

import java.util.Scanner;

public class SumOfArrayNunber {

	public static void main(String[] args) {
		
		/*Scanner sc = new Scanner(System.in);
		int []a= a sc.nextInt();*/
		
		int a[]= {1,2,3,4,5,6,7,8,9};
		
		int sum=0;
		/*for(int i=0; i<a.length; i++)
		{
			sum=sum+a[i];
		}
		System.out.println(sum);*/
		
	//Advanced/Enhanced for loop
		
		for(int b:a)
		{
			sum=sum+b;
		}
		System.out.println(sum);

	

	
	}

}
