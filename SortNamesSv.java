import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortNamesSv {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng sinh viên: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Đọc bỏ dòng trống
        ArrayList<String> danhSachSV = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập tên sinh viên " + (i + 1) + ": ");
            String tenSV = scanner.nextLine();
            danhSachSV.add(tenSV);
        }
        Collections.sort(danhSachSV);
        System.out.println("Danh sách tên sinh viên sau khi sắp xếp:");
        for (String ten : danhSachSV) {
            System.out.println(ten);
        }
        scanner.close();
    }
}
