import java.util.Scanner;

public class CalculateTheYahyayana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số nguyên n: ");
        int n = scanner.nextInt();

        int giaiThua = 1;

        for (int i = 1; i <= n; i++) {
            giaiThua *= i;
        }
        System.out.println("Giai thừa của " + n + " là: " + giaiThua);
        scanner.close();
    }
}
