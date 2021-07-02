import java.util.Scanner;

public class Bai1 {
    /*
     * Nhập vào một mảng có n số nguyên. Xuất ra mảng vừa nhập
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int n = scanner.nextInt();
        int[] A;
        A = new int[n];
        input(A);
        output(A);
    }

    static void input(int[] A) {
        for (int i = 0; i < A.length; i++) {
            A[i] = scanner.nextInt();
        }
    }

    static void output(int[] A) {
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
    }
}
