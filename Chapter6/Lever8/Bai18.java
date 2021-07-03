package Chapter6.Lever8;

public class Bai18 {
      /*
     * Cho 2 mảng A,B mỗi mãng có n phần tử. Thực hiện việc trộn xen kẽ 1 phần tử
     * mảng A tới phần tử mảng B để tạo ra mảng C
     */
    static class Param {
        public int n;
    }

    static Param param = new Param();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        param.n = scanner.nextInt();
        int[] A;
        int[] B;
        int[] C;
        A = new int[param.n];
        B = new int[param.n];
        C = new int[2 * param.n];
        input(A);
        input(B);
        mergeArray(A, B, C);
        output(C);
    }

    static void input(int[] A) {
        for (int i = 0; i < A.length; i++) {
            A[i] = scanner.nextInt();
        }
    }

    static void mergeArray(int A[], int B[], int C[]) {
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            C[count++] = A[i];
            C[count++] = B[i];
        }
    }

    static void output(int[] C) {
        for (int i = 0; i < C.length; i++) {
            System.out.print(C[i] + " ");
        }
    }
}
