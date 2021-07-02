import java.util.Scanner;

public class Bai10 {
    /*
     * Nhập vào một mảng số nguyên. Nhập tiếp một số nguyên x. Cho biết mảng có bao
     * nhiêu phần tử bằng x
     */
    static class Param {
        public int n;
        public int x;
    }

    static Param param = new Param();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        param.n = scanner.nextInt();
        int[] A;
        A = new int[param.n];
        input(A, param);
        int result;
        result = solution(A, param);
        output(result);
    }

    static void input(int[] A, Param param) {
        for (int i = 0; i < A.length; i++) {
            A[i] = scanner.nextInt();
        }
        param.x = scanner.nextInt();
    }

    static int solution(int[] A, Param param) {
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == param.x)
                count++;
        }
        return count;
    }

    static void output(int result) {
        System.out.println(result);
    }
}
