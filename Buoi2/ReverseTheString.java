import java.util.Scanner;

public class ReverseTheString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi cần đảo ngược: ");
        String chuoi = scanner.nextLine();
        String chuoiDaoNguoc = "";
        int doDai = chuoi.length();
        int i = doDai - 1;
        do {
            chuoiDaoNguoc += chuoi.charAt(i);
            i--;
        } while (i >= 0);

        System.out.println("Chuỗi đảo ngược là: " + chuoiDaoNguoc);
        scanner.close();
    }
}
