  package PracticeNumber;

import java.util.HashSet;

public class DuplicateElementInArray {

	public static void main(String[] args) {


		int []a= {1,2,3,4,5,5,14,7,1,2};
		
	//Method 1
		
		boolean value=false;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1; j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println("this is duplicate number in array:"+" "+a[i]);
					value=true;
				}
			}
		}
		if(value==false)
		{
			System.out.println("Duplicate value not found in array");
		}
		
	//Method 2
		
	/*	int b[]= {1,2,3,2,5,1};
		HashSet sc= new HashSet();
		boolean ans=false;
		for(int l:b)
		{
			if(sc.add(l)==false)
			{
				System.out.print(l+" ");
				ans=true;
			}
		}
		if(ans==false)
		{
			System.out.println("Duplicate value not found");
		}*/
	}

}
