import java.util.Scanner;

public class Bai8 {
    /*
     * Viết chương trình kiểm tra một chuỗi có phải là chuỗi con của chuỗi kia hay
     * không
     */

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String s1, s2;
        boolean result;
        s1 = input();
        s2 = input();
        result = solution(s1, s2);
        output(result);
    }

    static String input() {
        String s;
        s = scanner.nextLine();
        return s;
    }

    static boolean solution(String s1, String s2) {
        if (s1.length() > s2.length()) {
            String temp;
            temp = s1;
            s1 = s2;
            s2 = temp;
        }
        int k;
        k = 0;
        for (int i = 0; i < s2.length(); i++) {
            if (k == s1.length())
                return true;
            if (s2.charAt(i) == s1.charAt(k))
                k++;
            else
                k = 0;
        }
        return k == s1.length();
    }

    static void output(boolean result) {
        System.ou
}
