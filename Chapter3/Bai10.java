import java.util.Scanner;

public class Bai10 {
    /*
     * Nhập vào giờ, phút, giây. Cho biết một giây sau đó là mấy giờ, mấy phút, mấy
     * giây
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int m = scanner.nextInt();
        int s = scanner.nextInt();
        boolean flag;
        flag = checkTime(h, m, s);
        output(h, m, s, flag);
    }

    static boolean checkTime(int h, int m, int s) {
        if (h >= 0 && s >= 0 && m >= 0) {
            if (h < 24 && m < 60 && s < 60) {
                return true;
            }
        }
        return false;
    }

    static void output(int h, int m, int s, Boolean flag) {
        if (flag == false) {
            System.out.println("Gio phut giay khong hop le");
        } else {
            if (s == 59) {
                s = 0;
                if (m == 59) {
                    m = 0;
                    if (h == 23) {
                        h = 0;
                    } else
                        h++;
                } else
                    m++;
            } else
                s++;
                System.out.println(h + " " + m + " " + s);
        }
    }
}
