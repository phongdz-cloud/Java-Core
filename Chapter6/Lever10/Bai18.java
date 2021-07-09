
import java.util.Scanner;

public class Bai18 {
      /*
     * Đếm số lượng giá trị "yên ngựa" trên ma trận. Một phần tử gọi là "yên ngựa"
     * khi nó lớn nhất trên dòng và nhỏ nhất trên cột
     */

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n, m, result;
        n = scanner.nextInt();
        m = scanner.nextInt();
        int A[][];
        A = new int[n][m];
        input(A);
        result = horseSaddle(A, n, m);
        output(result);
    }

    static void input(int A[][]) {
        for (int i = 0; i < A.length; i++)
            for (int j = 0; j < A[i].length; j++)
                A[i][j] = scanner.nextInt();
    }

    static boolean checkRowMatrix(int A[][], int x, int row, int m) {
        for (int i = 0; i < m; i++) {
            if (A[row][i] > x)
                return false;
        }
        return true;
    }

    static boolean checkColumnMatrix(int A[][], int x, int column, int n) {
        for (int i = 0; i < n; i++) {
            if (A[i][column] < x)
                return false;
        }
        return true;
    }

    static int horseSaddle(int A[][], int n, int m) {
        int count;
        count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (checkRowMatrix(A, A[i][j], i, m) && checkColumnMatrix(A, A[i][j], j, n))
                    count++;
            }
        }
        return count;
    }

    static void output(int result) {
        System.out.println(result);
    }
}
