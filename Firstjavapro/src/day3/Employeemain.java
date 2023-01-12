package day3;

public class Employeemain {

	public static void main(String[] args) 
	{
	// 3) assign value by REFERANCE VERIABLE
		
		Employee emp1=new Employee();
		emp1.empid=100;  
		emp1.ename="prasad";
		emp1.sal=50000.00;
		emp1.edept=10;
		emp1.job="tester";
		emp1.display();
		
		Employee emp2=new Employee();
		
		emp2.empid=200;
		emp2.ename="akshay";
		emp2.sal=20000;
		emp2.edept=20;
		emp2.job="engineer";
		emp2.display();
	}

}
