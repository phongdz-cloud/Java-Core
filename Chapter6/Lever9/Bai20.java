import java.util.Scanner;

public class Bai20 {
      /*
     * Cho mảng A có nA phần tử và mảng B có nB phần tử. Tạo mảng C xen kẽ 1 phần tử
     * mảng A tới phần tử mảng B. các phần tử dư ra (không còn xen kẽ được nữa) thì
     * nối hết vào đuôi mảng C
     */

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int A[], B[], C[];
        int nA, nB, k;
        nA = scanner.nextInt();
        A = input(nA);
        nB = scanner.nextInt();
        B = input(nB);
        k = nA + nB;
        C = new int[k];
        solution(A, B, C);
        output(C);
    }

    static int[] input(int n) {
        int A[];
        A = new int[n];
        for (int i = 0; i < A.length; i++) {
            A[i] = scanner.nextInt();
        }
        return A;
    }

    static void solution(int A[], int B[], int C[]) {

        int i, j, k;
        k = i = j = 0;
        while (i < A.length && j < B.length) {
            C[k++] = A[i++];
            C[k++] = B[j++];
        }
        while (i < A.length) {
            C[k++] = A[i++];
        }
        while (j < B.length) {
            C[k++] = B[j++];
        }
    }

    static void output(int C[]) {
        for (int i = 0; i < C.length; i++) {
            System.out.print(C[i] + " ");
        }
    }
}
