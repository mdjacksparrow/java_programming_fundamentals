/*
 * Inheritance have two types ...
 * 
 * 1.	IS-A 
 * 2.	HAS-A
 * 
 * 1.	That is used all methods through the object like that we are creating object for any class inside the main method
 * 
 * 2.	It is Derived from before or parent class like that below Calculator example
 * 
 * NOTE:	Java support multi inheritance but not support multiple inheritance.
 */


class Calculator				//Super class like that grandpa
{
	public int add(int a ,int b)
	{
		return a + b;
	}
}

class Calcadv1 extends Calculator	//Sub-class like that parent
{
	public int sub(int a , int b)
	{
		return a - b;
	}
}

class Calcadv2 extends Calcadv1		//Sub-class like that child
{
	public int multi(int a ,int b)
	{
		return a * b;
	}
}


public class Inheritance {

	public static void main(String[] args)
	{
		Calcadv2 obj = new Calcadv2();
		
		System.out.println(obj.add(3, 6));
		System.out.println(obj.multi(4, 3));
		System.out.println(obj.sub(5, 2));
		
	}
}
