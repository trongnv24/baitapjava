public class DayOfTheWeek {
    public static void main(String[] args) {
        int soNgay = 5;
        String ngayTrongTuan;
        switch (soNgay) {
            case 1:
                ngayTrongTuan = "Chủ nhật";
                break;
            case 2:
                ngayTrongTuan = "Thứ Hai";
                break;
            case 3:
                ngayTrongTuan = "Thứ Ba";
                break;
            case 4:
                ngayTrongTuan = "Thứ Tư";
                break;
            case 5:
                ngayTrongTuan = "Thứ Năm";
                break;
            case 6:
                ngayTrongTuan = "Thứ Sáu";
                break;
            case 7:
                ngayTrongTuan = "Thứ Bảy";
                break;
            default:
                ngayTrongTuan = "Không phải ngày trong tuần";
                break;
        }
        System.out.println("Ngày trong tuần là: " + ngayTrongTuan);
    }
}
