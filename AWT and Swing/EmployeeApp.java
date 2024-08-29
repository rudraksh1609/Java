package test;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
public class EmployeeApp 
{
    private static JTextField nameField;
    private static JTextField codeField;
    private static JTextField designationField;
    private static JTextField salaryField;
    public static void main(String[] args) 
    {
        JFrame frame = new JFrame("Employee Database");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        JLabel nameLabel = new JLabel("NAME");
        nameLabel.setBounds(20, 20, 100, 30);
        frame.add(nameLabel);
        nameField = new JTextField();
        nameField.setBounds(150, 20, 200, 30);
        frame.add(nameField);
        JLabel codeLabel = new JLabel("CODE");
        codeLabel.setBounds(20, 60, 100, 30);
        frame.add(codeLabel);
        codeField = new JTextField();
        codeField.setBounds(150, 60, 200, 30);
        frame.add(codeField);
        JLabel designationLabel = new JLabel("DESIGNATION");
        designationLabel.setBounds(20, 100, 100, 30);
        frame.add(designationLabel);
        designationField = new JTextField();
        designationField.setBounds(150, 100, 200, 30);
        frame.add(designationField);
        JLabel salaryLabel = new JLabel("SALARY");
        salaryLabel.setBounds(20, 140, 100, 30);
        frame.add(salaryLabel);
        salaryField = new JTextField();
        salaryField.setBounds(150, 140, 200, 30);
        frame.add(salaryField);
        JButton saveButton = new JButton("SAVE");
        saveButton.setBounds(20, 200, 80, 30);
        frame.add(saveButton);
        JButton resetButton = new JButton("RESET");
        resetButton.setBounds(120, 200, 80, 30);
        frame.add(resetButton);
        JButton exitButton = new JButton("EXIT");
        exitButton.setBounds(220, 200, 80, 30);
        frame.add(exitButton);
        saveButton.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                saveEmployeeData();
            }
        });
        resetButton.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                resetFields();
            }
        });
        exitButton.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                System.exit(0);
            }
        });
        frame.setVisible(true);
    }
    private static void saveEmployeeData() 
    {
        String name = nameField.getText();
        String code = codeField.getText();
        String designation = designationField.getText();
        String salary = salaryField.getText();
        try 
        {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/EmployeeDB", "root", "Rudraksh@0702");
            String query = "INSERT INTO Employee (Name, Code, Designation, Salary) VALUES (?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, name);
            statement.setString(2, code);
            statement.setString(3, designation);
            statement.setFloat(4, Float.parseFloat(salary));
            statement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Saved");
            connection.close();
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error Saving Data");
        }
    }
    private static void resetFields() 
    {
        nameField.setText("");
        codeField.setText("");
        designationField.setText("");
        salaryField.setText("");
    }
}