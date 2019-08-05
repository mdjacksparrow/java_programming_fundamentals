package myproject;

import java.util.Scanner;

public class StringList 
{

	

	public static void main(String[] args)
	{
		String[] names = new String[5];		
		//get names using loop
		for(int i = 0 ;i<5;i++)
		{
			System.out.print("Enter "+(i+1)+" Name\t:\t");
			names[i] = new Scanner(System.in).nextLine();
		}
		
		//display names
		for(String i:names)
			System.out.println(i);
	}

}
