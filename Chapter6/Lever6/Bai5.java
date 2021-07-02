import java.util.Scanner;

public class Bai5 {
    /*
     * Viết chương trình tính tổng các số chẵn trong một mảng các số nguyên không âm
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int n = scanner.nextInt();
        int[] A;
        int result;
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

    static int solution(int[] A) {
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0 && A[i] > 0) {
                sum += A[i];
            }
        }
        return sum;
    }

    static void output(int result) {
        System.out.println(result);
    }
}
