import java.util.Scanner;

public class Bai1 {
    //Nhập vào 2 số nguyên a, b. Xuất ra thương của 2 số nguyên (trường hợp b = 0 thì báo không chia được)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        float result;
        boolean flag;
        flag = solution(a, b);
        result = calculator(a, b,flag);
        output(result,flag);
    }
    static boolean solution(int a , int b)
    {
        if(b == 0) return false;
        return true;
    }
    static float calculator(int a , int b , Boolean flag)
    {
        if(flag == true)
            return (float)a/b;
        return -1;
    }
    static void output(float result , boolean flag)
    {
        if(flag == true) System.out.println(result);
        else System.out.println("Khong chia duoc!");
    }
}
