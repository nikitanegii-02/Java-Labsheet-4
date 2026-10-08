import java.util.Scanner;

public class Q23PrimeChecker {
    static int totalPrimeChecks = 0;

    void checkPrime(int number) {
        boolean prime = true;

        if (number <= 1) {
            prime = false;
        } else {
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    prime = false;
                    break;
                }
            }
        }

        totalPrimeChecks++;

        if (prime) {
            System.out.println("The number is Prime.");
        } else {
            System.out.println("The number is not Prime.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Q23PrimeChecker p = new Q23PrimeChecker();

        System.out.println("Enter a number:");
        int number = sc.nextInt();

        p.checkPrime(number);

        System.out.println("Total Prime Checks: " + totalPrimeChecks);

        sc.close();
    }
}