import java.util.Scanner;

public class Bai18 {
    /*
     * Hãy "dịch phải xoay vòng" k lần các phần tử trong mảng"
     */

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int A[];
        int n, k;
        n = scanner.nextInt();
        k = scanner.nextInt();
        A = input(n);
        solution(A, k);
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

    static void rotateRight(int A[]) {
        int x;
        x = A[A.length - 1];
        for (int i = A.length - 1; i > 0; i--) {
            A[i] = A[i - 1];
        }
        A[0] = x;
    }

    static void solution(int A[], int k) {
        while (k != 0) {
            rotateRight(A);
            k--;
        }
    }

    static void output(int A[]) {
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
    }
}
