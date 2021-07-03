import java.util.Scanner;

public class Bai17 {
     /*
     * Cho mảng A có n phần tử đã có thứ tự tăng dần và một phần tử x. Thực hiện
     * chèn x vào mảng sao cho đảm bảo mảng vẫn có thứ tự tăng dần
     */
    static class Param {
        public int n;
    }

    static Param param = new Param();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        param.n = scanner.nextInt();
        int[] A;
        A = new int[param.n];
        input(A);
        solution(A);
    }

    static void input(int[] A) {
        for (int i = 0; i < A.length; i++) {
            A[i] = scanner.nextInt();
        }
    }

    static void arrayCopy(int A[], int B[]) {
        for (int i = 0; i < A.length; i++) {
            B[i] = A[i];
        }
    }

    static void insert(int A[], int index, int x) {
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
        output(A);
    }

    static void solution(int A[]) {
        int x;
        x = scanner.nextInt();
        Arrays.sort(A);
        for (int i = 0; i < A.length - 1; i++) {
            if (x >= A[i] && x <= A[i + 1]) {
                insert(A, i, x);
                return;
            }
        }
    }

    static void output(int[] A) {
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
    }
}
