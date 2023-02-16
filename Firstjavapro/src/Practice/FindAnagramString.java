package Practice;

import java.util.Arrays;

public class FindAnagramString 
{
	public static void main(String[] args)
	{


		String x = "aa";
		String y = "aab";

		char[]a=x.toCharArray();
		char[]b=y.toCharArray();
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		boolean value=Arrays.equals(a,b);
		if(value==true)
		{
			System.out.println("strings are anagram");
		}
		else
		{
			System.out.println("strings are not anagram");
		
		}
	}

}
