import java.util.Scanner;

public class Q4Employee {
    int empId;
    double salary;

    static String companyName = "ABC Pvt. Ltd.";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Q4Employee e = new Q4Employee();

        System.out.println("Enter Employee ID:");
        int id = sc.nextInt();

        System.out.println("Enter Salary:");
        double empSalary = sc.nextDouble();

        e.empId = id;
        e.salary = empSalary;

        System.out.println("\nEmployee Details:");
        System.out.println("Company Name: " + companyName);
        System.out.println("Employee ID: " + e.empId);
        System.out.println("Salary: " + e.salary);

        sc.close();
    }
}