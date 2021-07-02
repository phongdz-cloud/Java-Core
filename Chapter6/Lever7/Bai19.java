import java.util.Scanner;

public class Bai19 {
    /*
     * Viết chương trình kiểm tra các phần tử trong một mảng có gồm toàn các số
     * chính phương không
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

    static boolean checkSquareNumber(int n) {
        int temp = (int) Math.sqrt(n);
        if (temp * temp == n)
            return true;
        return false;
    }

    static boolean solution(int A[]) {
        for (int i = 0; i < A.length; i++) {
            if (checkSquareNumber(A[i]) == false)
                return false;
        }
        return true;
    }

    static void output(Boolean result) {
        if (result)
            System.out.println("Mang gom toan cac so chinh phuong");
        else
            System.out.println("Mang khong gom toan cac so chinh phuong");
    }
}
