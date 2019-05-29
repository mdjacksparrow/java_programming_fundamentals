/*
 * NOTE :	Each and every sub class have the constructor of super class so whenever calling the constructor of sub-class that the 
 * super class will be also called.
 * 
 * 			First of all working in the default constructor of super class then will working in the sub class constructor.
 * 
 * 			But we can change the order of calling method overload of super class constructors using 'SUPER' keyword
 *
 * 			That the example for shown below
 */



class A		//Super class
{
	public A()
	{
		System.out.println("class A");
	}
	public A(int i)
	{
		System.out.println("In Class A");
	}
	
	public void show()			//This method is used for avoiding attention error from not using object
	{
		System.out.println("Executed successfully");
	}
}

class B extends A			//Sub class
{
	public B()
	{
		super();
		System.out.println("class B");
	}
	public B(int i)
	{
		super(i);
		System.out.println("In Class B");
	}
}


public class SuperMethod {

	public static void main(String[] args)
	{
		B obj = new B(2);
		obj.show();
	}
	
}
