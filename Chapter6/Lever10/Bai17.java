import java.util.Scanner;

public class Bai17 {
    /*
     * Đếm số lượng số chẵn trên biên của ma trận các số thực kích thượng MxN
     */

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n, m, result;
        n = scanner.nextInt();
        m = scanner.nextInt();
        float A[][];
        A = new float[n][m];
        input(A);
        result = solution(A, n, m);
        output(result);
    }

    static void input(float A[][]) {
        for (int i = 0; i < A.length; i++)
            for (int j = 0; j < A[i].length; j++)
                A[i][j] = scanner.nextFloat();
    }


    static boolean checkEvenNumber(float n) {
        if (n - (int) n == 0) {
            int number;
            number = (int) n;
            if (number % 2 == 0 && number != 0)
                return true;
            return false;
        }
        return false;
    }

    static int solution(float A[][], int n, int m) {
        int count = 0;
        for (int i = 0; i < m; i++) {
            if (checkEvenNumber(A[0][i]))
                count++;
            if (checkEvenNumber(A[n - 1][i]) && n - 1 != 0)
                count++;
        }
        for (int i = 1; i < n - 1; i++) {
            if (checkEvenNumber(A[i][0]))
                count++;
            if (checkEvenNumber(A[i][m - 1]) && m - 1 != 0)
                count++;
        }
        return count;
    }

    static void output(int result) {
        System.out.println(result);
    }
}
