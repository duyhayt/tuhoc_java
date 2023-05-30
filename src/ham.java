import java.util.Scanner;

public class ham {
    public static void main(String[] args) {
//        int kq = cong(1, 5);
//        System.out.println(kq);
//        Scanner sc = new Scanner(System.in);
//        String gioiTinh = sc.nextLine();
//        hamThuTuc(gioiTinh);
        String ketQua1 = timNghiem(1, 2, 3);
        String ketQua2 = timNghiem(1, 2, 1);
        String ketQua3 = timNghiem(1, 2, -3);
        System.out.println(ketQua1);
        System.out.println(ketQua2);
        System.out.println(ketQua3);
    }

//    public static int cong(int x, int y) {
//        return x + y;
//    }
//
//    ;
//
//    //ham thu tuc: khog co kieu tra ve
//    public static void hamThuTuc(String xx) {
//
//        if (xx.equals("nu")) {
//            System.out.println("gioi tinh nu");
//        } else {
//            System.out.println("gioi tinh nam");
//        }
//    }

    /*   Viết chương trình giải pt bậc 2 dùng hàm
               Tìm nghiệm: a=1;b=2;c=3
   */
    public static String timNghiem(int a, int b, int c) {
        if (a == 0) {
            if (b == 0 && c == 0) {
                return "Phuong trinh vo so nghiem";
            } else if (b == 0 && c != 0) {
                return "Phuong trinh vo nghiem";
            } else {
                return "Phuong trinh co nghiem: " + (-c / b);
            }
        } else {
            //giai pt bac 2
            double delta = (b * b) - (4 * a * c);
            if (delta < 0) {
                return "Phuong trinh bac 2 vo nghiem";
            } else if (
                    delta == 0
            ) {
                double x = -b / (2 * a);
                return "Phuong trinh bac 2 co nghiem kep : " + x;
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                return "Phuong trinh bac 2 co 2 nghiem phan biet x1: " + x1 + "; x2= " + x2;
            }

        }
    }
}
