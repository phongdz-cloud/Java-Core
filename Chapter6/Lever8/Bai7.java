import java.util.Scanner;

public class Bai7 {
    /*
     * Viết chương trình tìm số âm lớn nhất trong một mảng các số nguyên
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
        result = solution(A);
        output(result);
    }

    static void input(int[] A) {
        for (int i = 0; i < A.length; i++) {
            A[i] = scanner.nextInt();
        }
    }

    static int solution(int A[]) {
        int maxNegative = Integer.MIN_VALUE;
        for (int i = 0; i < A.length; i++) {
            if (A[i] > maxNegative && A[i] < 0)
                maxNegative = A[i];
        }
        return maxNegative;
    }

    static void output(int result) {
        if (result != Integer.MIN_VALUE) {
            System.out.print(result);
        } else
            System.out.print("Mang khong ton tai so am!");
    }
}
