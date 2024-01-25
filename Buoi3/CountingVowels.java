public class CountingVowels {
    public static void main(String[] args) {
        String vanBan = "Chuỗi văn bản mẫu để đếm số nguyên âm";
        int demNguyenAm = 0;
        vanBan = vanBan.toLowerCase();
        for (int i = 0; i < vanBan.length(); ++i) {
            char kiTu = vanBan.charAt(i);
            if (kiTu == 'a' || kiTu == 'e' || kiTu == 'i' || kiTu == 'o' || kiTu == 'u') {
                demNguyenAm++;
            }
        }
        System.out.println("Số nguyên âm trong chuỗi văn bản là: " + demNguyenAm);
    }
    }
