import java.util.Scanner;
public class Bai2 {
     /*
     * Nhập vào mảng các số thực. Tính tổng các phần tử trong mảng
     */
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        int n = scanner.nextInt();
        float[] A;
        float result;
        A = new float[n];
        input(A);
        result = solution(A);
        output(result);
    }
    static void input(float[] A)
    {
        for(int i =0 ;i<A.length;i++)
        {
            A[i] = scanner.nextFloat();
        }
    }
    static float solution(float []A)
    {
        float sum=0;
        for(int i =0 ; i<A.length;i++)
        {
            sum+=A[i];
        }
        return sum;
    }
    static void output(float result)
    {
        System.out.println(result);
    }
}
