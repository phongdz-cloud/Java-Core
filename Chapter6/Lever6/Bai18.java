import java.util.Scanner;
public class Bai18 {
    /*
     * Viết chương trình đảo ngược mảng ban đầu
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
        reverseArray(A);
        output(A);
    }

    static void input(int[] A) {
        for (int i = 0; i < A.length; i++) {
            A[i] = scanner.nextInt();
        }
    }

    static void reverseArray(int A[]) {
        int i = 0;
        int j = A.length - 1;
        int temp;
        while (j > i) {
            temp = A[i];
            A[i++] = A[j];
            A[j--] = temp;
        }
    }

    static void output(int A[]) {
        for (int i = 0; i < A.length; i++)
            System.out.print(A[i] + " ");
    }
}
