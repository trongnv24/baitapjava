import java.util.Scanner;

public class CheckTheString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập chuỗi str1: ");
        String str1 = scanner.nextLine();

        System.out.print("Nhập chuỗi str2: ");
        String str2 = scanner.nextLine();

        if (str1.contains(str2)) {
            str1 = str1.replaceAll(str2, str2 + str2);
            System.out.println("Chuỗi str1 sau khi nhân đôi chuỗi con str2: " + str1);
        } else {
            System.out.println("Chuỗi str1 không chứa chuỗi str2.");
        }

        scanner.close();
    }
    }
