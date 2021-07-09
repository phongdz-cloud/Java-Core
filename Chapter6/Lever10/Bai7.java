import java.util.Scanner;

public class Bai7 {
    /*
     * Viết hàm trích ra n ký tự đầu tiên/ cuối cùng bắt đầu từ vị trí pos
     */

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String s, s1;
        int n, p;
        s = input();
        p = scanner.nextInt();
        n = scanner.nextInt();
        s1 = subStr(n, p, s);
        output(s1);
    }

    static String input() {
        String s;
        s = scanner.nextLine();
        return s;
    }

    static boolean checkPosition(int n, int p, String s) {
        if (p < 0 && n < 0 && p >= s.length())
            return false;
        return true;
    }

    static String subStr(int n, int p, String s) {
        if (checkPosition(n, p, s)) {
            String s1 = "";
            int count = 0;
            for (int i = p; i < s.length(); i++) {
                if (count != n) {
                    s1 += s.charAt(i);
                    count++;
                }
            }
            return s1;
        }
        return "";
    }

    static void output(String result) {
        System.out.println(result);
    }
}
