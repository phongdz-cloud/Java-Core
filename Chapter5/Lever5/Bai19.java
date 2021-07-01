import java.util.Scanner;

public class Bai19 {
    /*
     * Nhập vào 2 bộ ngày, tháng, năm. Tính khoảng cách (số ngày) giữa hai ngày vừa
     * nhập
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        int d, m, y, d1, m1, y1, result;
        d = scanner.nextInt();
        m = scanner.nextInt();
        y = scanner.nextInt();
        d1 = scanner.nextInt();
        m1 = scanner.nextInt();
        y1 = scanner.nextInt();
        result = solution(days, d, m, y, d1, m1, y1);
        output(result);

    }

    static void output(int result) {
        if (result != -1)
            System.out.println(result);
        else
            System.out.println("Ngay thang nam khong hop le!");

    }

    static int solution(int days[], int d, int m, int y, int d1, int m1, int y1) {
        if (checkValid(days, d, m, y) && checkValid(days, d1, m1, y1)) {
            if (m == m1 && y == y1)
                return Math.abs(d - d1);
            else {
                int result;
                if (y < y1 || (m < m1 && y == y1))
                    result = calculator(days, d, m, y, d1, m1, y1);
                else
                    result = calculator(days, d1, m1, y1, d, m, y);
                return result;
            }
        }
        return -1;
    }

    static int calculator(int days[], int d, int m, int y, int d1, int m1, int y1) {
        if (checkLeapYear(y))
            days[1]++;
        int sum;
        sum = days[m - 1] - d;
        while (y != y1 || m < m1 - 1) {
            m++;
            if (m == 13) {
                m = 1;
                y++;
                if (checkLeapYear(y))
                    days[1]++;
                else
                    days[1] = 28;
            }
            sum += days[m - 1];
        }
        sum += d1;
        return sum;
    }

    static boolean checkValid(int days[], int d, int m, int y) {
        if (y > 0 && m >= 1 && m <= 12 && d >= 1 && d <= 31) {
            if (checkLeapYear(y) && m == 2 && d <= 29) // năm nhuận
                return true;
            if (d > days[m - 1])
                return false;
            return true;
        }
        return false;
    }

    static boolean checkLeapYear(int y) {
        // Năm nhuận chia hết cho 400
        if (y % 400 == 0)
            return true;
        // Năm nhuận chia hết cho 4 nhưng không chia hết cho 100
        if (y % 4 == 0 && y % 100 != 0)
            return true;
        return false;
    }
}
