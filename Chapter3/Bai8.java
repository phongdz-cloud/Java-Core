import java.util.Scanner;

public class Bai8 {
    /*
     * Nhập một số bất kỳ. Hãy viết bằng chữ giá trị của số nguyên đó nếu có giá trị
     * từ 0 đến 9, ngược lại thông báo không biết viết
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] numbers = { "Khong", "Mot", "Hai", "Ba", "Bon", "Nam", "Sau", "Bay", "Tam", "Chin" };
        int number = scanner.nextInt();
        output(numbers, number);
    }

    static void output(String[] numbers, int number) {
        if (number >= 0 && number <= 9) {
            System.out.println(numbers[number]);
        } else
            System.out.println("Khong biet viet");
    }
}
