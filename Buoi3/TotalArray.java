public class TotalArray {
    public static void main(String[] args) {
        int[] mang = {2,5,8,98,34};
        int tong = 1;
        for (int i = 1; i < mang.length; i++){
            tong +=mang[i];

        }
        System.out.println("Tổng các phần tử trong mảng là:"+tong);
    }
}
