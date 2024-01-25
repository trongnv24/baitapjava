import java.util.Scanner;

public class CalculateFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số để tính giai thừa: ");
        int so = scanner.nextInt();
        int giaiThua = 1;

        if (so >= 0) {
            for (int i = 1; i <= so; i++) {
                giaiThua *= i;
            }
            System.out.println("Giai thừa của " + so + " là: " + giaiThua);
        } else {
            System.out.println("Không thể tính giai thừa của số âm.");
        }
        scanner.close();
    }
}
