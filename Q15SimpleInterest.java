import java.util.Scanner;

public class Q15SimpleInterest {
    double principal;
    double rate;
    double time;

    static String bank = "State Bank";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Q15SimpleInterest s = new Q15SimpleInterest();

        System.out.println("Enter principal amount:");
        double p = sc.nextDouble();

        System.out.println("Enter rate of interest:");
        double r = sc.nextDouble();

        System.out.println("Enter time in years:");
        double t = sc.nextDouble();

        s.principal = p;
        s.rate = r;
        s.time = t;

        double interest = (s.principal * s.rate * s.time) / 100;

        System.out.println("\nSimple Interest Details:");
        System.out.println("Bank: " + bank);
        System.out.println("Principal: " + s.principal);
        System.out.println("Rate: " + s.rate);
        System.out.println("Time: " + s.time);
        System.out.println("Simple Interest: " + interest);

        sc.close();
    }
}