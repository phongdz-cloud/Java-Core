
import java.util.Scanner;

public class Bai6 {
     /*
     * Viết chương trình xóa bỏ khoảng trắng thừa trong một chuỗi
     */

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String s;
        int result;
        s = input();
        result = solution(s);
        output(result);
    }

    static String input() {
        String s;
        s = scanner.nextLine();
        return s;
    }

    static int solution(String s) {
        int sum, temp;
        boolean flag;
        flag = false;
        temp = sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                temp = temp * 10 + s.charAt(i) - 48;
                if (s.charAt(i - 1) == '-')
                    flag = true;
            } else {
                if (temp != 0) {
                    if (flag)
                        sum += (-1) * temp;
                    else
                        sum += temp;
                    flag = false;
                    temp = 0;
                }
            }
        }
        if (flag)
            sum += (-1) * temp;
        else
            sum += temp;
        return sum;
    }

    static void output(int result) {
        System.out.println(result);
    }
}
