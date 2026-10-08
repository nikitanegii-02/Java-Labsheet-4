import java.util.Scanner;

public class Q19Product {
    int id;
    String name;
    double price;

    static double discountRate = 10;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Q19Product p = new Q19Product();

        System.out.println("Enter product ID:");
        int productId = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter product name:");
        String productName = sc.nextLine();

        System.out.println("Enter product price:");
        double productPrice = sc.nextDouble();

        p.id = productId;
        p.name = productName;
        p.price = productPrice;

        double discount = (p.price * discountRate) / 100;
        double finalPrice = p.price - discount;

        System.out.println("\nProduct Details:");
        System.out.println("Product ID: " + p.id);
        System.out.println("Name: " + p.name);
        System.out.println("Price: " + p.price);
        System.out.println("Discount Rate: " + discountRate + "%");
        System.out.println("Discount: " + discount);
        System.out.println("Final Price: " + finalPrice);

        sc.close();
    }
}