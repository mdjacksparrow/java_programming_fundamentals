package myproject;

import java.util.Scanner;

class Temp
{
	double celsius,fahrenheit;
	void getData()
	{
		Scanner obj=new Scanner(System.in);
	    System.out.println("enter farhenheit:  ");
	    fahrenheit=obj.nextDouble();
	    celsius=(fahrenheit-32)/1.8;
		System.out.println("celsius  " + celsius);
	}
}
public class TempConvertor 
{
	public static void main(String[] args)
	{
		Temp s=new Temp();
		s.getData();
	}
}
