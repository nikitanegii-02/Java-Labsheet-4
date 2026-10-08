import java.util.Scanner;

public class Q26Matrix {
    int[][] matrix = new int[2][2];

    static String matrixType = "2x2 Matrix";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Q26Matrix m1 = new Q26Matrix();
        Q26Matrix m2 = new Q26Matrix();

        System.out.println("Enter elements of first matrix:");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                m1.matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter elements of second matrix:");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                m2.matrix[i][j] = sc.nextInt();
            }
        }

        int[][] addition = new int[2][2];
        int[][] subtraction = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                addition[i][j] = m1.matrix[i][j] + m2.matrix[i][j];
                subtraction[i][j] = m1.matrix[i][j] - m2.matrix[i][j];
            }
        }

        System.out.println("\nMatrix Type: " + matrixType);

        System.out.println("\nAddition of Matrices:");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(addition[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nSubtraction of Matrices:");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(subtraction[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}