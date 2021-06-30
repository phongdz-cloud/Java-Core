import java.util.Scanner;

public class Bai12 {
    // Nhập số nguyên dương n. Tính S = 1 + (1+2)/2! + (1+2+3)/3! + ... + (1+2+3 +
    // ... +n)/n!
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        float result;
        result = solution(n);
        output(result);
    }

    static float solution(int n) {
        float result = 0;
        int sum = 0;
        float mul = 1;
        for (int i = 1; i <= n; i++) {
            sum += i;
            mul *= (1.0) / i;
            result += (sum) * mul;
        }
        return result;
    }

    static void output(float result) {
        System.out.println(result);
    }

}
