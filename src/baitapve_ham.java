import java.util.Scanner;

public class baitapve_ham {
    public static void main(String[] args) {
        /*
         * Viết chuwongtrinh nhập vào từ bàn phím 2 số a, b
         * Dùng func
         * 1. Nếu nhập dấu + thì in ra kq: a + b;
         * 1. Nếu nhập dấu - thì in ra kq: a - b;
         * 1. Nếu nhập dấu * thì in ra kq: a * b;
         * 1. Nếu nhập dấu / thì in ra kq: a / b;
         * */
        String ketQua = phepTinh();
        System.out.println(ketQua);
    }


    public static String phepTinh() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao a: ");
        double a = sc.nextDouble();
        System.out.println("Nhap vao b: ");
        double b = sc.nextDouble();
        System.out.println("Nhap phep tinh: ");
        Scanner scanner = new Scanner(System.in); //Khai bao bien scanner rieng neu khong se bi loi
        String toanTu = scanner.nextLine();

        switch (toanTu) {
            case "+":
                return "Tong 2 so la: " + (a + b);
            case "-":
                return "Hieu 2 so la: " + (a - b);
            case "*":
                return "Tich 2 so la: " + (a * b);
            case "/":
                return "Thuong 2 so la: " + (a / b);
            default:
                return "Nhap khong hop le";
        }
    }

}
