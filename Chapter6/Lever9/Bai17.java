import java.util.Scanner;

public class Bai17 {
     /*
     * Hãy "dịch trái xoay vòng các phần tử trong mảng"
     */

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int A[];
        int n;
        n = scanner.nextInt();
        A = input(n);
        solution(A);
        output(A);
    }

    static int[] input(int n) {
        int A[];
        A = new int[n];
        for (int i = 0; i < A.length; i++) {
            A[i] = scanner.nextInt();
        }
        return A;
    }

    static void rotateLeft(int A[]) {
        int x;
        x = A[0];
        for (int i = 0; i < A.length - 1; i++) {
            A[i] = A[i + 1];
        }
        A[A.length - 1] = x;
    }

    static void solution(int A[]) {
        rotateLeft(A);
    }

    static void output(int A[]) {
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
    }
}
