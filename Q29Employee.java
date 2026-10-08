import java.util.Scanner;

public class Q29Employee {
    String name;
    double salary;

    static String organization = "ABC Organization";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Q29Employee e1 = new Q29Employee();
        Q29Employee e2 = new Q29Employee();

        System.out.println("Enter name of employee 1:");
        String name1 = sc.nextLine();

        System.out.println("Enter salary of employee 1:");
        double salary1 = sc.nextDouble();
        sc.nextLine();

        System.out.println("Enter name of employee 2:");
        String name2 = sc.nextLine();

        System.out.println("Enter salary of employee 2:");
        double salary2 = sc.nextDouble();

        e1.name = name1;
        e1.salary = salary1;

        e2.name = name2;
        e2.salary = salary2;

        System.out.println("\nEmployee Details:");
        System.out.println("Organization: " + organization);

        System.out.println("\nEmployee 1:");
        System.out.println("Name: " + e1.name);
        System.out.println("Salary: " + e1.salary);

        System.out.println("\nEmployee 2:");
        System.out.println("Name: " + e2.name);
        System.out.println("Salary: " + e2.salary);

        // Local variables for comparison
        double salaryOfEmployee1 = e1.salary;
        double salaryOfEmployee2 = e2.salary;

        if (salaryOfEmployee1 > salaryOfEmployee2) {
            System.out.println("\n" + e1.name + " has a higher salary.");
        } else if (salaryOfEmployee2 > salaryOfEmployee1) {
            System.out.println("\n" + e2.name + " has a higher salary.");
        } else {
            System.out.println("\nBoth employees have the same salary.");
        }

        sc.close();
    }
}