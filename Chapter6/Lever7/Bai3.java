import java.util.Scanner;

public class Bai3 {
    /*
     * Tìm "số nguyên tố cuối cùng" trong mảng một chiều các số nguyên. Nếu mảng
     * không có số nguyên tố thì trả về -1;
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
        int findLastPrimeNumber = -1;
        for (int i = 0; i < A.length; i++) {
            if (checkPrimeNumber(A[i]))
                findLastPrimeNumber = A[i];
        }
        if (findLastPrimeNumber != -1)
            return findLastPrimeNumber;
        return -1;
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
