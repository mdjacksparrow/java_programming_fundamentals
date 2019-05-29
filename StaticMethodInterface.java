/*
 * NOTE :	
 * 			1.	Any variable declare inside the interface as final variable by default or manual.
 * 			2.	We can call the static method inside the interface without creating an object.
 *
 */

interface Cal
{
	int i = 10;					//This is final variable by default inside the interface
	void add();
	static void show()
	{
		System.out.println("The add method is now working");
	}
}

class Add implements Cal
{
	int j = 4;
	public void add()
	{
		int sum = i +j;
		System.out.println("The sum is i = " + i + " and " + "j = " + j + " --> " + sum);
	}
}

public class StaticMethodInterface {

	public static void main(String[] args)
	{
		Cal obj = new Add();
		
		Cal.show(); 			//Calling show method without creating object 
		obj.add();				//Calling add method with using object
	}
}
