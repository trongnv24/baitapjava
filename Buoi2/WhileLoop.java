public class WhileLoop {
    public static void main(String[] args) {
        int i = 1;
        int tong = 0;

        while (i <= 50) {
            if (i % 2 == 0) {
                tong += i;
            }
            i++;
        }
        System.out.println("Tổng các số chẵn từ 1 đến 50 là: " + tong);
    }
}
