/*
 * Default keyword - It is used to define method inside the interface but normally we cann't define method inside the interface.
 * 
 * NOTE :
 * 
 *  1.	default method is should not be consider as abstract method so below example we create a SAM interface.
 *  2.	@FunctionalInterface - annotation is used to indicate and avoid  other type of interface.
 *  3.	default method can be overrided
 *  4.	interface defines can be achieved only the latest version of java such that above 1.7
 */

@FunctionalInterface

interface Demo
{
	void example();
	default public void show()
	{
		System.out.println("In interface show");
	}
}

class Abc implements Demo
{
	public void example()
	{
		System.out.println("In Abc class example");
	}
	
	public void show()
	{
		System.out.println("An interface show method can be overrided");
	}
}

public class DefaultKeyword {

	public static void main (String[] args)
	{
		Demo obj = new Abc();
		obj.show();
		obj.example();
	}
}
