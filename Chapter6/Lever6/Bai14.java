import java.util.Scanner;

public class Bai14 {
    /*
     * Nhập vào một mảng số nguyên. Nhập tiếp một số nguyên x. Cho biết vị trí cuối
     * cùng(tính từ đầu mảng) mà x có trong mảng vừa nhập. Nếu không có x thì xuất
     * -1
     */
    static class Param {
        public int n;
    }

    static Param param = new Param();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        param.n = scanner.nextInt();
        float[] A;
        A = new float[param.n];
        input(A);
        float result;
        result = solution(A);
        output(result);
    }

    static void input(float[] A) {
        for (int i = 0; i < A.length; i++) {
            A[i] = scanner.nextFloat();
        }
    }

    static float solution(float A[]) {
        for (int i = 0; i < A.length; i++) {
            if (A[i] < 0)
                return A[i];
        }
        return 1;
    }

    static void output(float result) {
        System.out.println(result);
    }
}
