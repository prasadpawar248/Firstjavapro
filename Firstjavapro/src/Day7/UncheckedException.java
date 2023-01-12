package Day7;

public class UncheckedException {

	public static void main(String[] args) {
	
// Un-checked EXception type 
		
		
		
		
		System.out.println("Program is started");
		
// 1) Arithmetic Exception 
		
		/*int a=50;
		System.out.println(a/0); */
		
// 2) Null pointer Exception
		
		/*String str =null;
		System.out.println(str.length());*/
		
// 3) Number format Exception
		
		/*String str="abc";
		int i =Integer.parseInt(str);*/
		
// 4) Array index out of bounds Exception
		
		int [] arr= new int [5];
		arr[6]=5;
		
		System.out.println("Program is ended");

	}

}
