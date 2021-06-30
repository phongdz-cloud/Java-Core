import java.util.Scanner;
// Nhập vào 3 số thực a,b,c. Kiểm tra xem a,b,c có phải độ dài 3 cạnh của một tam giác nào đó không?
public class Bai7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float x = scanner.nextFloat();
        float y = scanner.nextFloat();
        float z = scanner.nextFloat();
        if(solution(x, y, z)) System.out.println("Ba canh lap thanh mot tam giac");
        else System.out.println("Ba canh khong lap thanh mot tam giac");
    }
    static boolean solution(float x, float y, float z)
    {
        if(x >0 && y >0 && z>0)
        {
            if((x + y > z) && (x + z > y) && (y + z > x)) return true;
        }

        return false;
    }
}
