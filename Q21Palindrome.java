import java.util.Scanner;

public class Q21Palindrome {
    static int countChecks = 0;

    void checkPalindrome(int number) {
        int original = number;
        int reverse = 0;
        int remainder;

        while (number > 0) {
            remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;
        }

        countChecks++;

        if (original == reverse) {
            System.out.println("The number is a Palindrome.");
        } else {
            System.out.println("The number is not a Palindrome.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Q21Palindrome p = new Q21Palindrome();

        System.out.println("Enter a number:");
        int number = sc.nextInt();

        p.checkPalindrome(number);

        System.out.println("Total Checks: " + countChecks);

        sc.close();
    }
}