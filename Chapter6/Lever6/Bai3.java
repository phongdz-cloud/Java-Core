import java.util.Scanner;
public class Bai3 {
     /*
     * viết chương trình tính trung bình cộng của một mảng số nguyên N
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
        for (int i = 0; i < A.length; i++) {
            sum += A[i];
        }
        return (float) (sum) / A.length;
    }

    static void output(float result) {
        System.out.println(result);
    }
}
