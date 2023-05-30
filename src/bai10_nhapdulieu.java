import java.util.Scanner;

public class bai10_nhapdulieu {
    public static void main(String[] args) {
        //Khởi tạo đối tương scanner
        Scanner sc = new Scanner(System.in);

        //cho phep nhap chuooi
        System.out.println("Nhap mk: ");

        String mk1 = sc.nextLine();

        System.out.println("mk la: " + mk1);

        //Nhap vao so nguyen
        System.out.println("Nhap vao so nguyen: ");
        int soNguyen = sc.nextInt();
        System.out.println("So nguyen la: " + soNguyen);

        //Nhap vao float
        System.out.println("Nhap vao float: ");
        float bienFloat = sc.nextFloat();
        System.out.println("gia tri float: " + bienFloat);
    }

}
