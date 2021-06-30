import java.util.Scanner;

public class Bai4 {
    // Liệt kê các số chính phương nhỏ hơn n
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        output(n);
    }

    static boolean checkSquareNumber(int n) {
        int temp = (int) Math.sqrt(n);
        if (temp * temp == n)
            return true;
        return false;
    }

    static void output(int n) {
        for (int i = 1; i < n; i++) {
            if (checkSquareNumber(i))
                System.out.print(i + " ");
        }
    }
}
