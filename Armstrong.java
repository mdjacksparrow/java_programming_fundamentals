package myproject;

import java.util.Scanner;

class Arms
{
	int rem , sum;
	int cube(int x)
	{
		return x*x*x;
	}
	
	 int armstrong(int data)
	{
		while(data > 0)
		{
			rem = data % 10;
			data = data/10;			
			sum = this.sum +(rem*rem*rem);
		}
			return sum;
	}
}

public class Armstrong {

	public static void main(String[] args) {
		
		int condition,copy;
		int num;
		Scanner obj = new Scanner(System.in);
		num = obj.nextInt();						//num  153 or 371
		copy = num;
		Arms a = new Arms();
		condition = a.armstrong(num);
		if(condition == copy)
			System.out.println("This num" + num + " is Armstrong number");
		else
			System.out.println("This is not armstrong number");
		
		
	}

}
