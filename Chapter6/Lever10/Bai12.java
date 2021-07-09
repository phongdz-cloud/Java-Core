import java.util.Scanner;

public class Bai12 {
     /*
     * Tính tổng trên các dòng, các cột, trên đường chéo chính, đường chéo phụ
     */

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n, m, result;
        n = scanner.nextInt();
        m = scanner.nextInt();
        int A[][];
        A = new int[n][m];
        input(A);
        result = solution(A, n, m);
        output(result);
    }

    static void input(int A[][]) {
        for (int i = 0; i < A.length; i++)
            for (int j = 0; j < A[i].length; j++)
                A[i][j] = scanner.nextInt();
    }

    static int solution(int A[][], int n, int m) {
        int sum;
        sum = 0;
        for (int i = 0; i < n; i++) {
            sum += A[i][i] + A[i][m - i - 1];
        }
        return m % 2 != 0 ? sum -= A[m / 2][m / 2] : sum;

    }

    static void output(int result) {
        System.out.println(result);
    }
}
