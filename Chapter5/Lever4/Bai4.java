import java.util.Scanner;
public class Bai4 {
    // Nhập vào số nguyên n.Tìm chữ số lớn nhất của n?
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result;
        result = findMaxNumber(n);
        output(result);
    }

    static int findMaxNumber(int n) {
        int max = 0;
        while (n > 0)
        {
            if (n % 10 > max)
            {
                max = n % 10;
            }
            n /= 10;
        }
        return max;
    }

    static void output(int result) {
        System.out.println(result);
    }
}
