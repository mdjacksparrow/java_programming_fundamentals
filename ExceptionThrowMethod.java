/*
 * Errors are classified as two types.There are
 * 
 * 		1. Checked error or handled error
 * 		2. Unchecked error	un-handled error
 * 
 * NOTE : 
 * 
 *		1.	Below program is express type two error or un-handled error and its also called as runtime error.
 *		2.	BufferedReader is used to get user input function.
 *		3.	readLines()	-	used to get string from end of the user.
 *		4.	parseInt()	- 	used to convert string to integer.
 *		5.	When we created resource object that is must be closed like that inside the finally block.
 *			Otherwise that resource consume large amount of "memory space".
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ExceptionThrowMethod {

	public static void main(String[] args) throws Exception

	{
		int n = 0;
		
		System.out.println("Enter a number : ");
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		/*	Try with Resource syntax */
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in)))	//This features is adopted by jdk 7 above versions
		{																				//It is also reduced the code optimization
			n = Integer.parseInt(br.readLine());										//It is also reduced the time 
		}																				//NOTE : It is also closed the resource object
		
//		try 
//		{
//			n = Integer.parseInt(br.readLine());
//		}
////		
//		catch (ArithmeticException e)					//It is only work for ArithmeticExpression not for all in this situation the error is handled by "throws Exception" by default
//		{
//			System.out.println("Pls Enter correct thing");
//		}
//		
//		catch (Exception e)
//		{
//			{
//				System.out.println("Pls Enter correct thing");
//			}
//			
//		}
		
//		finally
//		{
//			br.close();			//br is a resource closed inside the finally block
//			System.out.println("Resource closed");
//		}
		System.out.println(n);
	}

}
