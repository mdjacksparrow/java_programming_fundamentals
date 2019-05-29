class A1
{
	public void show()
	{
		System.out.println("In class A");
	}
}

class B1 extends A1
{
	@Override								///That's used to define method overriding when complisation to avoid unneccessory bugs
	public void show()
	{
		System.out.println("In class B");
	}
}
public class MethodOverriding {

	public static void main(String[] args)
	{
		B1 obj = new B1();
		
		obj.show();
	}
}

