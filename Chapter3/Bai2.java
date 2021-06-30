import java.util.Scanner;

public class Bai2 {
    // Nhập vào 2 số nguyên a,b. Tìm nghiệm của phương trình ax+b=0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        boolean flag;
        flag = solution(a);
        output(a, b, flag);
    }

    static boolean solution(int a) {
        if (a == 0)
            return false;
        return true;
    }

    static void output(int a, int b, boolean flag) {
        if (flag == false) {
            if (b == 0)
                System.out.println("Phuong trinh vo so nghiem!");
            if (b != 0)
                System.out.println("Phuong trinh vo nghiem!");
        } else
            System.out.println((float) b * (-1) / a);
    }
}
