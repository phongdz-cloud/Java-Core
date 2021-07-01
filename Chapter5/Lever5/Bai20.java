import java.util.Scanner;

public class Bai20 {
    /*
     * Phân tích n thành các thừa số nguyên tố
     */
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

    static void solution(int n) {
        int i = 2;
        while (n > 1) {
            if (n % i == 0 && checkPrimeNumber(i)) {
                n /= i;
                System.out.print(i + " ");
            } else
                i++;
        }
    }

    static void output(int n) {
        solution(n);
    }
}
