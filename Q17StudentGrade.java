import java.util.Scanner;

public class Q17StudentGrade {
    String name;
    int marks;

    static int passingMarks = 40;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Q17StudentGrade s = new Q17StudentGrade();

        System.out.println("Enter student name:");
        String studentName = sc.nextLine();

        System.out.println("Enter marks:");
        int studentMarks = sc.nextInt();

        s.name = studentName;
        s.marks = studentMarks;

        String grade;

        if (s.marks < passingMarks) {
            grade = "F";
        } else if (s.marks >= 90) {
            grade = "A";
        } else if (s.marks >= 75) {
            grade = "B";
        } else if (s.marks >= 60) {
            grade = "C";
        } else {
            grade = "D";
        }

        System.out.println("\nStudent Details:");
        System.out.println("Name: " + s.name);
        System.out.println("Marks: " + s.marks);
        System.out.println("Passing Marks: " + passingMarks);
        System.out.println("Grade: " + grade);

        sc.close();
    }
}