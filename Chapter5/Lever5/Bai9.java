import java.util.Scanner;

public class Bai9 {
    // Nhập vào 4 số nguyên a, b, c, d. Tính a/b + c/d. Yêu cầu xuất ra dạng phân số
    // tối giản.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        output(a, b, c, d);

    }

    static void output(int a, int b, int c, int d) {

        if (b == 0 || d == 0)
            System.out.println("Khong chia duoc!");
        else {
            int numerator;
            int demoninator;
            int gcf;
            numerator = a * d + c * b;
            demoninator = b * d;
            gcf = gcd(numerator, demoninator);
            numerator /= gcf;
            demoninator /= gcf;
            System.out.println(numerator + "/" + demoninator);
        }
    }

    static int gcd(int a, int b) {
        int gcd = 1;
        while (a != b) {
            if (a > b)
                a -= b;
            if (a < b)
                b -= a;
            gcd = a;
        }
        return gcd;
    }

}
