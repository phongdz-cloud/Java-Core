import java.util.Scanner;

public class Bai2 {
    /*
     * Kiểm tra mảng số nguyên có tồn tại 2 giá trị 0 liên tiếp hay không?
     */
    static class Param {
        public int n;
    }

    static Param param = new Param();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        param.n = scanner.nextInt();
        int[] A;
        boolean result;
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

    static boolean solution(int A[]) {

        for (int i = 0; i < A.length - 1; i++) {
            if (A[i] == 0 && A[i + 1] == 0)
                return true;
        }
        return false;
    }

    static void output(Boolean result) {
        if (result)
            System.out.print("Mang ton tai 2 gia tri 0 lien tiep");
        else
            System.out.print("Mang khong ton tai 2 gia tri 0 lien tiep");
    }

}
