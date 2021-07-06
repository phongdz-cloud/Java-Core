import java.util.Scanner;

public class Bai1 {
    /*
     * Cho mảng số nguyên A. Tạo ra 2 mảng B va C theo quy tắc: mảng B gồm các phần
     * tử dương hoặc bằng 0 của A và mảng C gồm các phần tử âm của A
     * 
     */
    static class Param {
        public int nA;
        public int nB;
    }

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int nA;
        nA = scanner.nextInt();
        int A[];
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

    static Param length(int[] A) {
        Param param = new Param();
        param.nA = param.nB = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] >= 0)
                param.nA++;
            else
                param.nB++;
        }
        return param;
    }

    static void solution(int[] A) {
        Param param = length(A);
        int[] B;
        int[] C;
        int j, k;
        j = k = 0;
        B = new int[param.nA];
        C = new int[param.nB];
        for (int i = 0; i < A.length; i++) {
            if (A[i] >= 0)
                B[j++] = A[i];
            else
                C[k++] = A[i];
        }
        output(B);
        output(C);
    }

    static void output(int[] A) {
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();
    }
}
