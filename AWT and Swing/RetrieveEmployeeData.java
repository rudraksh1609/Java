package test;
import java.sql.*;
public class RetrieveEmployeeData 
{
    public static void main(String[] args) 
    {
        try 
        {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/EmployeeDB", "root", "Rudraksh@0702");
            String query = "SELECT * FROM Employee";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) 
            {
                String name = resultSet.getString("Name");
                String code = resultSet.getString("Code");
                String designation = resultSet.getString("Designation");
                float salary = resultSet.getFloat("Salary");
                System.out.println("Name: " + name + ", Code: " + code + ", Designation: " + designation + ", Salary: " + salary);
            }
            connection.close();
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
        }
    }
}
