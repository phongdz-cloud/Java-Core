import java.util.Scanner;

public class Bai3 {
    // Nhập vào số nguyên n. Kiểm tra n có phải là số đối xứng hay không?
    // VD: 121,12321
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        boolean flag;
        flag = checkSymmetryNumber(n);
        output(flag);
    }

    static boolean checkSymmetryNumber(int n) {
        int temp = n;
        int sum = 0;
        while (n > 0) {
            int temp1 = n % 10;
            n /= 10;
            sum = sum * 10 + temp1;
        }
        if (temp == sum)
            return true;
        return false;
    }

    static void output(boolean flag) {
        if (flag == true)
            System.out.println("N la so doi xung");
        else
            System.out.println("N khong phai la so doi xung");
    }
}
