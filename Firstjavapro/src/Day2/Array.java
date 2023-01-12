package Day2;

public class Array {

	public static void main(String[] args) {
	// Array - Single dimentional
		
		/*int a[]= new int [5];  // declare array with size 5
		
		a[0]=100;  // storing values into array
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;
		
		System.out.println(a[4]);*/
		
		int a[]= {1,2,3,4,5};
		
		System.out.println("-------print array length--------");
		
		System.out.println("Length of array is:" +a.length);  // print length/size of array
		
		System.out.println("------Print Array element---------");
		
		for (int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
		
	//Print array by advanced for loop
		
		System.out.println("-------Array by Advanced for loop---------");
		
		for (int p:a)
		{
			System.out.println(p);
		}
		
//Array- Two dimentional array
		
		System.out.println("-------Two dimentional array--------");
		
		/*int b[][]= new int[3][2];
		
		b[0][0]=10;
		b[0][1]=20;
		
		b[1][0]=30;
		b[1][1]=40;
		
		b[2][0]=50;
		b[2][1]=60;*/
		
		int b[][]= {{10,20},{30,40},{50,60}};
		
		System.out.println("Length of row is:" + b.length);
		System.out.println("length of col is:" + b[0].length);
		
		System.out.println("------print two dimn array---------");
		
		for (int i=0; i<b.length; i++)
		{
			for (int j=0; j<b[i].length; j++)
			{
				System.out.println(b[i][j]);
			}
		}
		
	// Two dimensional array by Advanced loop
		
		System.out.println("--------TD Array with advanced loop-------");
		
		for(int r[]:b)
		{
			for(int i:r)
			{
				System.out.println(i);
			}
		}
			
		
	
		

	}

}
