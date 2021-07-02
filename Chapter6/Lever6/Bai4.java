import java.util.Scanner;

public class Bai4 {
    /*
     * Viết chương trình tính trung bình cộng của số chia hết cho 5
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int n = scanner.nextInt();
        int[] A;
        float result;
        A = new int[n];
        input(A);
        result = solution(A);
        output(result);
    }

    static void input(int[] A) {
        for (int i = 0; i < A.length; i++) {
            A[i] = scanner.nextInt();
        }
    }

    static float solution(int[] A) {
        int sum = 0;
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 5 == 0) {
                sum += A[i];
                count++;
            }
        }
        return (float) (sum) / count;
    }

    static void output(float result) {
        System.out.println(result);
    }
}
