public class CountWords {
    public static void main(String[] args) {
        String chuoi = "  lap trinh java  ";
        chuoi = chuoi.trim();

        int demTu = 0;
        boolean dangTrongTu = false;
        for (int i = 0; i < chuoi.length(); i++) {
            char kyTu = chuoi.charAt(i);

            if (!Character.isWhitespace(kyTu) && !dangTrongTu) {
                demTu++;
                dangTrongTu = true;
            } else if (Character.isWhitespace(kyTu)) {
                dangTrongTu = false;
            }
        }

        System.out.println("Số từ trong chuỗi là: " + demTu);
    }
}
