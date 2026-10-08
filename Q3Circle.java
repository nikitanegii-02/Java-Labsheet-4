import java.util.Scanner;

public class Q3Circle {
    double radius;

    static double PI = 3.14;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Q3Circle c = new Q3Circle();

        System.out.println("Enter radius:");
        double r = sc.nextDouble();

        c.radius = r;

        double area = PI * c.radius * c.radius;
        double circumference = 2 * PI * c.radius;

        System.out.println("\nRadius: " + c.radius);
        System.out.println("Area: " + area);
        System.out.println("Circumference: " + circumference);

        sc.close();
    }
}