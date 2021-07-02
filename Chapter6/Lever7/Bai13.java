import java.util.Scanner;

public class Bai13 {
    /*
     * Viết chương trình kiểm tra các phần tử trong một mảng có gồm toàn các số lẻ
     * hay không
     */
    static class Param {
        public int n;
    }

    static Param param = new Param();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        param.n = scanner.nextInt();
        int[] A;
        boolean flag;
        A = new int[param.n];
        input(A);
        flag = solution(A);
        output(flag);
    }

    static void input(int[] A) {
        for (int i = 0; i < A.length; i++) {
            A[i] = scanner.nextInt();
        }
    }

    static boolean solution(int A[]) {
        for (int i = 0; i < A.length - 1; i++) {
            if (A[i] % 2 == 0)
                return false;
        }
        return true;
    }

    static void output(Boolean result) {
        if (result)
            System.out.println("Cac phan tu trong mang la so le");
        else
            System.out.println("Cac phan tu trong mang khong phai la so le");
    }

}
