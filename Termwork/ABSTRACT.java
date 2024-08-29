package Java1609;
abstract class Shape 
{
    abstract double rectangleArea(double length, double breadth);
    abstract double squareArea(double side);
    abstract double circleArea(double radius);
}
class Area extends Shape 
{
    @Override
    double rectangleArea(double length, double breadth) 
    {
        return length * breadth;
    }
    @Override
    double squareArea(double side) 
    {
        return side * side;
    }
    @Override
    double circleArea(double radius) 
    {
        return Math.PI * radius * radius;
    }
}

public class ABSTRACT 
{
	 public static void main(String[] args) 
	 {
	        Area area = new Area();
	        double rectangleLength = 10;
	        double rectangleBreadth = 20;
	        double rectangleArea = area.rectangleArea(rectangleLength, rectangleBreadth);
	        System.out.println("Area of Rectangle: " + rectangleArea);
	        double squareSide = 10;
	        double squareArea = area.squareArea(squareSide);
	        System.out.println("Area of Square: " + squareArea);
	        double circleRadius = 20;
	        double circleArea = area.circleArea(circleRadius);
	        System.out.println("Area of Circle: " + circleArea);
	    }
}