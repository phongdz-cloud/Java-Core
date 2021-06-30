
import java.util.Scanner;

public class Bai6 {
    // Nhập vào số nguyên n.Tìm chữ số lớn nhất của n?
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        boolean flag;
        flag = findEvenNumber(n);
        output(flag);
    }

    static boolean findEvenNumber(int n) {
        while (n > 0) {
            if (n % 2 != 0)
                return false;
            n /= 10;
        }
        return true;
    }

    static void output(Boolean flag) {
        if (flag == true)
            System.out.println("N vua nhap deu gom cac chu so chan");
        else
            System.out.println("N vua nhap khong gom cac chu so chan");
    }
}
