/*
 * Encapsulation  -->  The data binding with the method to access private or protected modifiers is called encapsulation
 */


class Student		//Super class
{
	private int roll;			
	private String name;
	
	public int getRoll() {
		return roll;
	}
	public void setRoll(int r) {
		this.roll = r;				//'this' keyword indicates the variable of super class
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}

public class GetterAndSetters {		//Main class

	public static void main(String[] args)
	{
		Student s1 = new Student();
		s1.setRoll(23);
		
		System.out.println(s1.getRoll());
		
		s1.setName("Jack");
		System.out.println(s1.getName());
		
	}
}
