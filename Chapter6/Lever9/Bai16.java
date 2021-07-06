
import java.util.Scanner;

public class Bai16 {
    /*
     * Hãy đưa các số chẵn trong mảng về đầu mảng, các số lẻ về cuối mảng và các
     * phần tử 0 nằm giữa
     */

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int A[];
        int n;
        n = scanner.nextInt();
        A = input(n);
        solution(A);
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

    static int checkEvenArray(int A[], int index) {
        int k = -1;
        for (int i = index + 1; i < A.length; i++) {
            if (A[i] % 2 == 0 && A[i] != 0)
                return i;
            if (A[i] == 0)
                k = i;
        }
        return k;
    }

    static void solution(int A[]) {
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 != 0 || A[i] == 0) {
                int index = checkEvenArray(A, i);
                if (index != -1) {
                    int temp;
                    temp = A[i];
                    A[i] = A[index];
                    A[index] = temp;
                }
            }
        }
    }

    static void output(int A[]) {
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
    }

}
