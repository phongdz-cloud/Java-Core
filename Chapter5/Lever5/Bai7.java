import java.util.Scanner;

public class Bai7 {
    // Đếm xem n có bao nhiêu ước số là số nguyên tố
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result;
        result = solution(n);
        output(result);
    }

    static boolean checkPrimeNumber(int n) {
        if (n < 2)
            return false;
        if (n == 2)
            return true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    static int solution(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0 && checkPrimeNumber(i))
                count++;
        }
        return count;
    }

    static void output(int result) {
        System.out.println(result);
    }
}
