import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result;
        result = solution(n);
        output(result);
    }
    static int solution(int n)
    {
        int sum =0;
        for(int i =1 ; i<=n ;i++)
        {
            sum+=i*i;
        }
        return sum;
    }
    static void output(int result)
    {
        System.out.println(result);
    }
}
