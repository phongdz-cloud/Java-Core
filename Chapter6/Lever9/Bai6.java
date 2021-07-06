
import java.util.Scanner;

public class Bai6 {
     /*
     * Tính tổng các phần tử "cực trị" trong mảng. Một phần tử được gọi là cực trị
     * khi nó lớn hơn hoặc nhỏ hơn các phần tử xung quanh nó
     */

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int nA, result;
        int A[];
        nA = scanner.nextInt();
        A = input(nA);
        result = solution(A);
        output(result);
    }

    static int[] input(int nA) {
        int[] A = new int[nA];
        for (int i = 0; i < A.length; i++) {
            A[i] = scanner.nextInt();
        }
        return A;
    }

    static boolean checkValid(int a, int b) {
        return ((a > b) || (a < b));
    }

    static int solution(int[] A) {
        int sum;
        sum = 0;
        if (A.length > 1) {
            if (checkValid(A[0], A[1]))
                sum += A[0];
            for (int i = 1; i < A.length - 1; i++) {
                if (checkValid(A[i], A[i - 1]) || checkValid(A[i], A[i + 1]))
                    sum += A[i];
            }
            if (checkValid(A[A.length - 1], A[A.length - 2]))
                sum += A[A.length - 1];
        }
        return sum;
    }

    static void output(int result) {
        System.out.println(result);
    }
}
