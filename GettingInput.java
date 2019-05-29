/*
 * Scanner class contain more no of input function from end of the user such as nextInt and so on.
 * 		It is reduced more simplicity from BufferedReader class.
 * 		It is doesn't need error handling.
 * 		It is doesn't need much no of codes.
 * 
 * NOTE :	Ctrl + Shift + o		-->		Press inside the Scanner's constructor to create import file from IDE(Eclipse) by default
 */

import java.util.Scanner;

public class GettingInput
{

	public static void main(String[] args)
	{
		int n;
		
		System.out.println("Enter a number...");
		Scanner in = new Scanner(System.in);			//Declared object of Scanner resource
		
		n = in.nextInt();
		in.close();				//close the resource object
		
		System.out.println("The num is " + n );
		
	}

}

