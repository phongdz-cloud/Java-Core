import java.util.Scanner;

public class Bai8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char c = scanner.next().charAt(0);
        solution(c);
    }

    static void solution(char c) {
        if (c >= 'A' && c <= 'z') {
            if (c >= 'A' && c <= 'Z')
                c += 32;
            else
                c -= 32;
            System.out.println(c);
            return;
        }
        System.out.println("Khong phai ki tu chu cai!");
    }
}
