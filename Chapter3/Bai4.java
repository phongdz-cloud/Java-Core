import java.util.Scanner;

public class Bai4 {
    // Nhập vào tháng và năm. Cho biết tháng đó có bao nhiêu ngày
    /*
     * Tháng 1: 31 Tháng 2 : 28 hoặc 29 Tháng 3: 31 Tháng 4: 30 Tháng 5: 31 Tháng 6:
     * 30 Tháng 7: 31 Tháng 8: 31 Tháng 9: 30 Tháng 10: 31 Tháng 11: 30 Tháng 12: 31
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] days = { 29, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        int m = scanner.nextInt();
        int y = scanner.nextInt();
        boolean flag;
        flag = checkLeapYear(y);
        int result;
        result = solution(days, m, flag);
        output(result);

    }

    static void output(int result) {
        System.out.println(result);
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

    static int solution(int days[], int m, Boolean flag) {
        if (m == 2 && flag == true)
            return days[0];
        return days[m];
    }
}
