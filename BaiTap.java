import java.util.Scanner;

public class BaiTap {
    /*
     * Viết chương trình nhập vào một mảng, trong quá trình nhập, mảng được sắp xếp
     * thứ tự luôn (tăng / giảm)
     */
    static class Param {
        public int n;
    }

    static Param param = new Param();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        param.n = scanner.nextInt();
        int[] A;
        A = new int[1];
        A = input(A, param.n);
        output(A);
    }

    static int[] input(int[] A, int n) {
        int x, index;
        A[0] = scanner.nextInt();
        for (int i = 1; i < n; i++) {
            x = scanner.nextInt();
            index = checkIndex(A, x);
            A = Insert(A, index, x);
        }
        return A;
    }

    static int checkIndex(int C[], int x) {
        if (x < C[0])
            return 0;
        for (int i = 0; i < C.length - 1; i++) {
            if (x >= C[i] && x <= C[i + 1])
                return i;
        }
        return C.length - 1;
    }

    static void arrayCopy(int A[], int B[]) {
        for (int i = 0; i < A.length; i++) {
            B[i] = A[i];
        }
    }

    static int[] Insert(int A[], int index, int x) {
        int[] B;
        int j;
        j = 0;
        B = new int[A.length];
        arrayCopy(A, B);
        A = null;
        A = new int[B.length + 1];
        if (index == 0 && x < B[0]) {
            A[j++] = x;
            index = -1;
        }
        for (int i = 0; i < B.length; i++) {
            A[j++] = B[i];
            if (i == index)
                A[j++] = x;
        }
        B = null;
        return A;
    }

    static void output(int[] C) {
        for (int i = 0; i < C.length; i++) {
            System.out.print(C[i] + " ");
        }
    }
}
