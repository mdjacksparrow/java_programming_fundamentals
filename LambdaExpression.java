/*
 * Interface has three type there are...
 * 
 * 1.	Marker interface		-->		That is doesn't contain any method.	Ex:	steblization in-build java interface
 * 2.	Single abstract method	-->		Its contain only one method and is simply said SAM interface
 * 3.	Normal interface		-->		It contain more than one method.
 * 
 * NOTE	:	SAM interface only support the LAMBDA expression
 * syntax:
 * 			object = ()		->		expression
 */


interface Lambda
{
	void show();
}

/*
 * class Abc implements Lambda
 * {
 * 		public void show()
 * 		{
 * 			System.out.println("Hi i am jack"):
 * 		}
 * }
 */

public class LambdaExpression {

	public static void main(String[] args)
	{
		Lambda obj = ()  ->		System.out.println("Hello i am jack");		//Lambda expression -> is replaced the class Abc codes
		
		obj.show();
 	}
}
