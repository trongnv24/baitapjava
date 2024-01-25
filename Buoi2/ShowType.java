import java.util.Scanner;

public class ShowType {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chọn loại hình (1: hình tròn, 2: hình vuông, 3: tam giác):");
        int luaChon = scanner.nextInt();
        switch (luaChon) {
            case 1:
                System.out.println("Hình tròn");
                break;
            case 2:
                System.out.println("Hình vuông");
                break;
            case 3:
                System.out.println("Hình tam giác");
                break;
            default:
                System.out.println(" không hợp lệ");
                break;
        }
        scanner.close();
    }
}
