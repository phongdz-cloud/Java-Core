import java.util.Scanner;

public class Bai11 {
    /*
     * Viết chương trình kiểm tra các phần tử có tăng liên tục hay không
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
            if (A[i] >= A[i + 1])
                return false;
        }
        return true;
    }

    static void output(Boolean result) {
        if (result)
            System.out.println("Mang tang lien tuc");
        else
            System.out.println("Mang khong tang lien tuc");
    }
}
