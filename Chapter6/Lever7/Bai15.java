import java.util.Scanner;

public class Bai15 {
    /*
     * Viết chương trình kiểm tra các phần tử trong một mảng có lập thành cấp số
     * cộng hay không.
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

    static boolean checkValid(int n) {
        return n >= 2 ? true : false;
    }

    static boolean solution(int A[]) {
        if (checkValid(A.length)) {
            int k;
            k = A[1] - A[0];
            for (int i = 1; i < A.length - 1; i++) {
                if (A[i + 1] - A[i] != k)
                    return false;
            }
            return true;
        }
        return false;
    }

    static void output(Boolean result) {
        if (result)
            System.out.println("Lap thanh mot cap so cong");
        else
            System.out.println("Khong lap thanh mot cap so cong");
    }
}
