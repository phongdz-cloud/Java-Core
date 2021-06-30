import java.util.Scanner;

public class Bai10 {
    // Nhập 3 số nguyên a, b, và n với a,b <n. Tính tổng các số nguyên dương nhỏ hơn
    // n chia hết cho a nhưng không
    // chia hết cho b
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();
        int result;
        boolean flag;
        flag = flagCheckNumber(a, b, n);
        result = solution(a, b, n);
        output(result, flag);
    }

    static boolean flagCheckNumber(int a, int b, int n) {
        if (a < n && b < n)
            return true;
        return false;
    }

    static int solution(int a, int b, int n) {
        int sum = 0;
        int temp;
        for (int i = 1; i < n; i++) {
            temp = sum + i;
            if (temp % a == 0 && temp % b != 0) {
                sum += i;
            }
        }
        return sum;
    }

    static void output(int result, Boolean flag) {
        if (flag == false) {
            System.out.println("A hoac B lon hon n");
        } else
            System.out.println(result);
    }
}
