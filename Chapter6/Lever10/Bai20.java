
import java.util.Scanner;

public class Bai20 {
    /*
     * Cho ma trận vuông A[20][20], có kích thước N. Viết chương trình sắp xếp lại
     * ma trận tăng dần theo dòng và cột
     */

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n;
        n = scanner.nextInt();
        int A[][];
        int B[];
        A = new int[n][n];
        B = new int[n * n];
        input(A);
        solution(A, B, n);
        output(A, n);
    }

    static void input(int A[][]) {
        for (int i = 0; i < A.length; i++)
            for (int j = 0; j < A.length; j++)
                A[i][j] = scanner.nextInt();
    }

    static void sortArray(int B[]) {
        for (int i = 0; i < B.length; i++) {
            for (int j = i + 1; j < B.length; j++) {
                if (B[i] > B[j]) {
                    int temp = B[i];
                    B[i] = B[j];
                    B[j] = temp;
                }
            }
        }
    }

    static void matrixToArray(int A[][], int B[], int n) {
        int k = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                B[k++] = A[i][j];
            }
        }
    }

    static void arrayToMatrix(int A[][], int B[], int n) {
        int k;
        k = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                A[i][j] = B[k++];
        }
    }

    static void solution(int A[][], int B[], int n) {
        matrixToArray(A, B, n);
        sortArray(B);
        arrayToMatrix(A, B, n);
    }

    static void output(int A[][], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(A[i][j] + " ");
            System.err.println();
        }
    }
}
