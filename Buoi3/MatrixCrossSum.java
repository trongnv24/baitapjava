import java.util.Scanner;

public class MatrixCrossSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập kích thước ma trận vuông (n x n): ");
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];
        System.out.println("Nhập các phần tử của ma trận theo hàng:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        int tongCheoChinh = 0;
        int tongCheoPhu = 0;
        for (int i = 0; i < n; i++) {
            tongCheoChinh += matrix[i][i];
            tongCheoPhu += matrix[i][n - i - 1];
        }
        System.out.println("Tổng của đường chéo chính là: " + tongCheoChinh);
        System.out.println("Tổng của đường chéo phụ là: " + tongCheoPhu);
        System.out.println("Tổng cuối cùng của hai đường chéo là: " + (tongCheoChinh + tongCheoPhu));

        scanner.close();
    }
    }