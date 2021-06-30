import java.util.Scanner;

public class Bai9 {
     // Tìm ước chung lớn nhất của 2 số nguyên dương a và b nhập từ bàn phím
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int result;
        result = solution(a,b);
        output(result);
    }

    static int solution(int a,int b) {
        int gcd = 1;
        while (a != b)
        {
            if (a > b)
                a -= b;
            if (a < b)
                b -= a;
            gcd = a;
        }
        return gcd;
    }

    static void output(int result) {
        System.out.println(result);
    }
}
