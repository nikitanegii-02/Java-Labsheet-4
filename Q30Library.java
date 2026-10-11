import java.util.Scanner;

public class Q30Library {
    int booksAvailable;

    static String libraryName = "City Library";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Q30Library l = new Q30Library();

        System.out.println("Enter number of books available:");
        int books = sc.nextInt();

        l.booksAvailable = books;

        System.out.println("\nLibrary Name: " + libraryName);
        System.out.println("Books Available: " + l.booksAvailable);
        System.out.println("\nEnter number of books to issue:");
        int issueBooks = sc.nextInt();
        int issue = issueBooks;

        if (issue <= l.booksAvailable) {
            l.booksAvailable = l.booksAvailable - issue;
            System.out.println("Books issued successfully.");
        } else {
            System.out.println("Not enough books available.");
        }

        System.out.println("Books Available after issue: " + l.booksAvailable);
        System.out.println("\nEnter number of books to return:");
        int returnBooks = sc.nextInt();
        int returned = returnBooks;

        l.booksAvailable = l.booksAvailable + returned;

        System.out.println("Books returned successfully.");
        System.out.println("Books Available after return: " + l.booksAvailable);

        sc.close();
    }
}
