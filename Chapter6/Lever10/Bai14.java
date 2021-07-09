
import java.util.Scanner;

public class Bai14 {
     /*
     * Kiểm tra dòng thứ k có giảm dần hay không?
     */

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n, m, k;
        String result;
        n = scanner.nextInt();
        m = scanner.nextInt();
        k = scanner.nextInt();
        int A[][];
        A = new int[n][m];
        input(A);
        result = solution(A, k, n, m);
        output(result);
    }

    static void input(int A[][]) {
        for (int i = 0; i < A.length; i++)
            for (int j = 0; j < A[i].length; j++)
                A[i][j] = scanner.nextInt();
    }

    static boolean checkValid(int k, int n, int m) {
        return (k < 0 || m < 0 || n < 0 || k >= n) ? false : true;
    }

    static boolean checkRowMatrix(int A[][], int k, int n, int m) {
        for (int i = 0; i < m - 1; i++) {
            if (A[k][i] < A[k][i + 1])
                return false;
        }
        return true;
    }

    static String solution(int A[][], int k, int n, int m) {
        if (checkValid(k, n, m)) {
            Boolean result;
            result = checkRowMatrix(A, k, n, m);
            return result ? "Dong co thu tu giam dan" : "Dong khong co thu tu giam dan";
        }
        return "";
    }

    static void output(String s) {
        if (s != "")
            System.out.println(s);
        else
            System.err.println("Dau vao khong hop le!");
    }
}
