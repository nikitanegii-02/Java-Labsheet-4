import java.util.Scanner;

public class Q9Laptop {
    String brand;
    int RAM;

    static String os = "Windows";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Q9Laptop l = new Q9Laptop();

        System.out.println("Enter laptop brand:");
        String laptopBrand = sc.nextLine();

        System.out.println("Enter RAM in GB:");
        int laptopRAM = sc.nextInt();

        l.brand = laptopBrand;
        l.RAM = laptopRAM;

        System.out.println("\nLaptop Details:");
        System.out.println("Brand: " + l.brand);
        System.out.println("RAM: " + l.RAM + " GB");
        System.out.println("Operating System: " + os);

        sc.close();
    }
}