package Practice;

public class CountNoRepeatWords {

	public static void main(String[] args) {
		
		String sen="india is my country";
		
		String sent=sen.replace("india", "america");
				
		int x=sen.length()-sen.replace("i", "").length();
		System.out.println("Before replace india no. of i is:"+" "+ x);

		int y=sent.length()-sent.replace("i", "").length();
		System.out.println("After replace india no. of i is:"+" "+ y);
	
	}

}
