import java.util.Scanner;

public class CountCharactersInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng chuỗi trong mảng: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] mangChuoi = new String[n];
        System.out.println("Nhập các chuỗi:");
        for (int i = 0; i < n; i++) {
            mangChuoi[i] = scanner.nextLine();
        }
        System.out.print("Nhập ký tự cần đếm số lần xuất hiện: ");
        char kyTu = scanner.next().charAt(0);

        int dem = 0;
        for (String chuoi : mangChuoi) {
            for (int i = 0; i < chuoi.length(); i++) {
                if (chuoi.charAt(i) == kyTu) {
                    dem++;
                }
            }
        }
        System.out.println("Số lần xuất hiện của ký tự '" + kyTu + "' trong các chuỗi là: " + dem);

        scanner.close();
    }
    }
