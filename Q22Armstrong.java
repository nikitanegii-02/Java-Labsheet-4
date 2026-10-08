import java.util.Scanner;

public class Q22Armstrong {
    static int totalChecks = 0;

    void checkArmstrong(int number) {
        int original = number;
        int temp = number;
        int sum = 0;
        int digits = 0;

        while (temp > 0) {
            digits++;
            temp = temp / 10;
        }

        temp = number;

        while (temp > 0) {
            int digit = temp % 10;
            int power = 1;

            for (int i = 1; i <= digits; i++) {
                power = power * digit;
            }

            sum = sum + power;
            temp = temp / 10;
        }

        totalChecks++;

        if (sum == original) {
            System.out.println("The number is an Armstrong number.");
        } else {
            System.out.println("The number is not an Armstrong number.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Q22Armstrong a = new Q22Armstrong();

        System.out.println("Enter a number:");
        int number = sc.nextInt();

        a.checkArmstrong(number);

        System.out.println("Total Checks: " + totalChecks);

        sc.close();
    }
}