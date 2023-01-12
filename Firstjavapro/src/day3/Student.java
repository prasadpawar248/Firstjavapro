package day3;

public class Student {

	int sid;
	String sname;
	char grade;
	
//  DEFAULT CONSTRUCTOR
	
	Student()
	{
		sid=100;
		sname="Prasad";
		grade='A';
	}
	
	//PARAMETERIZED CONSTRUCTOR
	
	Student( int id, String name, char grd)
	{
		sid=id;
		sname=name;
		grade=grd;
	}
	
	void display() 
	{
		
		System.out.println(sid+" "+sname+" "+grade);
	
	
	}
}
