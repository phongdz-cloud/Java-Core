
import java.util.Scanner;

public class Bai3 {
     /*
     * Viết chương trình nhập vào một mảng ký tự (chuỗi), xuất ra chuỗi đảo ngược
     */

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String s;
        s = input();
        s = reverseStr(s);
        output(s);
    }

    static String input() {
        String s;
        s = scanner.nextLine();
        return s;
    }

    static String reverseStr(String s) {

        char[] temparray = s.toCharArray();
        int i, j;
        i = 0;
        j = temparray.length - 1;
        while (j > i) {
            char temp = temparray[i];
            temparray[i] = temparray[j];
            temparray[j] = temp;
            i++;
            j--;
        }
        s = String.valueOf(temparray);
        return s;
    }

    static void output(String s) {
        System.out.println(s);
    }
}
