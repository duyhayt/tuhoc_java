package TinhChuViHCN;

import java.util.Scanner;

public class XuLy {

    //Constructor
    public XuLy() {

    }

    public static void main(String[] args) {
        //Khởi tạo đối tượng
        /*HinhChuNhat hcn = new HinhChuNhat();
        Scanner scan = new Scanner(System.in);
        hcn.nhap(scan);*/

        HinhChuNhat hcn = new HinhChuNhat();

        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap chieu dai: ");
        float cDai = scan.nextFloat();
        System.out.println("Nhap chieu rong: ");
        float cRong = scan.nextFloat();

        hcn.setChieuDai(cDai);
        hcn.setChieuRong(cRong);


        hcn.tinhChuVi();
        hcn.tinhDienTich();
        hcn.xuat();
    }
}
