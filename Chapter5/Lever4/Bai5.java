import java.util.Scanner;

public class Bai5 {
    // Nhập vào số nguyên n.Tìm chữ số lớn nhất của n?
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result;
        result = findPrimeNumber(n);
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

    static int findPrimeNumber(int n) {
        int count = 0;
        while (n > 0) {
            if (checkPrimeNumber(n % 10) == true)
                count++;
            n /= 10;
        }
        return count;
    }

    static void output(int result) {
        System.out.println(result);
    }
}
