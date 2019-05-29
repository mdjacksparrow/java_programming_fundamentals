
public class WrapperClass {

	public static void main(String[] args)
	{
		int i = 5; 		//Primitive class
		Integer i1 = new Integer(i);	//This is called Wrapper class in java but that is deprecated since java version 9
		System.out.println(i1);
		
		String str = "123";
		
		int num = Integer.parseInt(str);		//parseInt method in Integer class used to convert string_num into integer value 
		
		System.out.println(num);
		
		//double f = 2.5;				//Primitive class
		Float fo = new Float(2.5);	//Wrapper or Boxing
		
		System.out.println(fo);
		
		///Below i2 variable we don't need to create object for the Integer class because its auto generating in the back-end.
		Integer i2 = 51 ;			//	autoboxing or autowrapping
		System.out.println(i2);	//	autounboxing or autounwrapping
	}
}
