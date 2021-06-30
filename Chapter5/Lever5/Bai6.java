import java.util.Scanner;

public class Bai6 {
    // Đếm số lượng số chính phương nhỏ hơn n
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result;
        result = solution(n);
        output(result);
    }

    static boolean checkSquareNumber(int n) {
        int temp = (int) Math.sqrt(n);
        if (temp * temp == n)
            return true;
        return false;
    }

    static int solution(int n) {
        int count = 0;
        for (int i = 1; i < n; i++) {
            if (checkSquareNumber(i))
                count++;
        }
        return count;
    }

    static void output(int result) {
        System.out.println(result);
    }
}
