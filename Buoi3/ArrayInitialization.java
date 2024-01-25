public class ArrayInitialization {
    public static void main(String[] args) {
        int[] mang = new int[3];
        for (int i = 0; i < 3; i++) {
            mang[i] = i + 1;
        }
        System.out.println("Mảng:");
        for (int i = 0; i < 3; i++) {
            System.out.print(mang[i] + " ");
        }
    }
    }

