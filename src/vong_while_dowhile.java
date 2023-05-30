import java.util.Scanner;

public class vong_while_dowhile {
    public static void main(String[] args) {
    /*   Vòng lặp while sẽ lặp lại một khối code cụ thể cho đến khi điều kiện nhất định được thỏa mãn (biểu thức kiểm tra trở thành false).
        Vòng lặp while thường được sử dụng nếu bạn không biết trước số lần lặp, ví dụ:


        Tiếp tục hiển thị thêm các bài viết khi người dùng còn lăn chuột trên newsfeed.
        Tiếp tục đếm thời gian (đồng hồ tính giờ) khi người dùng chưa bấm dừng lại.*/

/*        Cú pháp:
        while (biểu thức điều kiện) {

        }
        while là từ khóa
        bieuThucDieuKien là biểu thức điều kiện trả về giá trị boolean (true hay false)*/

//        int tong = 0;
//        int i = 100;
//
//        while (i != 0) {
//            tong += i;
//            --i;
//        }
//        System.out.println(tong);


        //Vong lap do-while
/*
        Vòng lặp do while trong Java cũng lặp lại một khối code cụ thể cho đến khi thỏa mãn điều kiện nào đó.
        Vòng lặp do while hoạt động tương tự như vòng lặp while.
        Tuy nhiên, điểm khác biệt là vòng lặp do while sẽ thực hiện khối code ít nhất 1 lần, cho dù điều kiện đúng hay sai.
        Nghĩa là, lần lặp đầu tiên, khối code sẽ được thực thi, sau đó mới kiểm tra điều kiện.
*/
        /*Cu phap:
        do {

        }while ();
        Trong do:
        do, while là từ khóa
        bieuThucDieuKien là biểu thức điều kiện boolean trả về giá trị true hoặc false.*/

        Double so = 0.0;
        Double tong = 0.0;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Nhap vao 1 so: ");
            so = sc.nextDouble();
            tong += so;

        } while (so != 0.0);
        System.out.println(tong);
    }
}
