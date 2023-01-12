package Day7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ThrowKeywords {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		FileReader fr= null;
		fr= new FileReader("C:\\Users\\comp\\Documents\\text.txt");
		
		
		@SuppressWarnings("resource")
		BufferedReader bfr=new BufferedReader(fr);
		System.out.println(bfr.readLine());
		
		Thread.sleep(5000);
		
		System.out.println("thread is working");
		

	}

}
