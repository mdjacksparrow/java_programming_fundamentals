package myproject;

public class StudentMarks 
{

	public static void main(String[] args)
	{
		final int MAX = 5;
		int[] marks = new int[MAX];
		double sum = 0;
		
		if(args.length != MAX)
			{
				System.out.println("pls enter only five marks");
				return;
			}
		
		for(int i=0;i<5;i++)
		{	
			marks[i] = Integer.parseInt(args[i]);
		}
		for(int i=0;i<5;i++)
		{
			sum += marks[i];
		}
		
		System.out.println("Average of marks is " + (sum/MAX));
	}
}
