import java.util.Scanner;

public class Bai12 {
     /*
     * Hãy xóa tất cả các số lớn nhất trong mảng các số thực
     */

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        float A[];
        int n;
        n = scanner.nextInt();
        A = input(n);
        A = solution(A);
        output(A);
    }

    static float[] input(int n) {
        float A[];
        A = new float[n];
        for (int i = 0; i < A.length; i++) {
            A[i] = scanner.nextFloat();
        }
        return A;
    }

    static boolean checkValid(int n, int index) {
        return index >= 0 && index < n;
    }

    static void arrayCopy(float A[], float B[]) {
        for (int i = 0; i < A.length; i++) {
            B[i] = A[i];
        }
    }

    static float findMaxArray(float A[]) {
        float max = A[0];
        for (int i = 0; i < A.length; i++) {
            if (A[i] > max)
                max = A[i];
        }
        return max;
    }

    static float[] remove(float[] A, int index) {
        if (checkValid(A.length, index)) {
            float[] B;
            B = new float[A.length];
            arrayCopy(A, B);
            A = null;
            A = new float[B.length - 1];
            for (int i = 0, j = 0; i < B.length; i++) {
                if (i != index) {
                    A[j++] = B[i];
                }
            }
            B = null;
        }
        return A;
    }

    static float[] solution(float[] A) {
        float max;
        max = findMaxArray(A);
        int i;
        i = 0;
        while (i < A.length) {
            if (A[i] == max) {
                A = remove(A, i);
                i = -1;
            }
            i++;
        }
        return A;
    }

    static void output(float A[]) {
        for (int i = 0; i < A.length; i++) {
            System.out.println(A[i] + " ");
        }
    }
}
