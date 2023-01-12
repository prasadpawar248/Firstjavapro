package PracticeNumber;

public class AssendingArrayNumber {

	public static void main(String[] args) {
		
		int a[]= {5,4,6,2,1,7,8,9};
		
		String s="";
	for(int k=0; k<a.length-1; k++)
		{
			for(int j=1; j<a.length-1; j++)
			{	
				int l=a[k]<a[j]?a[k]:a[j];
				a[k]=l;
			//	int l2=l1<a[j]?l1:a[j];
				//s=s+" "+k;
			}
			
			s=s+" "+a[k];
		}
	System.out.println(s);

	}

}
