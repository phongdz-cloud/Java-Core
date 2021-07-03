import java.util.Scanner;

public class Bai15 {
     /*
     * Cho mảng một chiều các số thực và một số thực x. Hãy viết hàm tìm giá trị âm
     * cuối cùng lớn hơn giá trị x. Nếu mảng không có giá trị thỏa thì hàm trả về
     * giá trị không chẵn là 0
     */
    static class Param {
        public int n;
        public float x;
    }

    static Param param = new Param();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        param.n = scanner.nextInt();
        float[] A;
        float result;
        A = new float[param.n];
        input(A, param);
        result = solution(A, param);
        output(result);
    }

    static void input(float[] A, Param param) {
        for (int i = 0; i < A.length; i++) {
            A[i] = scanner.nextFloat();
        }
        param.x = scanner.nextFloat();
    }

    static float solution(float A[], Param param) {
        float maxNegative = Float.MAX_VALUE * (-1);
        for (int i = 0; i < A.length; i++) {
            if (A[i] < 0 && A[i] > param.x && A[i] > maxNegative)
                maxNegative = A[i];
        }
        return maxNegative != Float.MAX_VALUE * (-1) ? maxNegative : 0;
    }

    static void output(float result) {
        System.out.println(result);
    }
}
