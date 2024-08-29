package Java1609;
import java.util.*;
class Employee
{
	private String name;
	private int EmpId;
	private String dept;
	public Employee(String name,int EmpId,String dept)
	{
		this.name=name;
		this.EmpId=EmpId;
		this.dept=dept; 
	}
	public void printData()
	{
		System.out.println("Employee ID : "+(this.EmpId));
		System.out.println("Employee Name : "+(this.name));
		System.out.println("Employee Department : "+(this.dept));
	}
	public int getID()
	{
		return EmpId;
	}
}
public class Employee1 
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of employees (should be >= 5): ");
		int n=sc.nextInt();
		int i,EmpId,search_id,f=0;
		String name,dept;
		if(n<5)
		{
			System.out.println("No. of Employee should be greater than 4");
		}
		else
		{
			Employee emp[]=new Employee[n];
			System.out.println("Enter details of "+n+" Employees : ");
			for(i=0;i<n;i++)
			{
				System.out.print("Enter ID : ");
				EmpId=sc.nextInt();
				sc.nextLine();
				System.out.print("Enter Name : ");
				name=sc.nextLine();
				System.out.print("Enter Department : ");
				dept=sc.nextLine();
				sc.nextLine();
				emp[i]=new Employee(name,EmpId,dept);
			}
			System.out.print("Enter Employee ID to be searched : ");
			search_id=sc.nextInt();
			for(i=0;i<n;i++)
			{
				if(emp[i].getID() == search_id)
				{
					f=1;
					break;
				}
			}
			if(f == 1)
				emp[i].printData();
			else
				System.out.println("EmpId not Found");
		}
	}
}