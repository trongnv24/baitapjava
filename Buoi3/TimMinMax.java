public class TimMinMax {
    public static void main(String[] args) {
        int[] mang = {9,24,12,02,55,99};

        if (mang.length > 0) {
            int min = mang[0];
            int max = mang[0];
            for (int i = 1; i < mang.length; i++) {
                if (mang[i] < min) {
                    min = mang[i];
                }
                if (mang[i] > max) {
                    max = mang[i];
                }
            }
            System.out.println("Giá trị tối thiểu : " + min);
            System.out.println("Giá trị tối đa g là: " + max);
        } else {
            System.out.println(" rỗng.");
        }
    }
    }

