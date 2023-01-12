package Day1;

public class Operatorinjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=10;  
		int y=20;
		
		//Arithmetic operator + - / * %
		
		System.out.println("-----Arithmetic operator------");
		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x*y);
		System.out.println(x/y);
		System.out.println(x%y);
		
		//Relational operator == < > <= >= !=
		
		System.out.println("-----Relational operator------");
		System.out.println(x==y);  //false
		System.out.println(x<y);  // true
		System.out.println(x>y);  //false
		System.out.println(x<=y); //true
		System.out.println(x>=y);  //false
		System.out.println(x!=y);  //true
		
		//Logical operator  && || !
		
		boolean a=true;
		boolean b=false;
		
		System.out.println("-----Logical operator------");
		System.out.println(a && b);
		System.out.println(a || b);
		System.out.println(!a);
		System.out.println(!b);
		
		// Increment/decrement operator
		
		System.out.println("-----------Increment decrement operator----------");
		x=10;
		x++;         //x=x+1;
		
		System.out.println(x);
		
		y=20;
		y--;      // y=y-1
		System.out.println(y);
		
		
		
		
	}

}
