import java.util.Scanner;

public class Bai5 {
    /*
     * Cho mảng 1 chiều các số thực. Hãy viết hàm liệt kê tất cả các giá trị trong
     * mảng có ít nhất 1 lân cận trái dấu nó
     */
    static class Param {
        public int nA;
        public int nB;
    }

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int nA;
        int A[];
        nA = scanner.nextInt();
        A = input(nA);
        solution(A);
    }

    static int[] input(int nA) {
        int[] A = new int[nA];
        for (int i = 0; i < A.length; i++) {
            A[i] = scanner.nextInt();
        }
        return A;
    }

    static boolean checkValid(float a, float b) {
        return (a < 0 && b > 0) || (a > 0 && b < 0);
    }

    static void solution(int[] A) {
        int B[] = new int[A.length];
        int nB = 0;
        if (A.length > 1) {
            if (checkValid(A[0], A[1]))
                B[nB++] = A[0];
            for (int i = 1; i < A.length - 1; i++) {
                if (checkValid(A[i], A[i - 1]) || checkValid(A[i], A[i + 1]))
                    B[nB++] = A[i];
            }
            if (checkValid(A[A.length - 1], A[A.length - 2]))
                B[nB++] = A[A.length - 1];
        }
        output(B, nB);
    }

    static void output(int[] A, int nA) {
        for (int i = 0; i < nA; i++) {
            System.out.print(A[i] + " ");
        }
    }
}
