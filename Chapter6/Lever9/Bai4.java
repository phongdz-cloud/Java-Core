import java.util.Scanner;

public class Bai4 {
     /*
     * Hãy liệt kê các giá trị trong mảng thỏa điều kiện lớn hơn giá trị tuyệt đối
     * của giá trị đứng liền sau nó
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

    static boolean checkValue(int a, int b) {
        return a > b ? true : false;
    }

    static void solution(int[] A) {
        int[] B = new int[A.length];
        int nB = 0;
        for (int i = 0; i < A.length - 1; i++) {
            if (checkValue(A[i], Math.abs(A[i + 1])))
                B[nB++] = A[i];
        }
        output(B, nB);
    }

    static void output(int[] A, int nA) {
        for (int i = 0; i < nA; i++) {
            System.out.print(A[i] + " ");
        }
    }
}
