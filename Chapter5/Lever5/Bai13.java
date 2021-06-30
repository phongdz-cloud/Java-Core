import java.util.Scanner;

public class Bai13 {
    // Nhập số nguyên n và số thực x Tính S = 1 + x/1 + x^2/2! + ... + x^n/n!
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double x = scanner.nextDouble();
        double result;
        result = solution(n, x);
        output(result);
    }

    static double solution(int n, double x) {
        double result = 1;
        double numerator = 0;
        double mul = 1;
        for (int i = 1; i <= n; i++) {
            numerator = Math.pow(x, i);
            mul *= (1.0) / i;
            result += numerator * mul;
        }
        return result;
    }

    static void output(double result) {
        System.out.println(result);
    }
}
