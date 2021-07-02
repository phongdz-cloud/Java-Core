import java.util.Scanner;

public class Bai16 {
    /*
     * Tìm "số nguyên dương cuối cùng" trong mảng số nguyên có n phần tử. Nếu mảng
     * không có giá trị dương thì trả về giá trị -1
     */
    static class Param {
        public int n;
    }

    static Param param = new Param();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        param.n = scanner.nextInt();
        int[] A;
        A = new int[param.n];
        input(A);
        int result;
        result = solution(A);
        output(result);
    }

    static void input(int[] A) {
        for (int i = 0; i < A.length; i++) {
            A[i] = scanner.nextInt();
        }
    }

    static int solution(int A[]) {
        int positiveNumber = -1;
        for (int i = 0; i < A.length; i++) {
            if (A[i] > 0)
                positiveNumber = A[i];
        }
        if (positiveNumber != -1)
            return positiveNumber;
        return -1;
    }

    static void output(int result) {
        System.out.println(result);
    }
}
