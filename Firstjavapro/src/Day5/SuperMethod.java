package Day5;

	class abc
	{
		String color= "red";
		
		void show()
		{
			System.out.println("i am a boy");
		}
	}
	class def extends abc
	{
		String color="green"; 
		void show()
		{
			System.out.println("i am a girl");
			super.show();
		}
	}
	
	public class SuperMethod
	{

	public static void main(String[] args)
	{
		def x = new def();
		x.show();
		
	}
	
	}

