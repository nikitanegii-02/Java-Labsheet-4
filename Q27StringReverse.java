import java.util.Scanner;

public class Q27StringReverse {
    static int totalReversals = 0;

    void reverseString(String text) {
        String reverse = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            reverse = reverse + text.charAt(i);
        }

        totalReversals++;

        System.out.println("Reversed String: " + reverse);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Q27StringReverse s = new Q27StringReverse();

        System.out.println("Enter a string:");
        String text = sc.nextLine();

        s.reverseString(text);

        System.out.println("Total Reversals: " + totalReversals);

        sc.close();
    }
}