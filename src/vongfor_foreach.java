public class vongfor_foreach {
    public static void main(String[] args) {

        /// Vong for
//        int tong = 10;
//
//        for (int i = 1; i <= 100; i++) {
//            tong += i;
//        }
//        System.out.println(tong);

        /// For each: Dung de lap  qua cac phan tu cua mot mang

        char[] mangKyTu = {'a', 'b', 'c', 'd', 'e'};

        for (char kyTu : mangKyTu
        ) {
            System.out.println(kyTu);
        }
        /*
        Cú pháp:
        for(data_type item: collection) {

        }
        data_type:  là kiểu dữ liệu của item
        item:  là tên đại diện cho từng phần tử trong collection (bạn có thể đặt tùy ý)
        collection:  là tập hợp hoặc tên của mảng bạn đang muốn lặp qua nó
         */
//        Vi du:
        int[] mangSoNguyen = {1,2,3,4,5,6,7,8,9};

        int tong = 0;

        for (int soNguyen: mangSoNguyen
             ) {
            tong += soNguyen;
        }
        System.out.println(tong);
    }
}
