import java.util.Scanner;

public class switch_case {
    public static void main(String[] args) {

//        char phepTinh;
//        Double so1, so2, ketQua;
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Chon phep tinh(+ ; - ; * ; /)");
//        phepTinh = sc.next().charAt(0);
//        System.out.println("Nhap so 1 va so 2");
//        so1 = sc.nextDouble();
//        so2 = sc.nextDouble();
//
//        switch (phepTinh) {
//            case '+':
//                ketQua = so1 + so2;
//                System.out.println(so1 + "+" + so2 + "=" + ketQua);
//                break;
//            case '-':
//                ketQua = so1 - so2;
//                System.out.println(so1 + "-" + so2 + "=" + ketQua);
//                break;
//            case '/':
//                ketQua = so1/so2;
//                System.out.println(so1 + "/" +so2+ "=" + ketQua);
//                break;
//            default:
//                System.out.println("K hop le");
//                break;
//        }

        Scanner sc = new Scanner(System.in);

        int tuoi;
        System.out.println("Nhap so tuoi");
        tuoi = sc.nextInt();

        switch (tuoi) {
            case 3:
                System.out.println("mam non");
                break;
            case 7:
                System.out.println("Tieu hooc");
                break;
            case 12:
                System.out.println("THCS");
                break;
            case 17:
                System.out.println("THPT");
                break;
            default:
                System.out.println("K hop le");
        }


    }
}
