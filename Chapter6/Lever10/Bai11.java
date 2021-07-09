import java.util.Scanner;

public class Bai11 {
     /*
     * Viết chương trình tính tổng hai ma trận
     */

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n, m;
        n = scanner.nextInt();
        m = scanner.nextInt();
        int A[][], B[][];
        A = new int[n][m];
        B = new int[n][m];
        input(A);
        input(B);
        solution(A, B);
        output(A);
    }

    static void input(int A[][]) {
        for (int i = 0; i < A.length; i++)
            for (int j = 0; j < A[i].length; j++)
                A[i][j] = scanner.nextInt();
    }

    static void solution(int A[][], int B[][]) {
        for (int i = 0; i < A.length; i++)
            for (int j = 0; j < A[i].length; j++)
                A[i][j] += B[i][j];

    }

    static void output(int A[][]) {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++)
                System.out.print(A[i][j] + " ");
            System.out.println();
        }
    }
}
