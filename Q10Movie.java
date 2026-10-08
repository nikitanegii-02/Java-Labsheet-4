import java.util.Scanner;

public class Q10Movie {
    String name;
    String genre;
    double rating;

    static String industry = "Bollywood";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Q10Movie m = new Q10Movie();

        System.out.println("Enter movie name:");
        String movieName = sc.nextLine();

        System.out.println("Enter genre:");
        String movieGenre = sc.nextLine();

        System.out.println("Enter rating:");
        double movieRating = sc.nextDouble();

        m.name = movieName;
        m.genre = movieGenre;
        m.rating = movieRating;

        System.out.println("\nMovie Details:");
        System.out.println("Name: " + m.name);
        System.out.println("Genre: " + m.genre);
        System.out.println("Rating: " + m.rating);
        System.out.println("Industry: " + industry);

        sc.close();
    }
}