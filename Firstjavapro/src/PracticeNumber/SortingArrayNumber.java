package PracticeNumber;

import java.util.Arrays;


public class SortingArrayNumber {

	public static void main(String[] args) {
		
		int a[]= {8,4,5,6,3,2,9,7,1};

		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0; j<a.length-1; j++)
			{
				if(a[j]>a[j+1])
				{
					int k=a[j];
					a[j]=a[j+1];
					a[j+1]=k;
				}
			}
		}
		System.out.println(Arrays.toString(a));
		

	}

}
