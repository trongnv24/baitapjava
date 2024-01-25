import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int soBiMat = random.nextInt(100) + 1;
        int soLanDoan = 0;
        boolean daDoanDung = false;
        System.out.println("Chào mừng bạn đến với trò chơi 'Đoán Số'! Số được chọn là từ 1 đến 100.");
        while (!daDoanDung) {
            System.out.print("Hãy đoán số: ");
            int doanSo = scanner.nextInt();
            soLanDoan++;
            if (doanSo == soBiMat) {
                daDoanDung = true;
                System.out.println("Chúc mừng! Bạn đã đoán đúng số " + soBiMat + " sau " + soLanDoan + " lần đoán.");
            } else if (doanSo < soBiMat) {
                System.out.println("Số bạn đoán quá thấp. Hãy thử lại!");
            } else {
                System.out.println("Số bạn đoán quá cao. Hãy thử lại!");
            }
        }
        scanner.close();
    }
    }
