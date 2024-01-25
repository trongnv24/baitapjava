import java.util.Scanner;

public class DayFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập giới hạn của dãy Fibonacci: ");
        int gioiHan = scanner.nextInt();
        int soTruoc = 0, soHienTai = 1;
        System.out.println("Dãy Fibonacci:");
        for (int i = 1; i <= gioiHan; ++i) {
            System.out.print(soTruoc + " ");
            int tong = soTruoc + soHienTai;
            soTruoc = soHienTai;
            soHienTai = tong;
        }
        scanner.close();
    }
}
