import java.util.Scanner;

public class ApostolicNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên n: ");
        int n = scanner.nextInt();
        int tong = 0;

        for (int i = 1; i <= n; i++) {
            tong += i;
        }
        System.out.println("Tổng các số từ 1 đến " + n + " là: " + tong);

        scanner.close();
    }
    }
