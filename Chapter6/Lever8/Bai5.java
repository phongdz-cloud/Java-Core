import java.util.Scanner;

public class Bai5 {
    /*
     * Ta định nghĩa 1 mảng được gọi là dạng sóng khi phần tử có trị số i lớn hơn
     * hoặc nhỏ hơn 2 phần tử xung quanh. Hãy viết hàm kiểm tra mảng có dạng sóng
     * không về giá trị 0
     */
    static class Param {
        public int n;
    }

    static Param param = new Param();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        param.n = scanner.nextInt();
        int[] A;
        boolean result;
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

    static boolean checkWave(int a, int b, int c) {
        return ((a > b && a > c) || (a < b && a < c));
    }

    static boolean solution(int A[]) {

        if (A.length < 3)
            return false;
        for (int i = 1; i < A.length - 1; i++) {
            if (checkWave(A[i], A[i - 1], A[i + 1]))
                return true;
        }
        return false;
    }

    static void output(Boolean result) {
        if (result)
            System.out.println("Mang co tinh chat dang song");
        else
            System.out.println("Mang khong co tinh chat dang so");
    }
}
