import java.util.Scanner;

public class Bai4 {
    /*
     * Viết chương trình đếm số từ trong một chuỗi đa nhập từ bàn phím
     */

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String s;
        int result;
        s = input();
        s = removeSpace(s);
        result = countWords(s);
        output(result);
    }

    static String input() {
        String s;
        s = scanner.nextLine();
        return s;
    }

    static String removeSpace(String s) {
        StringBuffer buff = new StringBuffer(s);
        while (buff.charAt(0) == ' ')
            buff.deleteCharAt(0);
        while (buff.length() != 0 && buff.charAt(buff.length() - 1) == ' ')
            buff.deleteCharAt(buff.length() - 1);
        for (int i = 0; i < buff.length() - 1; i++) {
            if (buff.charAt(i) == ' ' && buff.charAt(i + 1) == ' ') {
                buff.deleteCharAt(i--);
            }
        }
        s = buff.toString();
        return s;
    }

    static int countWords(String s) {
        int count = 0;
        if (s.length() == 0)
            return count;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == ' ' && s.charAt(i + 1) != ' ')
                count++;
        }
        return count + 1;
    }

    static void output(int result) {
        System.out.println(result);
    }
}
