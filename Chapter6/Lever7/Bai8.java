import java.util.Scanner;

public class Bai8 {
    /*
     * Viết chương trình tính trung bình cộng các số nguyên tố trong mảng
     */
    static class Param {
        public int n;
    }

    static Param param = new Param();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        param.n = scanner.nextInt();
        int[] A;
        float result;
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

    static void output(float result) {
        System.out.println(result);
    }

    static float solution(int A[]) {
        int sum, count;
        count = sum = 0;
        for (int i = 0; i < A.length; i++) {
            if (checkPrimeNumber(A[i])) {
                sum += A[i];
                count++;
            }
        }
        return (float) (sum * 1.0) / count;
    }

    static boolean checkPrimeNumber(int n) {
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
}
