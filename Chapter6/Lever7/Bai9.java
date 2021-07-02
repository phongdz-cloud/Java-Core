import java.util.Scanner;

public class Bai9 {
    /*
     * Tìm vị trí số nhỏ nhất trong một mảng số nguyên
     */
    static class Param {
        public int n;
    }

    static Param param = new Param();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        param.n = scanner.nextInt();
        int[] A;
        int result;
        A = new int[param.n];
        input(A);
        result = findMinArray(A);
        output(result);

    }

    static void input(int[] A) {
        for (int i = 0; i < A.length; i++) {
            A[i] = scanner.nextInt();
        }
    }

    static int findMinArray(int[] A) {
        int min = A[0];
        int index = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] < min) {
                min = A[i];
                index = i;
            }
        }
        return index;
    }

    static void output(int result) {
        System.out.println(result);
    }
}
