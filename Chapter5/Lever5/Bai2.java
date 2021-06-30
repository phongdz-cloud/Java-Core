import java.util.Scanner;

public class Bai2 {
    // Liệt kê các số nguyên tố hoàn hảo nhỏ hơn n
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result;
        result = solution(n);
        output(result);
    }

    static boolean checkPerfectNumber(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0)
                sum += i;
        }
        if (sum == n)
            return true;
        return false;
    }

    static int solution(int n) {
        int count = 0;
        for (int i = 1; i < n; i++) {
            if (checkPerfectNumber(i)) {
                count++;
            }
        }
        return count;
    }

    static void output(int result) {
        System.out.println(result);
    }
}
