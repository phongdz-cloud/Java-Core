
import java.util.Scanner;

public class Bai1 {
    /*
     * Viết chương trình nhập vào một số ở hệ 16, đổi số này sang hệ 10
     */

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        char hex[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'F' };
        String s;
        int result;
        s = input();
        result = solution(s, hex);
        output(result);

    }

    static String input() {
        String s;
        s = scanner.nextLine();
        return s;
    }

    static boolean checkValid(String s) {
        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) < 'A' || s.charAt(i) > 'F') && (s.charAt(i) < '0' || s.charAt(i) > '9'))
                return false;
        }
        return true;
    }

    static int checkHexDigit(char s, char hex[]) {
        int decimal;
        decimal = 0;
        for (int i = 0; i < 15; i++) {
            if (s == hex[i]) {
                decimal = i;
                break;
            }
        }
        return decimal;
    }

    static int solution(String s, char hex[]) {
        if (checkValid(s)) {
            int sum, k, convertToDecimal;
            sum = k = 0;
            for (int i = s.length() - 1; i >= 0; i--) {
                convertToDecimal = checkHexDigit(s.charAt(i), hex);
                sum += convertToDecimal * (int) Math.pow(16, k++);
            }
            return sum;
        }
        return -1;
    }

    static void output(int result) {
        if (result != -1)
            System.out.println(result);
        else
            System.out.println("Dao vao khong hop le!");
    }
}
