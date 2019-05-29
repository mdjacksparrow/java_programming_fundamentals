interface Demos
{
	void num();
	default public void show()
	{
		System.out.println("In Demo show");
	}
}

interface MyDemo 
{
	default public void show()
	{
		System.out.println("In MyDemo show");
	}
}

class Example implements Demos,MyDemo
{
	public void num()
	{
		System.out.println("0 - 9 numbers");
	}

	@Override													//2nd way to solve the inbuild method to override it.
	public void show() {
		// TODO Auto-generated method stub
		Demos.super.show();
	}
	
//	public void show()											//1st way to solve the ambuguity problem when define the method inside the class
//	{
//		System.out.println("In Example show");
//	}
}

public class MultipleInterfaceProblem {

	public static void main(String[] args)
	{
		Demos obj = new Example();
		obj.num();
		obj.show();
	}
}
