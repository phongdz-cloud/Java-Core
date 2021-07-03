
import java.util.Scanner;

public class Bai12 {
    /*
     * Tìm "số hoàn thiện nhỏ nhất" trong mảng một chiều các số nguyên. Nếu mảng
     * không có số nguyên tố thì trả về số 0
     */
    static class Param {
        public int n;
    }

    static Param param = new Param();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        param.n = scanner.nextInt();
        float[] A;
        int result;
        A = new float[param.n];
        input(A);
        result = solution(A);
        output(result);
    }

    static void input(float[] A) {
        for (int i = 0; i < A.length; i++) {
            A[i] = scanner.nextFloat();
        }
    }

    static int solution(float A[]) {
        float maxNegative = Float.MAX_VALUE * (-1);
        int indexMaxNegative = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] > maxNegative && A[i] < 0) {
                maxNegative = A[i];
                indexMaxNegative = i;
            }
        }
        return (maxNegative != Float.MAX_VALUE * (-1)) ? indexMaxNegative : -1;
    }

    static void output(int result) {
        System.out.println(result);
    }
}
