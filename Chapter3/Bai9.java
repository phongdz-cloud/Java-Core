import java.util.Scanner;

public class Bai9 {
    //Nhập 3 số nguyên a,b,c đôi một khác nhau. Tìm số có giá trị nhỏ nhì
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int secondNumber;
        secondNumber = solution(a, b, c);
        output(secondNumber);
    }
    static int findMax(int a , int b , int c)
    {
        int max = a;
        if (max < b)
            max = b;
        if (max < c)
            max = c;
        return max;
    }
    static int solution(int a, int b, int c)
    {
        int secondNumber = a;
        int maxNumber = findMax(a, b, c);
        if ((secondNumber < b && b != maxNumber) || (secondNumber > b && secondNumber == maxNumber))
            secondNumber = b;
        if ((secondNumber < c && c != maxNumber) || (secondNumber > c && secondNumber == maxNumber))
            secondNumber = c;
        return secondNumber;
    }
    static void output(int result)
    {
        System.out.println(result);
    }
}
