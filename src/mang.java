public class mang {
    /* Cu phap
             data_type[] arrayName;
     Trong do:
     data_type: có thể là 1 kiểu dữ liệu(char, int, double, byte..) hoặc 1 đối tượng
             arrayName: là tên mảng do mình định nghĩa*/
    public static void main(String[] args) {
//        int[] diem = new int[10];// Mảng đã định nghĩa có thể chứa 10 phần tử
////       hoặc
//        diem = new int[10];
//
//
//        int[] soNguyen = {1,2,3,5,6,7};
//
//        System.out.println(soNguyen[2]);
//        for (int i =0; i <= 5; i++){
//            System.out.println("Phan tu o vi tri " + i + " là: "+ soNguyen[i]);
//        }
//
        //Mang da chieu

        int[][] mangDaChieu = new int[2][4];

        System.out.println(mangDaChieu[0][3]);

        int[][] mang2Chieu = {
                {2,3,4},
                {5,6,7},
                {8}
        };
    }
}
