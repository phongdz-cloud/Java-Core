import java.util.Scanner;

public class Bai7 {
    /*
     * Viết chương trình xuất ra n phần tử đầu tiên của dãy Fibonancci
     */
    public static class Fibo {
        public int f1;
        public int f2;

    }

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int n = scanner.nextInt();
        int[] A;
        Fibo fibo = new Fibo();
        fibo.f1 = fibo.f2 = 1;
        A = new int[n];
        solution(A, fibo);
        output(A);
    }

    static int fibonanci(int i, Fibo fibo) {
        if (i == 0)
            return 0;
        if (i == 1 || i == 2)
            return 1;
        int temp = fibo.f2;
        fibo.f2 += fibo.f1;
        fibo.f1 = temp;
        return fibo.f2;
    }

    static void solution(int[] A, Fibo fibo) {
        for (int i = 0; i < A.length; i++) {
            A[i] = fibonanci(i, fibo);
        }
    }

    static void output(int[] A) {
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
    }
}
