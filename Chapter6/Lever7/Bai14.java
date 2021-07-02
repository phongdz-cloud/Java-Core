import java.util.Scanner;

public class Bai14 {
    /*
     * Kiểm tra mảng các số nguyên có toàn số chẵn hay không? Nếu có tồn tại giá trị
     * lẻ trả về giá 0, ngược lại trả về giá trị 1
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
        for (int i = 0; i < A.length - 1; i++) {
            if (A[i] % 2 != 0)
                return 0;
        }
        return 1;
    }

    static void output(int result) {
        System.out.println(result);
    }
}
