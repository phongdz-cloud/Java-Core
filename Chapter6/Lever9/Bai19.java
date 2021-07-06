import java.util.Scanner;

public class Bai19 {
    /*
     * Cho mảng A gồm có n phần tử. Viết chương trình tìm số lớn thứ hai trong mảng.
     * lưu ý, chỉ duyệt mảng một lần
     */

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int A[];
        int n,result;
        n = scanner.nextInt();
        A = input(n);
        result = findMaxSecondArray(A);
        output(result);
    }

    static int[] input(int n) {
        int A[];
        A = new int[n];
        for (int i = 0; i < A.length; i++) {
            A[i] = scanner.nextInt();
        }
        return A;
    }

    static int findMaxSecondArray(int A[]) {
        int max, maxSecond, temp;
        max = A[0];
        maxSecond = Integer.MIN_VALUE;
        for (int i = 0; i < A.length; i++) {
            if (A[i] > max) {
                temp = max;
                max = A[i];
                maxSecond = temp;
            }
            if (A[i] > maxSecond && A[i] < max)
                maxSecond = A[i];
        }
        return maxSecond != Integer.MIN_VALUE ? maxSecond : -1;
    }

    static void output(int result) {
        if (result != -1)
            System.out.println(result);
        else
            System.out.println("Khong co so lon nhi trong mang!");
    }
}
