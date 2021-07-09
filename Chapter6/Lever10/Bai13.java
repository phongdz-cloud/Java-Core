import java.util.Scanner;

public class Bai13 {
    /*
     * Sắp xếp ma trận sao cho các phần tử trên đường chéo chính tăng dần
     */

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n, m;
        n = scanner.nextInt();
        m = scanner.nextInt();
        int A[][];
        A = new int[n][m];
        input(A);
        solution(A, n);
        output(A);
    }

    static void input(int A[][]) {
        for (int i = 0; i < A.length; i++)
            for (int j = 0; j < A[i].length; j++)
                A[i][j] = scanner.nextInt();
    }

    static void solution(int A[][], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (A[i][i] > A[j][j]) {
                    int temp = A[i][i];
                    A[i][i] = A[j][j];
                    A[j][j] = temp;
                }
            }
        }
    }

    static void output(int A[][]) {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++)
                System.out.print(A[i][j] + " ");
            System.out.println();
        }
    }
}
