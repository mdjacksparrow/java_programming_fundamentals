import java.util.Scanner;

public class Test {

	public static void main(String[] args)
	{
		int i;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the value of i = ");
		
		i = in.nextInt();
		
		System.out.println("The value is " + i);
		
		in.close();
	}
}