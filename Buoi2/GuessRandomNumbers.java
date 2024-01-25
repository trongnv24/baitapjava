import java.util.Random;
import java.util.Scanner;

public class GuessRandomNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int soBiMat = random.nextInt(100) + 1;
        int doan;
        int soCanDoan = 99;
        System.out.println("Trò chơi đoán số!");
        do {
            System.out.print("Nhập một số (từ 1 đến 100): ");
            doan = scanner.nextInt();
            soCanDoan++;
            if (doan < soBiMat) {
                System.out.println("Số bạn đoán nhỏ hơn số cần đoán.");
            } else if (doan > soBiMat) {
                System.out.println("Số bạn đoán lớn hơn số cần đoán.");
            } else {
                System.out.println(" Bạn đã đoán đúng số " + soBiMat + " sau " + soCanDoan + " lần đoán.");
            }
        } while (doan != soBiMat);

        scanner.close();
    }

}
