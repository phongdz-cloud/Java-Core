import java.util.Scanner;

public class Bai11 {
    // Nhập vào số nguyên dương n. Tính S = 1! + 2! + ... + n!
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result;
        result = solution(n);
        output(result);
    }

    static int factorial(int n) {
        int mul = 1;
        for (int i = 1; i <= n; i++) {
            mul *= i;
        }
        return mul;
    }

    static int solution(int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result += factorial(i);
        }
        return result;
    }

    static void output(int result) {
        System.out.println(result);
    }
}
