import java.util.Scanner;
//Nhập vào chiều dài và chiều rộng (số thực) một hình chữ nhật, xuất ra chu vi của hình chữ nhật
//đó (lấy hai chũ số lẻ)
public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float width = scanner.nextFloat();
        float height = scanner.nextFloat();
        System.out.printf("%.2f", solution(width, height));
    }

    static float solution(float width, float height) {
        if (width <= 0 || height <= 0)
            return -1;
        return (width + height) * 2;
    }
}
