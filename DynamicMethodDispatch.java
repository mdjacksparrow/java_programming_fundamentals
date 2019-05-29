class A2			//Super class as reference class in this program
{
	public void show()
	{
		System.out.println("In A class");
	}
}

class B2 extends A2		//Sub class as actual working class and reference of class A in this program
{
	public void show()
	{
		System.out.println("In B class");
	}
	
//	public void test()
//	{
//		System.out.println("In testing");
//	}
}

class C2 extends A2		//Sub class as actrual working class and reference of class A in this program
{
	public void show()
	{
		System.out.println("IN C class");
	}
}
public class DynamicMethodDispatch {

	public static void main(String[] args)
	{
		A2 obj = new B2();	//runtime Polymorphism
		obj.show();		
		
		obj = new C2();		//Dynamic Dispatch Method
		obj.show();
//		obj.test();
	}
}
