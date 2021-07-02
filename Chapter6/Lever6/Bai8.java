import java.util.Scanner;

public class Bai8 {
    /*
     * Kiểm tra mảng số nguyên có tồn tại giá trị 0 hay không? Nếu không tồn tại giá
     * trị 0 thì trả vể giá trị 0 , ngược lại trả về 1
     */

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int n = scanner.nextInt();
        int[] A;
        int result;
        A = new int[n];
        input(A);
        result = checkZero(A);
        output(result);
    }

    static void input(int[] A) {
        for (int i = 0; i < A.length; i++) {
            A[i] = scanner.nextInt();
        }
    }

    static int checkZero(int[] A) {
        for (int i = 0; i < A.length; i++) {
            if (A[i] == 0)
                return 1;
        }
        return 0;
    }

    static void output(int result) {
        System.out.println(result);
    }
}
