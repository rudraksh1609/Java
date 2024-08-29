package Java;
abstract class Shape
{
	abstract void rectArea(double length,double width);
	abstract void sqArea(double side);
	abstract void cirArea(double radius);
}
class Area extends Shape
{
	@Override
	void rectArea(double length,double width)
	{
		double area=length*width;
		System.out.println("Area of Rectangle: "+area);
	}
	@Override
	void sqArea(double side)
	{
		double area=side*side;
		System.out.println("Area of Square: "+area);
	}
	@Override
	void cirArea(double radius)
	{
		double area=Math.PI*radius*radius;
		System.out.println("Area of Circle: "+area);
	}
}
public class AreaDemo 
{
	public static void main(String[]args)
	{
		Area ac=new Area();
		ac.rectArea(5, 10);
		ac.sqArea(7);
		ac.cirArea(4);
	}
}