import java.util.Scanner;

public class PointExchangeSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập điểm số (từ 0 đến 100): ");
        int diem = scanner.nextInt();
        char diemChu;
        if (diem >= 0 && diem <= 100) {
            switch (diem ) {
                case 9:
                    diemChu = 'A';
                    break;
                case 8:
                    diemChu = 'B';
                    break;
                case 7:
                    diemChu = 'C';
                    break;
                case 6:
                    diemChu = 'D';
                    break;
                default:
                    diemChu = 'F';
                    break;
            }

            System.out.println("Điểm chữ tương ứng là: " + diemChu);
        } else {
            System.out.println("Điểm không hợp lệ.");
        }

        scanner.close();
    }
}
