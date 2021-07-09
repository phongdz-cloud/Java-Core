import java.util.Scanner;

public class Bai16 {
     /*
     * Tìm vị trí (tọa độ dòng, cột) của số nguyên tố đầu tiên trong mảng 2 chiều m
     * dòng , n cột
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

    static boolean primeNumber(int n) {
        if (n < 2)
            return false;
        if (n == 2)
            return true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    static void solution(int A[][], int n, int m) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (primeNumber(A[i][j])) {
                    output(i, j);
                    return;
                }
            }
        }
    }

    static void output(int i, int j) {
        System.out.println(i + " " + j);
    }
}
