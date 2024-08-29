package Java;
class Vehicle
{
	public String brand;
	public String model;
	public int year;
	
	public Vehicle(String brand, String model, int year)
	{
		this.brand=brand;
		this.model=model;
		this.year=year;
	}
	public void displayInfo()
	{
		System.out.println("Brand: "+brand);
		System.out.println("Model: "+model);
		System.out.println("Year: "+year);
	}
}
class Car extends Vehicle
{
	public int numOfDoors;
	
	public Car(String brand,String model,int year,int numOfDoors)
	{
		super(brand,model,year);
		this.numOfDoors=numOfDoors;
	}
	public void displayCarInfo()
	{
		displayInfo();
		System.out.println("Number of Doors: "+ numOfDoors);
	}
}
class Truck extends Vehicle
{
	public int payLoadCapacity;
	public Truck(String brand,String model,int year, int payLoadCapacity)
	{
		super(brand,model,year);
		this.payLoadCapacity=payLoadCapacity;
	}
	public void displayTruckInfo()
	{
		displayInfo();
		System.out.println("PayLoad Capacity: "+ payLoadCapacity+" lbs");
	}
}
public class VehicleDemo 
{
	public static void main(String[]args)
	{
		Car car=new Car("Toyota","Camry",2022,4);
		Truck truck=new Truck("Ford","F-150",2022,2000);
		
		System.out.println("\nCar Information: ");
		car.displayCarInfo();
		
		System.out.println("\nTruck Information: ");
		truck.displayTruckInfo();
	}
}