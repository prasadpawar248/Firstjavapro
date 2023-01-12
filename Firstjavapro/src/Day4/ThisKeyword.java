package Day4;

public class ThisKeyword {

	int x=0;
	int y=0;
	
	/*void display(int a, int b)
	{
		x=a;
		y=b;
	}*/
	
	void display(int x, int y)
	{
		this.x=x;   // this keyword is used for same parameter name
		this.y=y;
	}
	
	
	void print()
	{
		System.out.println(x+y);
	}
	
	
	public static void main(String[] args) {
	
		ThisKeyword obj = new ThisKeyword();
		
	obj.display(5, 6);
	obj.print();
		

	}

}
