import java.util.Scanner;
public class Bai1 {
    // Nhập vào số nguyên n. Cho biết n có phải là số chính phương hay không?
    // VD: 4,9,16
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        boolean flag;
        flag = checkSquareNumber(n);
        output(flag);
    }

    static boolean checkSquareNumber(int n) {
        int temp = (int) Math.sqrt(n);
        if (temp * temp == n)
            return true;
        return false;
    }

    static void output(boolean flag) {
        if (flag == true)
            System.out.println("N la so chinh phuong");
        else
            System.out.println("N khong phai la so chinh phuong");
    }

}
