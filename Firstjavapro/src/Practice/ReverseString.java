package Practice;

public class ReverseString {

	public static void main(String[] args) {
		
		System.out.println("--------Reverse Sentence-------");
	
		String s="india is my best country";
		
		String  words[]= s.split(" ");
		
	//	String rs="";
		
		for(int x=words.length-1; x>=0; x--)
		{
			System.out.print(words[x]+" ");
		}
		
		
		/*for(String w:words)
			{
			String rw="";
		
				for(int i=w.length()-1; i>=0; i--)
				{
					rw=rw+w.charAt(i);
				}
			//	rs=rw+" "+rs;System.out.println(rw);
				System.out.print(rw);
			}*/
			
		System.out.println();
		
		
		System.out.println("--------Reverse String-------");
		
		String a="welcome to india";
	
		String rev="";
		
		for(int i=a.length()-1; i>=0; i--)
		{
			rev=rev+a.charAt(i);
		}
		
		System.out.println(rev);
		
		
		
	}
}

