import java.util.Scanner;

public class Bai13 {
    /*
     * Viết chương trình tìm UCLN của một mảng n phần tử nguyên dương
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

    static int gcd(int a, int b) {
        while (a != b) {
            if (a > b)
                a -= b;
            if (a < b)
                b -= a;
        }
        return a;
    }

    static int solution(int A[]) {
        if (A.length > 1) {
            int u;
            u = gcd(Math.abs(A[0]), Math.abs(A[1]));
            for (int i = 1; i < A.length - 1; i++) {
                u = gcd(u, Math.abs(A[i + 1]));
            }
            return u;
        }
        return 1;
    }

    static void output(int result) {
        System.out.println(result);
    }
}
