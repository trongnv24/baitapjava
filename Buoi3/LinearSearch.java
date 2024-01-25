public class LinearSearch {
    public static void main(String[] args) {
        int[] mang = {10, 5, 7, 3, 12, 8};
        int soCanTim = 12;
        int viTri = -1;
        for (int i = 0; i < mang.length; i++) {
            if (mang[i] == soCanTim) {
                viTri = i;
                break;
            }
        }
        if (viTri != -1) {
            System.out.println("Số nguyên " + soCanTim + " được tìm thấy tại chỉ mục " + viTri);
        } else {
            System.out.println("Không tìm thấy số nguyên " + soCanTim + " trong mảng.");
        }
    }
    }

