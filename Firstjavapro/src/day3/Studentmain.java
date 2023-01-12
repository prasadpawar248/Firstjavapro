package day3;

public class Studentmain {

	public static void main(String[] args)
	{
	    
// 2) assign value by CONSTRUCTOR METHOD
		
	 //DEFAULT CONSTRUCTOR
		
		Student stu1= new Student();  
		stu1.display();
		
	//PARAMETERIZED CONSTRUCTOR
		
		Student stu2= new Student(200,"akshay", 'B');		
		stu2.display();
		
	}

}
