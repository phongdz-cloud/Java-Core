import java.util.Scanner;

public class Bai18 {
    /*
     * Viết chương trình kiểm tra các phần tử trong một mảng có gồm toàn các số
     * nguyên tố không
     */
    static class Param {
        public int n;
    }

    static Param param = new Param();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        param.n = scanner.nextInt();
        int[] A;
        boolean result;
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

    static boolean solution(int A[]) {
        for (int i = 0; i < A.length; i++) {
            if (checkPrimeNumber(A[i]) == false)
                return false;
        }
        return true;
    }

    static void output(Boolean result) {
        if (result)
            System.out.println("Mang gom toan cac so nguyen to");
        else
            System.out.println("Mang khong gom toan cac so nguyen to");
    }
}
