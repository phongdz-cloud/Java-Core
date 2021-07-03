import java.util.Scanner;

public class Bai10 {
    /*
     * Tìm "số hoàn thiện nhỏ nhất" trong mảng một chiều các số nguyên. Nếu mảng
     * không có số nguyên tố thì trả về số 0
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

    static boolean checkPerfectNumber(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0)
                sum += i;
        }
        if (sum == n)
            return true;
        return false;
    }

    static int solution(int A[]) {
        int maxPerfectNumber = Integer.MAX_VALUE;
        for (int i = 0; i < A.length; i++) {
            if (checkPerfectNumber(A[i]) && A[i] < maxPerfectNumber)
                maxPerfectNumber = A[i];
        }
        return maxPerfectNumber != Integer.MAX_VALUE ? maxPerfectNumber : 0;
    }

    static void output(int result) {
        System.out.println(result);
    }
}
