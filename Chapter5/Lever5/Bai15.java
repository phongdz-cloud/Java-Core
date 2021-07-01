
import java.util.Scanner;

public class Bai15 {
    // Nhập số nguyên dương n, số thực x (x>0). Tính sqrt(x+(sqrt(x + ...sqrt(x))))
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        boolean flag;
        float result;
        flag = checkValid(n, x);
        result = solution(n, x, flag);
        output(result);
    }

    static boolean checkValid(int n, int x) {
        if (n > 0 && x > 0)
            return true;
        return false;
    }

    static float solution(int n, int x, boolean flag) {
        if (flag == true) {
            float temp, sum;
            sum = 0;
            for (int i = 1; i <= n; i++) {
                temp = sum + x;
                sum = (float) Math.sqrt(temp);
            }
            return sum;
        }
        return -1;
    }

    static void output(float result) {
        if (result != 1)
            System.out.println(result);
        else
            System.out.println("Khong tinh duoc!");
    }

}
