import java.util.Scanner;

public class Bai7 {
    /*
     * Viết chương trình tính tổng số chính phương trong mảng n phần tử
     */
    static class Param {
        public int n;
    }

    static Param param = new Param();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        param.n = scanner.nextInt();
        int[] A;
        int result;
        A = new int[param.n];
        input(A);
        result = solution(A);
        output(result);

    }

    static void input(int[] A) {
        for (int i = 0; i < A.length; i++) {
            A[i] = scanner.nextInt();
        }
    }

    static void output(int result) {
        System.out.println(result);
    }

    static int solution(int A[]) {
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            if (checkSquareNumber(A[i]))
                sum += A[i];
        }
        return sum;
    }

    static boolean checkSquareNumber(int n) {
        int temp = (int) Math.sqrt(n);
        if (temp * temp == n)
            return true;
        return false;
    }
}
