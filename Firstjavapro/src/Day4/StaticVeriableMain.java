package Day4;

public class StaticVeriableMain {

	public static void main(String[] args) {
	
		
		System.out.println(StaticVeriable.a);  // static var.
		StaticVeriable.method1(10,20);   // static method

		StaticVeriable obj = new StaticVeriable();  // non static
		System.out.println(obj.b);
		obj.method2();
	}

}
