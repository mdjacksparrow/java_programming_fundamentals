package myproject;

import java.util.Scanner;

public class AdmissionForProfessionalCourse 
{
	
	public static void main(String[] args) 
	{
		int[] marks = new int[4];
		int sum = 0;
		Scanner obj = new Scanner(System.in);
		
		for(int i = 1;i<=4;i++)
		{
			switch(i)
			{
			case 1:
				System.out.print("Enter Maths Mark\t:\t");
				marks[i-1] = obj.nextInt();
				if(marks[i-1] >= 60)
					sum += marks[i-1];
				else {
					System.out.println("You are NOT Eligible for ADMISSION !!");return ;}
				break;
			case 2:
				System.out.print("Enter Physics Mark\t:\t");
				marks[i-1] = obj.nextInt();
				if(marks[i-1] >= 50)
					sum += marks[i-1];
				else {
					System.out.println("You are NOT Eligible for ADMISSION !!");return;}
				break;
			case 3:
				System.out.print("Enter Chemistry Mark\t:\t");
				marks[i-1] = obj.nextInt();
				if(marks[i-1] >= 40)
					sum += marks[i-1];
				else {
					System.out.println("You are NOT Eligible for ADMISSION !!");return;}

				break;
			default:
					if(sum >= 200)
						System.out.println("You are Eligible for ADMISSION !! THANK U !");
					else
							System.out.println("You are NOT Eligible for ADMISSION !! Due to reduced by " + (200-sum)+" marks");
			}
		}
	}
}
