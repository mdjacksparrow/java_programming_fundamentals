/*
 * NOTE 	:	Multiple inheritance can be achieved by using 'interface' 
 */


interface Writer
{
	void show();		//Don't declare public and abstract are aldready declared in-build
}
class Pen implements Writer
{
	public void show()
	{
		System.out.println("Im a pen");
	}
}
class Pencil implements Writer
{
	public void show()
	{
		System.out.println("Im a pencil");
	}
}

class User  
{
	public void write(Writer o)
	{
		o.show();
	}
}
public class Interface {

	public static void main(String[] args)
	{
		Pen pn = new Pen();
		Pencil pc = new Pencil();
		
		User obj = new User();
	//	pn.show();
	//	pc.show();
		obj.write(pn);
	}
} 