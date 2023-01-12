package Practice;

public class FindAnagramString 
{
	public static void main(String[] args)
	{
		String a="army";
		String b="mary";
		
		int x=a.length();
		int y=b.length();
		
		
		int count=0;
		
		if(x==y)
		{
			for(int i=0;i<x;i++)
			{
				boolean value=false;
				for(int j=0;j<y;j++)
				{
					if((a.charAt(i))==(b.charAt(j)))
					{
						value=true;	
					}
					
				}
				if(value==true)
				{
					count++;
				}
			}
		}
	
		if(count==4)
		{
			System.out.println("Strings are Anagram");
		}
		else
		{
			System.out.println("Strings are not Anagram");
		}
		
	}

}
