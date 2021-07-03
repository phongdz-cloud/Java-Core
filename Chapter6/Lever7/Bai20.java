public class Bai20 {
    /*
     * Kiểm tra mảng một chiều các số thực có đối xứng hay không
     */
    static class Param {
        public int n;
    }

    static Param param = new Param();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        param.n = scanner.nextInt();
        float[] A;
        boolean result;
        A = new float[param.n];
        input(A);
        result = solution(A);
        output(result);
    }

    static void input(float[] A) {
        for (int i = 0; i < A.length; i++) {
            A[i] = scanner.nextFloat();
        }
    }

    static boolean solution(float A[]) {
        int i = 0;
        int j = A.length - 1;
        while (j > i) {
            if (A[i++] != A[j--])
                return false;
        }
        return true;
    }

    static void output(Boolean result) {
        if (result)
            System.out.print("Mang so thuc doi xung");
        else
            System.out.print("Mang so thuc khong doi xung");
    }

}
