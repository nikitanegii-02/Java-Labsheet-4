import java.util.Scanner;

public class Q25Factorial {
    static int totalCalls = 0;

    void calculateFactorial(int number) {
        long factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }

        totalCalls++;

        System.out.println("Factorial: " + factorial);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Q25Factorial f = new Q25Factorial();

        System.out.println("Enter a number:");
        int number = sc.nextInt();

        f.calculateFactorial(number);

        System.out.println("Total Calls: " + totalCalls);

        sc.close();
    }
}