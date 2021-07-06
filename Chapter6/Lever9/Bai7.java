
import java.util.Scanner;

public class Bai7 {
      /*
     * Đếm số lượng giá trị lớn nhất có trong mảng 1 chiều các số thực
     */

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n, result;
        float A[];
        n = scanner.nextInt();
        A = input(n);
        result = solution(A);
        output(result);
    }

    static float[] input(int n) {
        float[] A = new float[n];
        for (int i = 0; i < A.length; i++) {
            A[i] = scanner.nextFloat();
        }
        return A;
    }

    static float findMaxArray(float A[]) {
        float max = A[0];
        for (int i = 0; i < A.length; i++) {
            if (A[i] > max)
                max = A[i];
        }
        return max;
    }

    static int solution(float A[]) {
        float max = findMaxArray(A);
        int count;
        count = 0;
        for (int i = 0; i < A.length; i++) {
            if (max == A[i])
                count++;
        }
        return count;
    }

    static void output(int result) {
        System.out.println(result);
    }
}
