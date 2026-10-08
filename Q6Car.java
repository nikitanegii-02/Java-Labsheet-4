import java.util.Scanner;

public class Q6Car {
    String brand;
    double mileage;

    static int wheels = 4;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Q6Car c = new Q6Car();

        System.out.println("Enter car brand:");
        String carBrand = sc.nextLine();

        System.out.println("Enter mileage:");
        double carMileage = sc.nextDouble();

        c.brand = carBrand;
        c.mileage = carMileage;

        System.out.println("\nCar Details:");
        System.out.println("Brand: " + c.brand);
        System.out.println("Mileage: " + c.mileage);
        System.out.println("Wheels: " + wheels);

        sc.close();
    }
}