import java.util.Scanner;

public class Bai4 {
    //Nhập 2 số nguyên a, b. Xuất ra số lớn nhất
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(solution(a, b));
    }
    static int solution(int a , int b)
    {
        if(a>b) return a;
        else if(a<b)return b;
        else return a;
    }
}
