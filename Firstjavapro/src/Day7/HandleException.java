package Day7;

public class HandleException {

	public static void main(String[] args) {
		
		int a=100;
		
		System.out.println("Program is stared");

//Syntax 1
		
	// We Can Handle Exception by Try and Catch  				
		try
		{
			System.out.println(a/0);
		}
		catch (ArithmeticException Exception)
		{
			System.out.println("Exception is catched as arithmetic");
		}
		catch (NullPointerException Exception)
		{
			System.out.println("Exception is catched as null pointer");
		}
		catch (NumberFormatException Exception)
		{
			System.out.println("Exception is catched as number formate");
		}
		
//Syntax 2

	// Here we catched exception without mention exception type
		String s="abc";
		try
		{
		@SuppressWarnings("unused")
		int i=Integer.parseInt(s);
		}
		catch(Exception type)  // here we are not mention type of exception
		{
			System.out.println("Exception is catch as number formate");
		}
		
//Syntax 3
		
	//Here finally block is by default execute if exception catch or not
		
		int [] b= new int[5]; 

		
		try
		{
			b[5]= 45;
		}
		catch(Exception type)
		{
			System.out.println("Exception is catch as arry");
		}
		finally
		{
			System.out.println("finaly blocked is excuted");
		}
		
		
		System.out.println("Program is ended");
	}

}
