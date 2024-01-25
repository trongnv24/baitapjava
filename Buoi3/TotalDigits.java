import java.util.Scanner;

public class TotalDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên: ");
        int soNguyen = scanner.nextInt();
        int soDu, tong = 0;

        while (soNguyen != 0) {
            soDu = soNguyen % 10;
            tong += soDu;
            soNguyen /= 10;
        }
        System.out.println("Tổng các chữ số của số nguyên là: " + tong);
        scanner.close();
    }
    }
