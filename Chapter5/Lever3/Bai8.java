import java.util.Scanner;

public class Bai8 {
    // Nhập vào số nguyên dương n. Xuất ra số ngược lại VD: Nhập 1706 -> 6071
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result;
        result = solution(n);
        output(result);
    }

    static int solution(int n) {
        int sum = 0;
        while (n > 0) {
            int temp = n % 10;
            n /= 10;
            sum = sum * 10 + temp;
        }
        return sum;
    }

    static void output(int result) {
        System.out.println(result);
    }
}
