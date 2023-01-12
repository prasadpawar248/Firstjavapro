package PracticeNumber;

import java.util.Scanner;

public class FindArryBinary {

	public static void main(String[] args) {
	
		int a[]= {11,12,13,14,15,16,17,18,19};
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter value");
		int key=sc.nextInt();
		
	
		int l=0;
		int h=a.length-1;
		
		boolean ans=false;
		while(l<=h)
		{
			int mid=(l+h)/2;
			if(key==a[mid])
			{
				System.out.println("Element found in array");
				ans=true;
				break;
			}
			if(key<a[mid])
			{
				h=mid-1;
			}
			if(key>a[mid])
			{
				l=mid+1;
			}
		}
		if(ans==false)
		{
			System.out.println("Element not found");
		}
	}

}
