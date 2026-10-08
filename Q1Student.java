import java.util.Scanner;
public class Q1Student {
    String name;
    int age;
    static int count = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s1 = new Student();
        Student s2 = new Student();
        System.out.println("Enter name of student 1:");
        String studentName1 = sc.nextLine();

        System.out.println("Enter age of student 1:");
        int studentAge1 = sc.nextInt();

        sc.nextLine();
        s1.name = studentName1;
        s1.age = studentAge1;
        count++;
        
        System.out.println("Enter name of student 2:");
        String studentName2 = sc.nextLine();
        System.out.println("Enter age of student 2:");
        int studentAge2 = sc.nextInt();
        s2.name = studentName2;
        s2.age = studentAge2;
        count++;

        System.out.println("\nStudent 1:");
        System.out.println("Name: " + s1.name);
        System.out.println("Age: " + s1.age);

        System.out.println("\nStudent 2:");
        System.out.println("Name: " + s2.name);
        System.out.println("Age: " + s2.age);

        System.out.println("\nTotal Students: " + count);

        sc.close();
    }
}