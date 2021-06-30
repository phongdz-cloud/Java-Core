import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Fibonacci(n);
    }

    static void Fibonacci(int n) {
        int f1, f2;
        f1 = f2 = 1;
        for (int i = 0; i < n; i++) {
            if (i == 0)
                System.out.print(0 + " ");
            else if (i == 1 || i == 2)
                System.out.print(1 + " ");
            else {
                int temp = f2;
                f2 += f1;
                f1 = temp;
                System.out.print(f2 + " ");
            }
        }
    }
}
