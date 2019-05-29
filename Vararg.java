class Calc
{
	public int add(int ...n)		// This is simplify form of more passed parameters using "THREE DOTS" operator 
	{
		int sum = 0;
		for (int k:n)
			sum += k;
		return sum;
	}
}



public class Vararg {

	public static void main(String args[])
	{
		Calc obj = new Calc();				// Creating object for Calc class
		
		System.out.println(obj.add(5,2,5,7,3,2,5,45));
		
	}
}
