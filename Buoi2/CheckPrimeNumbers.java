import java.util.Scanner;

public class CheckPrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một số: ");
        int so = scanner.nextInt();
        boolean laNguyenTo = true;

        if (so <= 1) {
            laNguyenTo = false;
        } else {
            int i = 2;
            while (i <= so / 2) {
                if (so % i == 0) {
                    laNguyenTo = false;
                    break;
                }
                i++;
            }
        }
        if (laNguyenTo) {
            System.out.println(so + " là số nguyên tố.");
        } else {
            System.out.println(so + " không phải là số nguyên tố.");
        }
        scanner.close();
    }
}
