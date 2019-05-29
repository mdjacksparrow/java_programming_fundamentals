/*
 * NOTE :	Anonymous class  is used to replace the class we want needed
 * 			That class used only one time
 */

class Anon
{
	public void show()
	{
		System.out.println("Jacksparrow");
	}
}


public class AnonymousClass {

	public static void main(String[] args)
	{
		Anon obj = new Anon()
				{									//Anonymous class
					public void show()
					{
							System.out.println("Mdjack");
					}
				};
		
		obj.show();
	}
}
