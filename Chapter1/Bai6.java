import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int m = scanner.nextInt();
        int s = scanner.nextInt();
        if (solution(h, m, s))
            System.out.println("Hop le");
        else
            System.out.println("Khong hop le");

    }

    static boolean solution(int h, int m, int s) {
        if (h >= 0 && m >= 0 && s >= 0) {
            if (h < 24 && m < 60 && s < 60) {
                return true;
            }
        }
        return false;
    }
}
