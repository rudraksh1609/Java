package Java1609;
import java.util.Scanner;

public class Bank 
{
    private static int accountCounter = 10011;
    private String name;
    private String address;
    private int accountNumber;
    private double balance;
    public Bank(String name, String address, double balance) 
    {
        this.name = name;
        this.address = address;
        this.accountNumber = accountCounter++;
        this.balance = balance;
    }
    public void displayInfo() 
    {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
    public void deposit(double amount) 
    {
        if (amount > 0) 
        {
            balance += amount;
            System.out.println("Deposited " + amount + ". New balance: " + balance);
        } 
        else 
        {
            System.out.println("Invalid deposit amount.");
        }
    }
    public void withdraw(double amount) 
    {
        if (amount > 0 && amount <= balance) 
        {
            balance -= amount;
            System.out.println("Withdrew " + amount + ". New balance: " + balance);
        } 
        else 
        {
            System.out.println("Invalid or insufficient amount.");
        }
    }
    public void changeAddress(String newAddress) 
    {
        address = newAddress;
        System.out.println("Address updated to: " + address);
    }
    public int getAccountNumber() 
    {
        return accountNumber;
    }
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of depositors: ");
        int numberOfDepositors = scanner.nextInt();
        scanner.nextLine();
        Bank[] depositors = new Bank[numberOfDepositors];
        for (int i = 0; i < numberOfDepositors; i++) 
        {
            System.out.println("Enter details for depositor " + (i + 1));
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Address: ");
            String address = scanner.nextLine();
            System.out.print("Initial Balance: ");
            double balance = scanner.nextDouble();
            scanner.nextLine();
            depositors[i] = new Bank(name, address, balance);
        }
        boolean exit = false;
        while (!exit) 
        {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Display information of a depositor");
            System.out.println("2. Deposit amount");
            System.out.println("3. Withdraw amount");
            System.out.println("4. Change address");
            System.out.println("5. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) 
            {
                case 1:
                    System.out.print("Enter account number: ");
                    int accNum = scanner.nextInt();
                    scanner.nextLine();
                    boolean found = false;
                    for (Bank depositor : depositors) 
                    {
                        if (depositor.getAccountNumber() == accNum) 
                        {
                            depositor.displayInfo();
                            found = true;
                            break;
                        }
                    }
                    if (!found) 
                    {
                        System.out.println("Account number not found.");
                    }
                    break;
                case 2:
                    System.out.print("Enter account number: ");
                    accNum = scanner.nextInt();
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    scanner.nextLine();
                    found = false;
                    for (Bank depositor : depositors) 
                    {
                        if (depositor.getAccountNumber() == accNum) 
                        {
                            depositor.deposit(depositAmount);
                            depositor.displayInfo();
                            found = true;
                            break;
                        }
                    }
                    if (!found) 
                    {
                        System.out.println("Account number not found.");
                    }
                    break;
                case 3:
                    System.out.print("Enter account number: ");
                    accNum = scanner.nextInt();
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    scanner.nextLine();
                    found = false;
                    for (Bank depositor : depositors) 
                    {
                        if (depositor.getAccountNumber() == accNum) 
                        {
                            depositor.withdraw(withdrawAmount);
                            depositor.displayInfo();
                            found = true;
                            break;
                        }
                    }
                    if (!found) 
                    {
                        System.out.println("Account number not found.");
                    }
                    break;
                case 4:
                    System.out.print("Enter account number: ");
                    accNum = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter new address: ");
                    String newAddress = scanner.nextLine();
                    found = false;
                    for (Bank depositor : depositors) 
                    {
                        if (depositor.getAccountNumber() == accNum) 
                        {
                            depositor.changeAddress(newAddress);
                            depositor.displayInfo();
                            found = true;
                            break;
                        }
                    }
                    if (!found) 
                    {
                        System.out.println("Account number not found.");
                    }
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }
}