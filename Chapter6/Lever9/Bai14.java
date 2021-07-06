import java.util.Scanner;

public class Bai14 {
    /*
     * Hãy xóa tất cả các phần tử trùng nhau trong mảng và chỉ giữ lại duy nhất một
     * phần tử
     */

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int A[];
        int n;
        n = scanner.nextInt();
        A = input(n);
        A = solution(A);
        output(A);
    }

    static int[] input(int n) {
        int A[];
        A = new int[n];
        for (int i = 0; i < A.length; i++) {
            A[i] = scanner.nextInt();
        }
        return A;
    }

    static boolean checkValid(int n, int index) {
        return index >= 0 && index < n;
    }

    static void arrayCopy(int A[], int B[]) {
        for (int i = 0; i < A.length; i++) {
            B[i] = A[i];
        }
    }

    static boolean checkMatch(int A[], int x) {
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == x)
                count++;
        }
        return count >= 2;
    }

    static int[] remove(int[] A, int index) {
        if (checkValid(A.length, index)) {
            int[] B;
            B = new int[A.length];
            arrayCopy(A, B);
            A = null;
            A = new int[B.length - 1];
            for (int i = 0, j = 0; i < B.length; i++) {
                if (i != index) {
                    A[j++] = B[i];
                }
            }
            B = null;
        }
        return A;
    }

    static int[] solution(int[] A) {
        int i;
        i = 0;
        while (i < A.length) {
            if (checkMatch(A,A[i])) {
                A = remove(A, i);
                i = -1;
            }
            i++;
        }
        return A;
    }

    static void output(int A[]) {
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
    }
}
