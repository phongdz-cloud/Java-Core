import java.util.Scanner;

public class Bai1 {
    /*
     * Kiểm tra mảng một chiều các số thực có đối xứng hay không
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

    static boolean solution(int A[]) {
        if (A.length == 1)
            return false;
        for (int i = 0; i < A.length - 1; i++) {
            if ((A[i] + A[i + 1]) % 2 == 0)
                return false;
        }
        return true;
    }

    static void output(Boolean result) {
        if (result)
            System.out.print("Mang co tinh chat chan le");
        else
            System.out.print("Mang khong co tinh chat chan le");
    }
}
