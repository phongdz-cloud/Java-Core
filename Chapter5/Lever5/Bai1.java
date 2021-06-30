import java.util.Scanner;

public class Bai1 {
    // Liệt kê các số nguyên tố nhỏ hơn n
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        output(n);
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

    static void output(int n) {
        for (int i = 0; i < n; i++) {
            if (checkPrimeNumber(i))
                System.out.print(i + " ");
        }
    }
}
