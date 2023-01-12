package PracticeNumber;

public class Multiplication2to10 
{
	public static void main(String[] args)
	{
		int i,j,z;
		for(i=2;i<=10;i++)
		{
			for(j=1;j<=10;j++)
			{
				z=j*i;
				System.out.print(z+" ");
			}
			System.out.println();
		}
	}

}
