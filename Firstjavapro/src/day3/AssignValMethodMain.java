package day3;

public class AssignValMethodMain {

	public static void main(String[] args) {
		
//1) Assign value by Method
		// Here is 4 case of Method
		
		AssignValMethod obj = new AssignValMethod();
		
	//Case 1- Not taking parameter & not returned value
		
		//obj.sum(); // Case1
		
	//Case 2- Not taking parameter & but returned value
		
		/*int result=obj.sum();
		System.out.println(result);*/
		
	// case 3-Taking parameter & not returned value
		
		/*obj.data(100, 200);
		obj.sum();*/
		
	// case 4-Taking parameter & Returned value
		
		int result=obj.sum(200, 50);
		System.out.println(result);
	
	}

}
