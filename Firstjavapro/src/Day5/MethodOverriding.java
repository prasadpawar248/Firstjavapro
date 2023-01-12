package Day5;

class bank
{
	double intrest()
	{
		return 0;
		
	}
	
}
class sbi extends bank
{
	double intrest()
	{
		return 10.5;
	}
	
}
class axis extends bank
{
	void print(double intrest)
	{
		System.out.println(intrest);
	}
	
}
public class MethodOverriding {

	public static void main(String[] args) {

		sbi obj = new sbi();
		System.out.println(obj.intrest());
		
		axis obj1 = new axis();
		obj1.print(12.85);
	}

}
