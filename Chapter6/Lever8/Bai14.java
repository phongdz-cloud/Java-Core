import java.util.Scanner;

public class Bai14 {
    /*
     * Hãy liệt kê các số trong mảng 1 chiều các số thực thuộc đoạn [x,y] cho trước
     */
    static class Param {
        public int n;
        public int nB;
        public int x;
        public int y;
    }

    static Param param = new Param();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        param.n = scanner.nextInt();
        float[] A;
        float[] B;
        boolean flag;
        A = new float[param.n];
        input(A, param);
        B = new float[Math.abs(param.x - param.y) + 1];
        flag = solution(A, B, param);
        output(B, flag, param);
    }

    static void input(float A[], Param param) {
        for (int i = 0; i < A.length; i++) {
            A[i] = scanner.nextFloat();
        }
        param.x = scanner.nextInt();
        param.y = scanner.nextInt();
    }

    static boolean checkValid(Param param) {
        if (param.x >= param.n || param.x >= param.y)
            return false;
        return true;
    }

    static boolean solution(float A[], float B[], Param param) {
        if (checkValid(param)) {
            param.nB = 0;
            int i;
            i = param.x;
            while (i < param.n) {
                B[param.nB++] = A[i++];
                if (i > param.y)
                    break;
            }
            return true;
        }
        return false;
    }

    static void output(float[] B, boolean flag, Param param) {
        if (flag == true) {
            for (int i = 0; i < param.nB; i++) {
                System.out.print(B[i] + " ");
            }
        } else
            System.out.print("Dau vao khong hop le");
    }
}
