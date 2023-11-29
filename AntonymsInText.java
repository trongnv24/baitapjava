import java.util.Scanner;

public class AntonymsInText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập đoạn văn: ");
        String doanVan = scanner.nextLine();
        String[] cacTu = doanVan.split("\\s+");
        StringBuilder ketQua = new StringBuilder();
        for (int i = cacTu.length - 1; i >= 0; i--) {
            ketQua.append(cacTu[i]).append(" ");
        System.out.println("Đoạn văn sau khi đảo từ: ");
        System.out.println(ketQua.toString().trim());

        scanner.close();
    }
}
}
