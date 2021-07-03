
import java.util.Scanner;

public class Bai16 {
    /*
     * Cho mảng một chiều các số thực và một số thực x. Hãy viết hàm tìm giá trị âm
     * cuối cùng lớn hơn giá trị x. Nếu mảng không có giá trị thỏa thì hàm trả về
     * giá trị không chẵn là 0
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
        // update(A);
        // insert(A);
        remove(A);
    }

    static void input(int[] A) {
        for (int i = 0; i < A.length; i++) {
            A[i] = scanner.nextInt();
        }
    }

    static boolean checkValid(int n, int index) {
        return index >= 0 && index < n;
    }

    static void update(int A[]) {
        int index, x;
        index = scanner.nextInt();
        x = scanner.nextInt();
        if (checkValid(A.length, index)) {
            A[index] = x;
        }
    }

    static void arrayCopy(int A[], int B[]) {
        for (int i = 0; i < A.length; i++) {
            B[i] = A[i];
        }
    }

    static void insert(int A[]) {
        int index, x;
        index = scanner.nextInt();
        x = scanner.nextInt();
        if (checkValid(A.length, index)) {
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
        }
        output(A);
    }

    static void remove(int[] A) {
        int index;
        index = scanner.nextInt();
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
        output(A);
    }

    static void output(int[] A) {
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
    }
}
