import java.util.Scanner;

public class ReverseNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số cần đảo ngược: ");
        int so = scanner.nextInt();
        int soDaoNguoc = 0;
        while (so != 0) {
            int chuSo = so % 10;
            soDaoNguoc = soDaoNguoc * 10 + chuSo;
            so /= 10;
        }
        System.out.println("Số đảo ngược là: " + soDaoNguoc);
        scanner.close();
    }
}
