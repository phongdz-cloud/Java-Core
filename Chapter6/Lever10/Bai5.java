import java.util.Scanner;

public class Bai5 {
     /*
     * Viết chương trình xóa bỏ khoảng trắng thừa trong một chuỗi
     */

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String s;
        s = input();
        s = removeSpace(s);
        output(s);
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

    static void output(String s) {
        System.out.println(s);
    }
}
