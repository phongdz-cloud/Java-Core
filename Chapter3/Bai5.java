import java.util.Scanner;

public class Bai5 {
    //Nhập vào 4 số thực a,b,c,d. Tìm số có giá trị lớn nhất
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int result;
        result = solution(a, b, c, d);
        output(result);
    }
    static int solution(int a , int b ,int c ,int d)
    {
        int max = a;
        if (max < b)
            max = b;
        if (max < c)
            max = c;
        if (max < d)
            max = d;
        return max;
    }
    static void output(int result)
    {
        System.out.println(result);
    }
}
