import java.util.Scanner;

public class Bai15 {
      /*
     * Tìm và in ra tất cả vị trí xuất hiện của số lớn nhất trong ma trận.
     */

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n, m;
        n = scanner.nextInt();
        m = scanner.nextInt();
        int A[][];
        A = new int[n][m];
        input(A);
        solution(A, n, m);
    }

    static void input(int A[][]) {
        for (int i = 0; i < A.length; i++)
            for (int j = 0; j < A[i].length; j++)
                A[i][j] = scanner.nextInt();
    }

    static int findMaxMatrix(int A[][], int n, int m) {
        int max = A[0][0];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
                if (A[i][j] > max)
                    max = A[i][j];
        }
        return max;
    }

    static void solution(int A[][], int n, int m) {
        int max;
        max = findMaxMatrix(A, n, m);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (A[i][j] == max)
                    output(i, j);
            }
        }
    }

    static void output(int i, int j) {
        System.out.println(i + " " + j);
    }
}
