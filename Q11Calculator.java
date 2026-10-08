import java.util.Scanner;

public class Q11Calculator {
    static int operationsCount = 0;

    void add(double a, double b) {
        double result = a + b;
        System.out.println("Addition: " + result);
        operationsCount++;
    }
    void subtract(double a, double b) {
        double result = a - b;
        System.out.println("Subtraction: " + result);
        operationsCount++;
    }
    void multiply(double a, double b) {
        double result = a * b;
        System.out.println("Multiplication: " + result);
        operationsCount++;
    }
    void divide(double a, double b) {
        if (b != 0) {
            double result = a / b;
            System.out.println("Division: " + result);
            operationsCount++;
        } else {
            System.out.println("Cannot divide by zero.");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Q11Calculator c = new Q11Calculator();
        System.out.println("Enter first number:");
        double num1 = sc.nextDouble();
        System.out.println("Enter second number:");
        double num2 = sc.nextDouble();
        c.add(num1, num2);
        c.subtract(num1, num2);
        c.multiply(num1, num2);
        c.divide(num1, num2);

        System.out.println("\nTotal Operations: " + operationsCount);

        sc.close();
    }
}