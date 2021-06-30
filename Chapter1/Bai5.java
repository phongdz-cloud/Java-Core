import java.util.Scanner;
//Nhập vào một năm. Cho biết năm đó có phải năm nhuận hay không
public class Bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        if (solution(year)) {
            System.out.println(year + " la nam nhuan");
        } else {
            System.out.println(year + " khong phai nam nhuan");
        }
    }

    static boolean solution(int year) {
        if (year % 400 == 0)
            return true;
        if (year % 4 == 0 && year % 100 != 0)
            return true;
        return false;
    }
}
