import java.util.Scanner;

public class Bai2 {
    /*
     * Viết chương trình nhập vào một dãy số A gồm m số thực , nhập vào dãy số B gồm
     * n số thực. In ra những phần tử xuất hiện ở cả 2 dãy
     */
    static class Param {
        public int nA;
        public int nB;
    }

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int nA, nB;
        float A[], B[];
        nA = scanner.nextInt();
        A = input(nA);
        nB = scanner.nextInt();
        B = input(nB);
        solution(A, B);
    }

    static float[] input(int nA) {
        float[] A = new float[nA];
        for (int i = 0; i < A.length; i++) {
            A[i] = scanner.nextFloat();
        }
        return A;
    }

    static boolean checkMatch(float C[], float x) {
        for (int i = 0; i < C.length; i++) {
            if (x == C[i])
                return false;
        }
        return true;
    }

    static void solution(float A[], float B[]) {
        float C[];
        boolean flag;
        int nC = 0;
        C = new float[length(A, B)];
        for (int i = 0; i < A.length; i++) {
            flag = true;
            for (int j = 0; j < B.length; j++) {
                if (A[i] == B[j]) {
                    flag = false;
                    break;
                }
            }
            if (flag && checkMatch(C, A[i]))
                C[nC++] = A[i];
        }
        output(C, nC);
    }

    static int length(float[] A, float B[]) {
        int count = 0;
        boolean flag;
        for (int i = 0; i < A.length; i++) {
            flag = true;
            for (int j = 0; j < B.length; j++) {
                if (A[i] == B[j]) {
                    flag = false;
                    break;
                }
            }
            if (flag)
                count++;
        }
        return count;
    }

    static void output(float[] A, int nA) {
        for (int i = 0; i < nA; i++) {
            System.out.print(A[i] + " ");
        }
    }
}
