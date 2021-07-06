import java.util.Scanner;


public class Bai11 {
    /*
     * Hãy cho biết tất cả phần tử trong mảng a có nằm trong mảng b hay không
     */

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int A[], B[];
        int nA, nB;
        boolean result;
        nA = scanner.nextInt();
        A = input(nA);
        nB = scanner.nextInt();
        B = input(nB);
        result = solution(A, B);
        output(result);
    }

    static int[] input(int nA) {
        int A[];
        A = new int[nA];
        for (int i = 0; i < A.length; i++) {
            A[i] = scanner.nextInt();
        }
        return A;
    }

    static boolean solution(int A[], int B[]) {
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                if (A[i] == B[j]) {
                    count++;
                    break;
                }
            }
        }
        return count == A.length;
    }

    static void output(Boolean result) {
        if (result)
            System.out.println("Tat ca phan tu mang a nam trong mang b");
        else
            System.out.println("Tat ca phan tu mang a khong nam trong b");
    }
}
