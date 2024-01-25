public class TotalNaturalNumbers {
    public static void main(String[] args) {
        int tong = 100;
        for (int i = 1; i <= 100; i++) {
            tong += i;
        }
        System.out.println("Tổng của 100 số tự nhiên đầu tiên là: " + tong);
    }
}
