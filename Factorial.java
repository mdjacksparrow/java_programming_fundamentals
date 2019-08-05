package myproject;

import java.util.Scanner;

class Fact
{
	int num,fact = 1;
	void factorial()
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("enter num  :  ");
		num = obj.nextInt();
		for (int i = 1;i<=num;i++)
			fact *= i;
		System.out.println("fact  :  "  + fact);
	}
}
public class Factorial
{
	public static void main(String[] args)
	{
		Fact s=new Fact();
		s.factorial();
	}
}
