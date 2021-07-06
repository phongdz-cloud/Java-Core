import java.util.Scanner;

public class Bai10 {
     /*
     * Cho 2 mảng a,b. Liệt kê các giá trị chỉ xuất hiện 1 trong 2 mảng
     */

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int A[], B[], C[];
        int nA, nB, nC;
        nA = scanner.nextInt();
        A = input(nA);
        nB = scanner.nextInt();
        B = input(nB);
        C = new int[nA + nB];
        nC = solution(A, B, C);
        output(C, nC);
    }

    static int[] input(int nA) {
        int A[];
        A = new int[nA];
        for (int i = 0; i < A.length; i++) {
            A[i] = scanner.nextInt();
        }
        return A;
    }

    static boolean checkMatch(int C[], int nC, int x) {
        for (int i = 0; i < nC; i++) {
            if (C[i] == x)
                return false;
        }
        return true;
    }

    static int MatchArray(int A[], int B[], int C[], int nC) {
        boolean flag;
        for (int i = 0; i < A.length; i++) {
            if (checkMatch(C, nC, A[i])) {
                flag = true;
                for (int j = 0; j < B.length; j++) {
                    if (A[i] == B[j])
                        flag = false;
                }
                if (flag)
                    C[nC++] = A[i];
            }
        }
        return nC;
    }

    static int solution(int A[], int B[], int C[]) {
        int nC;
        nC = 0;
        nC = MatchArray(A, B, C, nC);
        nC = MatchArray(B, A, C, nC);
        return nC;
    }

    static void output(int C[], int nC) {
        for (int i = 0; i < nC; i++) {
            System.out.print(C[i] + " ");
        }
    }
}
