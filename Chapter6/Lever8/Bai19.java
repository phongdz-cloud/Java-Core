import java.util.Scanner;

public class Bai19 {
    /*
     * Cho 2 mảng A,B có thứ tự tăng dần. Thực hiện việc trộn 2 mảng A và B để tạo
     * ra mảng cũng có thứ tự tăng dần
     */
    static class Param {
        public int n;
        public int a;
        public int b;
    }

    static Param param = new Param();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        param.n = scanner.nextInt();
        int[] A;
        int[] B;
        int[] C;
        A = new int[param.n];
        B = new int[param.n];
        C = new int[2];
        input(A);
        input(B);
        Arrays.sort(A);
        Arrays.sort(B);
        mergeArray(A, B, C, param);
    }

    static void input(int[] A) {
        for (int i = 0; i < A.length; i++) {
            A[i] = scanner.nextInt();
        }
    }

    static int checkIndex(int C[], int x) {
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
        B = new int[A.length];
        arrayCopy(A, B);
        A = null;
        A = new int[B.length + 1];
        for (int i = 0, j = 0; i < B.length; i++) {
            A[j++] = B[i];
            if (i == index)
                A[j++] = x;
        }
        B = null;
        return A;
    }

    static void swap(Param param) {
        int temp;
        temp = param.a;
        param.a = param.b;
        param.b = temp;
    }

    static void mergeArray(int A[], int B[], int C[], Param param) {
        param.a = A[0];
        param.b = B[0];
        if (param.a > param.b)
            swap(param);
        C[0] = param.a;
        C[1] = param.b;
        for (int i = 1; i < A.length; i++) {
            C = Insert(C, checkIndex(C, A[i]), A[i]);
            C = Insert(C, checkIndex(C, B[i]), B[i]);
        }
        output(C);
    }

    static void output(int[] C) {
        for (int i = 0; i < C.length; i++) {
            System.out.print(C[i] + " ");
        }
    }
}
