import java.util.Scanner;

public class Bai10 {
    /*
     * Hãy liệt kê các giá trị trong mảng 1 chiều có số nguyên có chữ số đầu là số
     * chẵn
     */
    static class Param {
        public int n;
        public int nB;
    }

    static Param param = new Param();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        param.n = scanner.nextInt();
        int[] A, B;
        A = new int[param.n];
        B = new int[param.n];
        input(A);
        solution(A, B, param);
        output(B, param);

    }

    static void input(int[] A) {
        for (int i = 0; i < A.length; i++) {
            A[i] = scanner.nextInt();
        }
    }

    static boolean findEvenNumber(int n) {
        while (n > 10)
            n /= 10;
        return n % 2 == 0 ? true : false;
    }

    static void solution(int A[], int B[], Param param) {
        param.nB = 0;
        for (int i = 0; i < A.length; i++) {
            if (findEvenNumber(A[i]) && A[i] != 0) {
                B[param.nB++] = A[i];
            }
        }
    }

    static void output(int B[], Param pram) {
        for (int i = 0; i < pram.nB; i++) {
            System.out.print(B[i] + " ");
        }

    }
}
