import java.util.Scanner;

public class Bai6 {
     // Nhập vào số nguyên dương n. Đếm xem n có bao nhiêu ước số
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result;
        result = solution(n);
        output(result);
    }

    static int solution(int n) {
        int count =0 ;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                count++;
        }
        return count;
    }

    static void output(int result) {
        System.out.println(result);
    }
}
