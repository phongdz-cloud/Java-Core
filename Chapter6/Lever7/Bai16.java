import java.util.Scanner;

public class Bai16 {
    /*
     * Viết chương trình kiểm tra các phần tử trong một có lập thành một dãy hình
     * sin hay không
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
        double result;
        for (int i = 0; i < A.length; i++) {
            result = Math.sin(A[i]);
            if (result < -1 || result > 1)
                return false;
        }
        return true;
    }

    static void output(Boolean result) {
        if (result)
            System.out.println("Lap thanh mot day hinh sin");
        else
            System.out.println("Khong lap thanh mot day hinh sin");
    }
}
