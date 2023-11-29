public class FinalPosition {
    public static void main(String[] args) {
        String chuoi = "Xin chào, đây là ví dụ về vị trí cuối cùng của ký tự x.";

        char kyTuCanTim = 'x';
        int viTriCuoiCung = -1;
        for (int i = chuoi.length() - 1; i >= 0; i--) {
            if (chuoi.charAt(i) == kyTuCanTim) {
                viTriCuoiCung = i;
                break;
            }
        }
        if (viTriCuoiCung != -1) {
            System.out.println("Vị trí cuối cùng của ký tự '" + kyTuCanTim + "' là: " + viTriCuoiCung);
        } else {
            System.out.println("Ký tự '" + kyTuCanTim + "' không xuất hiện trong chuỗi.");
        }
    }
}
