import java.util.Scanner;

public class Bai3 {
    /*
     * Cho mảng một chiều các số nguyên. Hãy viết hàm tìm giá trị đầu tiên thỏa mãn
     * tinh chất số gánh. (Ví dụ giá trị 12321)
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

    static boolean checkReverseNumber(int n) {
        int rev = 0;
        int x = n;
        int temp;
        while (n > 0) {
            temp = n % 10;
            n /= 10;
            rev = rev * 10 + temp;
        }
        return rev == x;
    }

    static int solution(int A[]) {

        for (int i = 0; i < A.length; i++) {
            if (checkReverseNumber(A[i]) == true)
                return A[i];
        }
        return -1;
    }

    static void output(int result) {
        if (result != -1)
            System.out.print(result);
        else
            System.out.print("Mang khong co phan tu nao thoa man tinh chat so ganh");
    }
}
