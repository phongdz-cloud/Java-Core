import java.util.Scanner;
//Nhập một số thực a. Xuất ra số nguyên lớn nhất nhưng nhỏ hơn a.
//Ví dụ: a = 3.2 thì xuất 3. a=5 thì xuất 4).
public class Bai10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float a = scanner.nextFloat();
        System.out.println(solution(a));
    }
    static int solution(float a) {
        if (a - (int) a > 0)
            return (int) a; // Ep ngầm về kiểu int;

        return (int) a - 1;
    }

}
