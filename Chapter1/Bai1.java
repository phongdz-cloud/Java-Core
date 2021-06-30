
import java.util.Scanner;
public class Bai1 {
    // Nhập một số nguyên a,b. Xuất ra tổng 2 số nguyên vừa nhập

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println(solution(x, y));
    }
  
    public static int solution(Integer a , Integer b)
    {
        return a+b;
    }
}
