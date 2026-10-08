import java.util.Scanner;

public class Q2Rectangle {
    int length;
    int breadth;

    static String shapeName = "Rectangle";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Q2Rectangle r = new Q2Rectangle();

        System.out.println("Enter length:");
        int l = sc.nextInt();

        System.out.println("Enter breadth:");
        int b = sc.nextInt();

        r.length = l;
        r.breadth = b;

        int area = r.length * r.breadth;

        System.out.println("\nShape: " + shapeName);
        System.out.println("Length: " + r.length);
        System.out.println("Breadth: " + r.breadth);
        System.out.println("Area: " + area);

        sc.close();
    }
}