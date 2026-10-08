import java.util.Scanner;

public class Q24Fibonacci {
    static int seriesCount = 0;

    void displayFibonacci(int n) {
        int first = 0;
        int second = 1;
        int next;

        System.out.println("Fibonacci Series:");

        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");

            next = first + second;
            first = second;
            second = next;
        }

        seriesCount++;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Q24Fibonacci f = new Q24Fibonacci();

        System.out.println("Enter number of terms:");
        int n = sc.nextInt();

        f.displayFibonacci(n);

        System.out.println("\nTotal Series: " + seriesCount);

        sc.close();
    }
}