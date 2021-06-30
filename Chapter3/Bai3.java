import java.util.Scanner;

public class Bai3 {
    //Nhập vào 3 số nguyên a,b,c. Tim số có giá trị nhỏ nhất (min)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int result;
        result = solution(a, b, c);
        output(result);
    }
    static int solution(int a, int b , int c)
    {
        int min = a;
        if(min > b) min = b;
        if (min > c) min = c;
        return min;
    }
    static void output(int result)
    {
        System.out.println(result);
    }
}
