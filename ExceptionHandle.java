/*
 * NOTE :	Exception is declared as top of all exception that show the error of your program/
 * 			Because Exception class contain all the exception handled.
 */

public class ExceptionHandle {

	public static void main(String[] args)
	{
		try
		{
		int i = 5;
		int j = 0;
		int num[] = null;
		
		num[3] = 4;			//Null pointer error this line
		
		double k = i/j;
		System.out.println("The output is " + k);
		}
		
		catch(ArithmeticException e)					//multiple catch block using exception handling
		{
			System.out.println("Any number cannot be divided zero");
		}
		
		catch(NullPointerException e)					//multiple catch block using exception handling
		{
			System.out.println("Any number cannot be stored before null value");
		}
		
		catch(Exception e)								//Exception contain all the exception in java
		{
			System.out.println("The error is occured");
		}
		
		finally
		{
			System.out.println("Program is ended");
		}
	}
}
