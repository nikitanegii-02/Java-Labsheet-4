import java.util.Scanner;

public class Q8Pen {
    String color;
    String type;

    static String manufacturer = "Cello";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Q8Pen p = new Q8Pen();

        System.out.println("Enter pen color:");
        String penColor = sc.nextLine();

        System.out.println("Enter pen type:");
        String penType = sc.nextLine();

        p.color = penColor;
        p.type = penType;

        System.out.println("\nPen Details:");
        System.out.println("Color: " + p.color);
        System.out.println("Type: " + p.type);
        System.out.println("Manufacturer: " + manufacturer);

        sc.close();
    }
}