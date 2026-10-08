import java.util.Scanner;

public class Q5Book {
    String title;
    String author;
    double price;

    static String publisher = "Penguin";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Q5Book b = new Q5Book();

        System.out.println("Enter book title:");
        String bookTitle = sc.nextLine();

        System.out.println("Enter author name:");
        String bookAuthor = sc.nextLine();

        System.out.println("Enter price:");
        double bookPrice = sc.nextDouble();

        b.title = bookTitle;
        b.author = bookAuthor;
        b.price = bookPrice;

        System.out.println("\nBook Details:");
        System.out.println("Title: " + b.title);
        System.out.println("Author: " + b.author);
        System.out.println("Price: " + b.price);
        System.out.println("Publisher: " + publisher);

        sc.close();
    }
}