import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số : ");
        int so = scanner.nextInt();
        int i = 1;
        System.out.println("Bảng nhân của " + so + " là:");
        do {
            int tich = so * i;
            System.out.println(so + " x " + i + " = " + tich);
            i++;
        } while (i <= 10);
        scanner.close();
    }
}
