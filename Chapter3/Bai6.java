import java.util.Scanner;

public class Bai6 {
    // Nhập vào 3 số thực. Cho biết 3 số vừa nhập có phải là độ dài cạnh của 1 tam
    // giác nào đó hay không, nếu phải thì
    // thì cho biết đó là loại tam giác gì? (Đều, vuông cân, vuông, cân, thường)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float a = scanner.nextFloat();
        float b = scanner.nextFloat();
        float c = scanner.nextFloat();
        boolean flag;
        flag = checkTriangle(a, b, c);
        output(a, b, c, flag);
    }

    static boolean checkTriangle(float x, float y, float z) {
        if (x > 0 && y > 0 && z > 0) {
            if ((x + y > z) && (x + z > y) && (y + z > x))
                return true;
        }
        return false;
    }

    static void output(float a, float b, float c, boolean flag) {
        if (flag == false) {
            System.out.println("Ba canh vua nhap khong tao thanh mot tam giac!");
        } else {
            if (a == b && b == c)
                System.out.println("Tam giac deu");
            else if ((b * b + c * c - a * a < 0.0001) || (a * a + c * c - b * b < 0.0001)
                    || (a * a + b * b - c * c < 0.0001)) {
                if (a == b || a == c || b == c)
                    System.out.println("Tam giac vuong can");
                else
                    System.out.println("Tam giac vuong");
            } else if (a == b || a == c || b == c)
                System.out.println("Tam giac can");
            else
                System.out.println("Tam giac thuong");
        }
    }
}
