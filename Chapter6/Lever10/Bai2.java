

import java.util.Scanner;

public class Bai2 {
    /*
     * Cho số nguyên n nhập từ bàn phím. Viết chương trình đổi số này sang các hệ
     * nhị phân, bát phân, và thập lục phân. In kết quả ra màn hình
     */

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        char hex[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
        String s;
        int n;
        n = input();
        s = convertToBinary(n);
        output(s);
        s = convertToOctal(n);
        output(s);
        s = convertToHex(n, hex);
        output(s);
    }

    static int input() {
        int n;
        n = scanner.nextInt();
        return n;
    }

    static String convertToBinary(int n) {
        String s;
        s = "";
        while (n != 0) {
            s += (char) (n % 2 + 48);
            n /= 2;
        }
        s = reverseStr(s);
        return s;
    }

    static String convertToOctal(int n) {
        String s;
        s = "";
        float balance;
        while (n > 7) {
            balance = (float) (n * 1.0 / 8);
            s += (char) ((8 * (balance - (int) balance)) + 48);
            n /= 8;
        }
        s += n + 48;
        s = reverseStr(s);
        return s;
    }

    static String convertToHex(int n, char hex[]) {
        String s;
        s = "";
        float balance;
        int index;
        while (n > 15) {
            balance = (float) (n * 1.0 / 16);
            index = (int) (16 * (balance - (int) balance));
            s += hex[index];
            n /= 16;
        }
        s += hex[n];
        s = reverseStr(s);
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
