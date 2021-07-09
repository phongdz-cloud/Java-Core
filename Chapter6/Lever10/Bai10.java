import java.util.Scanner;

public class Bai10 {
     /*
     * Viết chương trình tính tổng các phần tử trong một mảng 2 chiều có kích thước
     * MxN
     */

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n, m, result;
        n = scanner.nextInt();
        m = scanner.nextInt();
        int A[][];
        A = new int[n][m];
        input(A);
        result = solution(A);
        output(result);
    }

    static void input(int A[][]) {
        for (int i = 0; i < A.length; i++)
            for (int j = 0; j < A[i].length; j++)
                A[i][j] = scanner.nextInt();
    }

    static int solution(int A[][]) {
        int sum = 0;
        for (int i = 0; i < A.length; i++)
            for (int j = 0; j < A[i].length; j++)
                sum += A[i][j];

        return sum;
    }

    static void output(int result) {
        System.out.println(result);
    }
}
