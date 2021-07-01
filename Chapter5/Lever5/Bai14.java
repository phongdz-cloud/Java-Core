import java.util.Scanner;

public class Bai14 {
    // Nhập 2 số nguyên dương n và k (k<=n). Tính nCk = n!/(k!*(n-k)!)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        boolean flag;
        double result;
        flag = checkValid(n, k);
        result = solution(n, k, flag);
        output(result);

    }

    static boolean checkValid(int n, int k) {
        if (n >= k)
            return true;
        return false;
    }

    static double solution(int n, int k, Boolean flag) {
        if (flag == true) {
            double result;
            result = 1;
            for (int i = 1; i <= n; i++) {
                if (i <= k) {
                    result *= (1.0) / i;
                }
                if (i > n - k)
                    result *= i * (1.0);
            }
            return result;
        }
        return -1;
    }

    static void output(double result) {
        if (result != -1) {
            System.out.println(result);
        } else
            System.out.println("Khong tinh duoc!");
    }
}
