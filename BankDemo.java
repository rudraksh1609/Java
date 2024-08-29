package Java;
import java.util.Scanner;

class Bank 
{
    private static int nextAccountNumber = 10011;
    private String depositorName;
    private String address;
    private int accountNumber;
    private double balance;

    public Bank(String depositorName, String address, double balance) 
    {
        this.depositorName = depositorName;
        this.address = address;
        this.balance = balance;
        this.accountNumber = nextAccountNumber++;
    }

    public void displayInfo() 
    {
        System.out.println("Depositor Name: " + depositorName);
        System.out.println("Address: " + address);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }

    public void deposit(double amount) 
    {
        balance += amount;
        System.out.println("Amount deposited Successfully.");
    }

    public void withdraw(double amount) 
    {
        if (balance >= amount) 
        {
            balance -= amount;
            System.out.println("Amount Withdrawn Successfully.");
        } 
        else 
        {
            System.out.println("Insufficient Balance");
        }
    }

    public void changeAddress(String newAddress) 
    {
        address = newAddress;
        System.out.println("Address Updated Successfully");
    }
}

public class BankDemo 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of depositors: ");
        int numDepositors = sc.nextInt();
        sc.nextLine(); // Consume newline

        Bank[] depositors = new Bank[numDepositors];

        // Input depositors' information
        for (int i = 0; i < numDepositors; i++) 
        {
            System.out.println("Enter details for depositor " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Address: ");
            String address = sc.nextLine();
            System.out.print("Initial Balance: ");
            double balance = sc.nextDouble();
            sc.nextLine(); // Consume newline

            depositors[i] = new Bank(name, address, balance);
        }

        // Select which depositor's data to operate on
        System.out.println("Enter the depositor number whose data you want to operate on (1-" + numDepositors + "): ");
        int depositorNumber = sc.nextInt();
        sc.nextLine(); // Consume newline

        // Check if depositor number is valid
        if (depositorNumber >= 1 && depositorNumber <= numDepositors) 
        {
            int index = depositorNumber - 1;

            // Display selected depositor's data
            System.out.println("\nDetails of Depositor " + depositorNumber + ": ");
            depositors[index].displayInfo();

            // Choose operation: Deposit, Withdraw, or Change Address
            System.out.println("\nChoose operation:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Change Address");
            System.out.print("Enter option: ");
            int option = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (option) 
            {
                case 1:
                    // Deposit amount
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = sc.nextDouble();
                    depositors[index].deposit(depositAmount);
                    break;
                case 2:
                    // Withdraw amount
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = sc.nextDouble();
                    depositors[index].withdraw(withdrawAmount);
                    break;
                case 3:
                    // Change address
                    System.out.print("Enter new address: ");
                    String newAddress = sc.nextLine();
                    depositors[index].changeAddress(newAddress);
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        } 
        else 
        {
            System.out.println("Invalid depositor number.");
        }

        sc.close();
    }
}