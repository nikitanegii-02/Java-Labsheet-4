import java.util.Scanner;

public class Q20BankAccount {
    double balance;

    static String bankCode = "SBI001";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Q20BankAccount account = new Q20BankAccount();

        System.out.println("Enter account balance:");
        double initialBalance = sc.nextDouble();

        account.balance = initialBalance;

        System.out.println("Enter amount to withdraw:");
        double withdrawAmount = sc.nextDouble();

        double amount = withdrawAmount;

        System.out.println("\nBank Account Details:");
        System.out.println("Bank Code: " + bankCode);
        System.out.println("Balance: " + account.balance);

        if (amount <= account.balance) {
            account.balance = account.balance - amount;

            System.out.println("Withdrawal Successful.");
            System.out.println("Withdrawn Amount: " + amount);
            System.out.println("Remaining Balance: " + account.balance);
        } else {
            System.out.println("Withdrawal failed.");
            System.out.println("Insufficient Balance.");
        }

        sc.close();
    }
}