import java.util.Scanner;
//Nhập vào số nguyên n, xuất ra giá trị tuyệt đối của n
public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(solution(n));
    }
    static int solution(int n)
    {
        return Math.abs(n);
    }
}
