import java.util.Scanner;

public class InvertedArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử của mảng: ");
        int n = scanner.nextInt();
        int[] mang = new int[n];
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            mang[i] = scanner.nextInt();
        }
        System.out.println("Mảng trước khi đảo ngược:");
        for (int i = 0; i < n; i++) {
            System.out.print(mang[i] + " ");
        }
        for (int i = 0; i < n / 2; i++) {
            int temp = mang[i];
            mang[i] = mang[n - i - 1];
            mang[n - i - 1] = temp;
        }
        System.out.println("\nMảng sau khi đảo ngược:");
        for (int i = 0; i < n; i++) {
            System.out.print(mang[i] + " ");
        }

        scanner.close();
    }
    }

