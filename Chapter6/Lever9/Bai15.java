
import java.util.Scanner;

public class Bai15 {
    /*
     * Hãy xóa tất cả các phần tử có tần suất xuất hiện trong mảng lớn hơn 1 lần
     */

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int A[], B[];
        int nA, nB;
        nA = scanner.nextInt();
        nB = nA;
        B = new int[nA];
        A = input(nA);
        nB = matchArray(A, B, nB);
        A = solution(A, B, nB);
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

    static boolean checkMatch(int A[], int n, int x) {

        for (int i = 0; i < n; i++) {
            if (A[i] == x)
                return false;
        }
        return true;
    }

    static int matchArray(int A[], int B[], int nB) {
        int count;
        nB = 0;
        for (int i = 0; i < A.length; i++) {
            if (checkMatch(B, nB, A[i])) {
                count = 0;
                for (int j = 0; j < A.length; j++) {
                    if (A[i] == A[j])
                        count++;
                }
                if (count >= 2)
                    B[nB++] = A[i];
            }
        }
        return nB;
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

    static int[] solution(int[] A, int[] B, int nB) {

        for (int i = 0; i < nB; i++) {
            for (int j = 0; j < A.length; j++) {
                if (A[j] == B[i]) {
                    A = remove(A, j);
                    j = -1;
                }
            }
        }
        return A;
    }

    static void output(int A[]) {
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
    }
}
