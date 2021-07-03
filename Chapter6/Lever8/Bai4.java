import java.util.Scanner;

public class Bai4 {
    /*
     * Tìm giá trị đầu tiên trong mảng 1 chiều các số nguyên có chữ số đầu tiên là
     * chữ số lẻ (dauledautien) Nếu trong mảng không tồn tại giá trị như vậy hàm trả
     * về giá trị 0
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

    static boolean checkOddNumber(int n) {
        while (n > 10) {
            n /= 10;
        }
        return n % 2 != 0;
    }

    static int solution(int A[]) {

        for (int i = 0; i < A.length; i++) {
            if (checkOddNumber(A[i]) == true)
                return A[i];
        }
        return -1;
    }

    static void output(int result) {
        System.out.println(result);
    }
}
