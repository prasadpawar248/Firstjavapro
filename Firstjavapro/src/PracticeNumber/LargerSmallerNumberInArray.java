package PracticeNumber;

public class LargerSmallerNumberInArray {

	public static void main(String[] args) {
		int a[]= {5,23,4,15,10,2};
		
		int i=a[0];
		int b=0;
		int c=0;
		for(int j=0;j<a.length;j++)
		{
			b=i<a[j]?i:a[j];
			i=b;
			
		}
		System.out.println("Smaller no in array is:"+ b);
		for(int j=0;j<a.length;j++)
		{
			c=i>a[j]?i:a[j];
			i=c;
		}
		System.out.println("Larger no in array is:"+ c);

	}

}
