package Day7;

public class CheckedException {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("Program is started");
		
// Interrupted Exception type
	
// Handled by try catch method
		
		/*try {
			Thread.sleep(5000);
			} 
		catch (InterruptedException e) 
		{
			
		}  */
		
// Handled by add throw declaration
		
		Thread.sleep(5000);
		
		
		
		System.out.println("Program is ended");
		

	}

}
