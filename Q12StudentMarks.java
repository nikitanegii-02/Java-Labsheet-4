import java.util.Scanner;

public class Q12StudentMarks {
    int marks1;
    int marks2;
    int marks3;

    static String universityName = "COER University";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Q12StudentMarks s = new Q12StudentMarks();

        System.out.println("Enter marks of subject 1:");
        int mark1 = sc.nextInt();

        System.out.println("Enter marks of subject 2:");
        int mark2 = sc.nextInt();

        System.out.println("Enter marks of subject 3:");
        int mark3 = sc.nextInt();

        s.marks1 = mark1;
        s.marks2 = mark2;
        s.marks3 = mark3;

        double total = s.marks1 + s.marks2 + s.marks3;
        double average = total / 3;

        System.out.println("\nStudent Marks:");
        System.out.println("University: " + universityName);
        System.out.println("Marks 1: " + s.marks1);
        System.out.println("Marks 2: " + s.marks2);
        System.out.println("Marks 3: " + s.marks3);
        System.out.println("Average: " + average);

        sc.close();
    }
}