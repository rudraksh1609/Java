package Java;
import java.util.Scanner;

class Employee 
{
    private String name;
    private int empId;
    private String dept;

    // Parameterized constructor
    public Employee(String name, int empId, String dept) 
    {
        this.name = name;
        this.empId = empId;
        this.dept = dept;
    }

    // Getter method for name
    public String getName() 
    {
        return name;
    }

    // Getter method for empId
    public int getEmpId() 
    {
        return empId;
    }

    // Getter method for dept
    public String getDept() 
    {
        return dept;
    }
}
public class Boss 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        // Input number of employees
        System.out.print("Enter the number of employees (n >= 5): ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume newline

        // Validate number of employees
        if (n < 5) 
        {
            System.out.println("Please enter a number greater than or equal to 5.");
            return;
        }

        // Create an array of employees
        Employee[] employees = new Employee[n];

        // Input details for each employee
        for (int i = 0; i < n; i++) 
        {
            System.out.println("Enter details for employee " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Employee ID: ");
            int empId = sc.nextInt();
            sc.nextLine(); // Consume newline
            System.out.print("Department: ");
            String dept = sc.nextLine();
            employees[i] = new Employee(name, empId, dept);
        }

        // Input employee ID to search
        System.out.print("Enter the Employee ID to search: ");
        int searchEmpId = sc.nextInt();
        sc.close();

        // Search for employee and print details if found
        boolean found = false;
        for (Employee emp : employees) 
        {
            if (emp.getEmpId() == searchEmpId) 
            {
                found = true;
                System.out.println("Employee found. Details:");
                System.out.println("Name: " + emp.getName());
                System.out.println("Employee ID: " + emp.getEmpId());
                System.out.println("Department: " + emp.getDept());
                break;
            }
        }

        // Print message if employee not found
        if (!found) 
        {
            System.out.println("Employee ID not present.");
        }
    }
}