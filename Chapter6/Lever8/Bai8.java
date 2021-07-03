import java.util.Scanner;

public class Bai8 {
    /*
     * Tìm số "âm lớn nhất" trong mảng một chiều các số thực. Nếu mảng không có giá
     * trị âm thì trả về giá trị 0.
     */
    static class Param {
        public int n;
    }

    static Param param = new Param();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        param.n = scanner.nextInt();
        float[] A;
        float result;
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

    static float solution(float A[]) {
        float maxNegative = Float.MAX_VALUE * (-1);
        for (int i = 0; i < A.length; i++) {
            if (A[i] > maxNegative && A[i] < 0)
                maxNegative = A[i];
        }
        return (maxNegative != Float.MAX_VALUE * (-1)) ? maxNegative : 0;
    }

    static void output(float result) {
        System.out.println(result);
    }
}
