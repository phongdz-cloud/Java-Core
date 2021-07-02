import java.util.Scanner;

public class Bai17 {
    /*
     * Viết chương trình tìm số lớn nhất trong một mảng số nguyên
     */
    static class Param {
        public int n;
    }

    static Param param = new Param();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        param.n = scanner.nextInt();
        int[] A;
        A = new int[param.n];
        input(A);
        int result;
        result = fintMaxArray(A);
        output(result);
    }

    static void input(int[] A) {
        for (int i = 0; i < A.length; i++) {
            A[i] = scanner.nextInt();
        }
    }

    static int fintMaxArray(int A[]) {
        int max = A[0];
        for (int i = 0; i < A.length; i++) {

            if (A[i] > max)
                max = A[i];
        }

        return max;
    }

    static void output(int result) {
        System.out.println(result);
    }
}
