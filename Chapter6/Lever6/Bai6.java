import java.util.Scanner;

public class Bai6 {
    /*
     * Viết chương trình đếm các số âm trong một mảng các số nguyên
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
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] < 0) {
                count++;
            }
        }
        return count;
    }
}
