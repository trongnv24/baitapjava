import java.util.Scanner;

public class CountNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một số nguyên: ");
        int soNguyen = scanner.nextInt();
        int soChuSo = 0;
        int so = Math.abs(soNguyen);
        if (so == 0) {
            soChuSo = 1;
        } else {
            while (so > 0) {
                soChuSo++;
                so /= 10;
            }
        }
        System.out.println("Số chữ số trong số " + soNguyen + " là: " + soChuSo);
        scanner.close();
    }
}
