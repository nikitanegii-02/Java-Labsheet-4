import java.util.Scanner;

public class Q13Temperature {
    double celsius;

    static String scale = "Celsius";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Q13Temperature t = new Q13Temperature();

        System.out.println("Enter temperature in Celsius:");
        double temp = sc.nextDouble();

        t.celsius = temp;

        double fahrenheit = (t.celsius * 9 / 5) + 32;
        double kelvin = t.celsius + 273.15;

        System.out.println("\nTemperature Details:");
        System.out.println("Celsius: " + t.celsius);
        System.out.println("Fahrenheit: " + fahrenheit);
        System.out.println("Kelvin: " + kelvin);
        System.out.println("Scale: " + scale);

        sc.close();
    }
}