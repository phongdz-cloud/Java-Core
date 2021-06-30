import java.util.Scanner;
public class Bai3 {
    // Nhập số nguyên dương n. Tính S= 1/1 + 1/2 + 1/3 + 1/n
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        float result;
        result = solution(n);
        output(result);
    }
    static float solution(int n)
    {
        float sum =0;
        for(int i =1 ; i<=n ;i++)
        {
            sum+=(1.0)/i;
        }
        return sum;
    }
    static void output(float result)
    {
        System.out.println(result);
    }
}
