import java.util.Scanner;

public class Bai6 {
    /*
     * Viết chương trình đếm số hoàn thiện có trong một mảng các số nguyên có n phần
     * tử
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
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            if (checkPerfectNumber(A[i]))
                count++;
        }
        return count;
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
}
