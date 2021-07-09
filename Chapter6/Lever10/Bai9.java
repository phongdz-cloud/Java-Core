import java.util.Scanner;

public class Bai9 {
    /*
     * Viết chương trình đổi chữ cái đầu tiên của mỗi từ trong một chuỗi thành chứ
     * hoa
     */

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String s1;
        s1 = input();
        s1 = standard(s1);
        output(s1);
    }

    static String input() {
        String s;
        s = scanner.nextLine();
        return s;
    }

    static String standard(String s) {
        StringBuffer s2 = new StringBuffer(s);
        if (s2.charAt(0) >= 'a' && s.charAt(0) <= 'z') {
            s2.setCharAt(0, (char) (s2.charAt(0) - 32));
        }
        for (int i = 1; i < s2.length(); i++) {
            if ((s2.charAt(i) >= 'a' && s2.charAt(i) <= 'z') && s2.charAt(i - 1) == ' ') {
                s2.setCharAt(i, (char) (s2.charAt(i) - 32));
            }
        }
        return s2.toString();
    }

    static void output(String s) {
        System.out.println(s);
    }
}
