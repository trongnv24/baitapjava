import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountNumberOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String chuoi = scanner.nextLine();
        Map<Character, Integer> demKyTu = new HashMap<>();
        for (char kyTu : chuoi.toCharArray()) {
            if (Character.isLetterOrDigit(kyTu)) {
                demKyTu.put(kyTu, demKyTu.getOrDefault(kyTu, 0) + 1);
            }
        }
        System.out.println("Số lần xuất hiện của từng ký tự trong chuỗi:");
        for (Map.Entry<Character, Integer> entry : demKyTu.entrySet()) {
            System.out.println("'" + entry.getKey() + "': " + entry.getValue() + " lần");
        }
        scanner.close();
    }
}
