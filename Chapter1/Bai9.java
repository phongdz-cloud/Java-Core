import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float a = scanner.nextFloat();
        System.out.println(solution(a));
    }

    static float solution(float a) {
        if (a < 0 && (a + (int) a * (-1) >= -0.5))
            return (int) a + 1;
        if (a - (int) a >= 0.5)
            return (int) a + 1;
        return a;
    }
}
