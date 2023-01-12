package PracticeNumber;

public class GenerateFibonachiNumber {

	public static void main(String[] args) {
		
	//Generate Fibonachi number	
		int a=0,b=1,sum=0;
		String rw="";
		
		for(int i=0;i<10;i++)
		{
			sum=a+b;
			//if(sum%2==1)
		//	{
			//System.out.print(" "+sum);
			//}
			rw=sum+" "+rw;
			a=b;
			b=sum;
		}
		System.out.println(rw.trim());

	}

}
