package Java1609;
import java.util.Scanner;
class InvalidEmployeeNameException extends Exception 
{
    public InvalidEmployeeNameException(String message) 
    {
        super(message);
    }
}

class InvalidEmployeeIdException extends Exception 
{
    public InvalidEmployeeIdException(String message) 
    {
        super(message);
    }
}

class InvalidDepartmentIdException extends Exception 
{
    public InvalidDepartmentIdException(String message) 
    {
        super(message);
    }
}

public class EmployeeDetail 
{
    public static void validateName(String name) throws InvalidEmployeeNameException 
    {
        if (name == null || name.isEmpty() || !Character.isUpperCase(name.charAt(0))) 
        {
            throw new InvalidEmployeeNameException("First letter of employee name should be in capital letter.");
        }
    }
    public static void validateEmployeeId(int employeeId) throws InvalidEmployeeIdException 
    {
        if (employeeId < 2001 || employeeId > 5001) 
        {
            throw new InvalidEmployeeIdException("Employee id should be between 2001 and 5001.");
        }
    }
    public static void validateDepartmentId(int departmentId) throws InvalidDepartmentIdException 
    {
        if (departmentId < 1 || departmentId > 5) 
        {
            throw new InvalidDepartmentIdException("Department id should be an integer between 1 and 5.");
        }
    }
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        try 
        {
            System.out.print("Enter Employee Name: ");
            String name = scanner.nextLine();
            validateName(name);
            System.out.print("Enter Employee ID: ");
            int employeeId = scanner.nextInt();
            validateEmployeeId(employeeId);
            System.out.print("Enter Department ID: ");
            int departmentId = scanner.nextInt();
            validateDepartmentId(departmentId);
            System.out.println("Employee Details:");
            System.out.println("Name: " + name);
            System.out.println("Employee ID: " + employeeId);
            System.out.println("Department ID: " + departmentId);
        }
        catch (InvalidEmployeeNameException | InvalidEmployeeIdException | InvalidDepartmentIdException e) 
        {
            System.out.println("Error: " + e.getMessage());
        }
        finally 
        {
            scanner.close();
        }
    }
}