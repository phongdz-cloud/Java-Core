public class Bai10 {
    /// Tìm và in lên màn hình tất cả các số nguyên trong phạm vi từ 10 tới 99 sao
    /// cho tích cửa 2 chữ số
    // bằng 2 lần tổng của 2 chữ số đó
    public static void main(String[] args) {
        output();

    }

    static boolean calculate(int i) {
        int temp = i;
        int a, b;
        a = temp % 10;
        temp /= 10;
        b = temp % 10;
        temp /= 10;
        if ((a * b) == 2 * (a + b))
            return true;
        return false;
    }

    static void output() {
        for (int i = 10; i <= 99; i++) {
            if (calculate(i))
                System.out.print(i + " ");
        }
    }

}
