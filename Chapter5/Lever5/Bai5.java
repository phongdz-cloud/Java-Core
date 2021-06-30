import java.util.Scanner;

public class Bai5 {
    // Liệt kê các số hoàn hảo nhỏ hơn n
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        output(n);
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

    static void output(int n) {
        for (int i = 1; i < n; i++) {
            if (checkPerfectNumber(i))
                System.out.print(i + " ");
        }
    }
}
