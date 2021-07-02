
import java.util.Scanner;

public class Bai15 {
    /*
     * Viết hàm tìm "số chẵn đầu tiên" trong mảng các số nguyên. nếu mảng không có
     * giá trị chẵn thì hàm sẽ trả về giá trị không chẵn là -1
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
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0)
                return A[i];
        }
        return -1;
    }

    static void output(int result) {
        System.out.println(result);
    }
}
