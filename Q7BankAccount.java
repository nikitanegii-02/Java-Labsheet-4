import java.util.Scanner;

public class Q7BankAccount {
    long accountNumber;
    double balance;

    static String bankName = "State Bank";

    void deposit(double amount) {
        double depositAmount = amount;
        balance = balance + depositAmount;

        System.out.println("Deposited Amount: " + depositAmount);
        System.out.println("Updated Balance: " + balance);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Q7BankAccount account = new Q7BankAccount();

        System.out.println("Enter account number:");
        long accNumber = sc.nextLong();

        System.out.println("Enter initial balance:");
        double initialBalance = sc.nextDouble();

        account.accountNumber = accNumber;
        account.balance = initialBalance;

        System.out.println("\nBank Details:");
        System.out.println("Bank Name: " + bankName);
        System.out.println("Account Number: " + account.accountNumber);
        System.out.println("Balance: " + account.balance);

        System.out.println("\nEnter amount to deposit:");
        double amount = sc.nextDouble();

        account.deposit(amount);

        sc.close();
    }
}