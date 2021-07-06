import java.util.Scanner;

public class Bai8 {
      /*
     * Liệt kê tần suất xuất hiện các giá trị trong mảng (Lưu ý: mỗi giá trị liệt kê
     * 1 lần)
     */

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int A[], B[], C[];
        int nA, n;
        nA = scanner.nextInt();
        A = input(nA);
        B = new int[nA];
        C = new int[nA];
        n = solution(A, B, C);
        output(B, C, n);
    }

    static int[] input(int nA) {
        int A[];
        A = new int[nA];
        for (int i = 0; i < A.length; i++) {
            A[i] = scanner.nextInt();
        }
        return A;
    }

    static boolean checkMatch(int B[], int x) {
        for (int i = 0; i < B.length; i++) {
            if (B[i] == x)
                return false;
        }
        return true;
    }

    static int solution(int A[], int B[], int C[]) {
        int n = 0;
        int count;
        for (int i = 0; i < A.length; i++) {
            if (checkMatch(B, A[i])) {
                count = 0;
                for (int j = 0; j < A.length; j++) {
                    if (A[i] == A[j])
                        count++;
                }
                B[n] = A[i];
                C[n++] = count;
            }
        }
        return n;
    }

    static void output(int B[], int C[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(B[i] + " " + C[i]);
        }
    }
}
