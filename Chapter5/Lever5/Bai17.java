import java.util.Scanner;

public class Bai17 {
    /*
     * Nhập vào ngày, tháng, năm. Hỏi từ ngày vừa nhập là ngày thứ bao nhiêu trong
     * năm? (Tính khoảng cách từ ngày đầu năm đến ngày vừa nhập)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        int d, m, y, result;
        boolean flag;
        d = scanner.nextInt();
        m = scanner.nextInt();
        y = scanner.nextInt();
        flag = checkValid(days, d, m, y);
        result = solution(days, d, m, flag);
        output(result);
    }

    static void output(int result) {
        if (result != -1)
            System.out.println(result);
        else
            System.out.println("Ngay thang nam khong hop le!");
    }

    static int solution(int days[], int d, int m, boolean flag) {
        if (flag == true) {
            int count = 0;
            int i = 1;
            while (i <= 12) {
                if (i == m) {
                    count += d;
                    break;
                }
                count += days[i - 1];
                i++;
            }
            return count;
        }
        return -1;
    }

    static boolean checkValid(int days[], int d, int m, int y) {
        if (y > 0 && m >= 1 && m <= 12 && d >= 1 && d <= 31) {
            if (checkLeapYear(y)) // năm nhuận
            {
                days[1]++;
            }
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
