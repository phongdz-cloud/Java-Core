import java.util.Scanner;

public class Bai6 {
    /*
     * Viết chương trình tìm và đổi chỗ phần tử lớn nhất và phần tử nhỏ nhất trong
     * mảng
     */
    static class Param {
        public int n;
    }

    static Param param = new Param();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        param.n = scanner.nextInt();
        int[] A;
        A = new int[param.n];
        input(A);
        solution(A);
        output(A);
    }

    static void input(int[] A) {
        for (int i = 0; i < A.length; i++) {
            A[i] = scanner.nextInt();
        }
    }

    static void swap(int A[], int i, int j) {
        int temp;
        temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

    static void solution(int A[]) {
        int min, max, indexMin, indexMax;
        indexMin = indexMax = 0;
        min = max = A[0];
        for (int i = 0; i < A.length; i++) {
            if (A[i] < min) {
                min = A[i];
                indexMin = i;
            }
            if (A[i] > max) {
                max = A[i];
                indexMax = i;
            }
        }
        swap(A, indexMin, indexMax);
    }

    static void output(int A[]) {
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
    }
}
