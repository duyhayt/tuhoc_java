package TinhChuViHCN;

import java.util.Scanner;

public class HinhChuNhat {
    //1. Các thuôc tính
    private float chieuDai;
    private float chieuRong;
    private float chuVi;
    private float dienTich;

    //2. Các phương thức get, set
    /*
     * get: đưa cho bên ngoài xài (cho phép truy xuất)
     * set: cho phép truyền dữ liệu từ bên ngoài vào
     * */
    public float getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(float cDai) {
        this.chieuDai = cDai;
    }

    public float getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(float cRong) {
        this.chieuRong = cRong;
    }

    public float getChuVi() {
        return chuVi;
    }

    public float getDienTich() {
        return dienTich;
    }

    //3. Các phương thức khởi tạo
    public HinhChuNhat() {

    }

    public HinhChuNhat(float cDai, float cRong) {
        this.chieuDai = cDai;
        this.chieuRong = cRong;
    }

    //4. Các phương thức nhập xuất
//    Scanner scan = new Scanner(System.in);

    public void nhap(Scanner scan) {
        System.out.println("Nhap chieu Dai: ");
        this.chieuDai = Float.parseFloat(scan.nextLine());

        System.out.println("Nhap chieu Rong: ");
        this.chieuRong = Float.parseFloat(scan.nextLine());
    }

    public void xuat() {
        System.out.println("HCN (" + chieuDai + "," + chieuRong + " ). Dien tich: " + dienTich + "\t Chu vi: " + chuVi);
    }

    //5. Các phương thức xử lý nghiệp vụ liên quan đến lớp này
    public void tinhChuVi() {
        this.chuVi = (chieuDai + chieuRong) * 2;
    }

    public void tinhDienTich() {
        this.dienTich = chieuDai * chieuRong;
    }

    public static void main(String[] args) {

    }
}
