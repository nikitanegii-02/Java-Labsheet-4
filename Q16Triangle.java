import java.util.Scanner;

public class Q16Triangle {
    double a;
    double b;
    double c;

    static String type = "Scalene/Isosceles/Equilateral";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Q16Triangle t = new Q16Triangle();

        System.out.println("Enter side a:");
        double sideA = sc.nextDouble();

        System.out.println("Enter side b:");
        double sideB = sc.nextDouble();

        System.out.println("Enter side c:");
        double sideC = sc.nextDouble();

        t.a = sideA;
        t.b = sideB;
        t.c = sideC;

        boolean valid = (t.a + t.b > t.c) &&
                        (t.a + t.c > t.b) &&
                        (t.b + t.c > t.a);

        System.out.println("\nTriangle Details:");
        System.out.println("Side A: " + t.a);
        System.out.println("Side B: " + t.b);
        System.out.println("Side C: " + t.c);

        if (valid) {
            System.out.println("Triangle is valid.");

            if (t.a == t.b && t.b == t.c) {
                System.out.println("Type: Equilateral");
            } else if (t.a == t.b || t.b == t.c || t.a == t.c) {
                System.out.println("Type: Isosceles");
            } else {
                System.out.println("Type: Scalene");
            }
        } else {
            System.out.println("Triangle is not valid.");
        }

        sc.close();
    }
}