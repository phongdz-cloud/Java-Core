import java.util.Scanner;
public class Bai7 {
     // Kiểm tra các chữ số n có tăng dần hay không
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        boolean flag;
        flag = findAscendingNumber(n);
        output(flag);
    }

    static boolean findAscendingNumber(int n) {
        int temp;
        temp = n % 10;
        while (n > 0) {
            n /= 10;
            if (temp < n % 10)
                return false;
            temp = n % 10;
        }
        return true;
    }

    static void output(Boolean flag) {
        if (flag == true)
            System.out.println("Cac chu so tang dan");
        else
            System.out.println("Cac chu so khong tang dan");
    }
}
