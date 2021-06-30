import java.util.Scanner;

public class Bai7 {

    // Nhập vào số nguyên a,b,c. Tìm nghiệm phương trình ax^2 + bx +c =0
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        output(a, b, c);

    }

    static void output(int a, int b, int c) {
        float delta = b * b - 4 * a * c;
        if (delta < 0) {
            System.out.println("Phuong trinh vo nghiem");
        } else {
            if (delta > 0) {
                delta = (float) Math.sqrt(delta);
                System.out.println("Phuong trinh co 2 nghiem phan biet\n" + "x1: " + ((-b * 1.0 + delta) / (2 * a))
                        + "\n" + "x2: " + ((-b * 1.0 - delta) / (2 * a)));
            } else {
                System.out.println("Phuong trinh co nghiem kep x: " + (-(b * 1.0) / (2 * a)));
            }
        }
    }

}
