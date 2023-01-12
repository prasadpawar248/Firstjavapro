package Day5;

	class Father 
	{
		String color="blue";
	}
	class child extends Father
	{
		String color="black";
		void print()
	{
		System.out.println(color);
		System.out.println(super.color); // super can be used immediate parent class instance variable 
	}
	
	public static void main(String[] args) {
		
		child d = new child();
		d.print();
	}	
}
