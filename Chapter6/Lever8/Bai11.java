import java.util.Scanner;

public class Bai11 {
    /*
     * Tìm "giá trị chẵn nhỏ nhất" trong mảng một các số nguyên. Nếu mảng không có
     * giá trị chẵn thì trả về giá trị không chẵn là -1;
     */
    static class Param {
        public int n;
    }

    static Param param = new Param();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        param.n = scanner.nextInt();
        int[] A;
        int result;
        A = new int[param.n];
        input(A);
        result = solution(A);
        output(result);
    }

    static void input(int[] A) {
        for (int i = 0; i < A.length; i++) {
            A[i] = scanner.nextInt();
        }
    }

    static int solution(int A[]) {
        int minEvenNumber = Integer.MAX_VALUE;
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0 && A[i] < minEvenNumber)
                minEvenNumber = A[i];
        }
        return minEvenNumber != Integer.MAX_VALUE ? minEvenNumber : -1;
    }

    static void output(int result) {
        System.out.println(result);
    }
}
