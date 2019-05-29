/*
 *'final' keyword is used to make constant variable , method and class.
 * 
 * final variable - cannot be changed the value once we assigned
 * final method   - cannot be override the same method as derived or sub class methods or other methods	
 * final class    - cannot be extends other sub-class and also doen't derived sub-methods.
 * 
 */

 final class A3							//final class
{
	public final void show()			//final method
	{
		System.out.println("In show A");
	}
}

class B3 //extends A3
{
	public void show()
	{
		System.out.println("In show B");
	}
}
public class FinalKeyword {

	public static void main(String[] args)
	{
		B3 obj = new B3();
		obj.show();
		final int i = 5;				//final variable
		System.out.println(i);
		
	//	i = 34;
	}

}
