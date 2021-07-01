import java.util.Scanner;

public class Bai16 {
    /*
     * Có một máy ATM với số lượng tiền có trong máy là vô hạn. Máy có bốn loại tiền
     * là 100.000VNĐ, 50.000VNĐ, 20.000VNĐ và 10.000VNĐ Một khách hàng cần rút số
     * tiền là n (n chia hết cho 10.000), hãy tìm ra phương án đưa tiền cho khách
     * hàng sao cho số tờ tiền là ít nhất. Gỉa sử số lượng các tờ tiền của mỗi loại
     * tiền là vô hạn
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result;
        boolean flag;
        flag = checkValid(n);
        result = solution(n, flag);
        output(result);
    }

    static void output(int result) {
        if (result != -1)
            System.out.println(result);
        else
            System.out.println("Khong tinh duoc!");
    }

    static int solution(int n, boolean flag) {

        if (flag == true) {
            int count = 0;
            while (n > 0) {
                if (n >= 100000)
                    n -= 100000;
                else if (n >= 50000)
                    n -= 50000;
                else if (n >= 20000)
                    n -= 20000;
                else if (n >= 10000)
                    n -= 10000;
                count++;
            }
            return count;
        }
        return -1;
    }

    static boolean checkValid(int n) {

        if (n % 10000 == 0)
            return true;
        return false;
    }
}
