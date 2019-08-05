package myproject;

class Area
{	
	//circle
	double area(int r)
	{
		return (4*3.14)*(r*r);
	}
	
	//rectangle
	int area(int l, int b)
	{
		return l*b;
	}
	
	//triangle
	double area(double half,int b , int h)
	{
		return half*b*h;
	}
}



public class AreaOverloading
	{

	public static void main(String[] args)
	{
		Area obj = new Area();
		
		double area;
		area = obj.area(5);
		System.out.println("circle area\t:\t"+area);
		area = obj.area(4,5);
		System.out.println("Rectange area\t:\t"+area);
		area = obj.area(0.5,3,7);
		System.out.println("Trianle area\t:\t"+area);		

	}

}
