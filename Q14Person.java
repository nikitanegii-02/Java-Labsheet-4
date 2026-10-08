import java.util.Scanner;

public class Q14Person {
    String name;
    int age;

    static String country = "India";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Q14Person p = new Q14Person();

        System.out.println("Enter name:");
        String personName = sc.nextLine();

        System.out.println("Enter age:");
        int personAge = sc.nextInt();

        p.name = personName;
        p.age = personAge;

        boolean eligible = p.age >= 18;

        System.out.println("\nPerson Details:");
        System.out.println("Name: " + p.name);
        System.out.println("Age: " + p.age);
        System.out.println("Country: " + country);

        if (eligible) {
            System.out.println("Eligible for voting.");
        } else {
            System.out.println("Not eligible for voting.");
        }

        sc.close();
    }
}