import java.util.Scanner;

public class Bai2 {
    // Nhập vào số nguyên n. Cho biết n có phải là số nguyên tố hay không?
    // VD: 2,3,5,7
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        boolean flag;
        flag = checkPrimeNumber(n);
        output(flag);
    }

    static boolean checkPrimeNumber(int n) {
        if (n < 2)
            return false;
        if (n == 2)
            return true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    static void output(boolean flag) {
        if (flag == true)
            System.out.println("N la so nguyen to");
        else
            System.out.println("N khong phai la so nguyen to");
    }
}
