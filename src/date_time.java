import java.util.Calendar;

/*
 * Lưu ý: Tháng trong này sẽ bị chậm hơn 1 tháng so với thực tế
 * */

public class date_time {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        //Lay ngay thang nam
        int nam = calendar.get(Calendar.YEAR);
        int thang = calendar.get(Calendar.MONTH);
        int ngay = calendar.get(Calendar.DAY_OF_MONTH);
        int gio = calendar.get(Calendar.HOUR);
        int phut = calendar.get(Calendar.MINUTE);

        System.out.println(nam);
        System.out.println(thang);
        System.out.println(ngay);
        System.out.println(gio);
        System.out.println(phut);

        //Set ngay thang nam theo y muon
        calendar.set(Calendar.YEAR, 1999);
        calendar.set(Calendar.MONTH, 3);
        calendar.set(Calendar.DAY_OF_MONTH, 6);
        calendar.set(Calendar.HOUR, 23);
        //Kiem tra sau thiet lap
        int namSinh = calendar.get(Calendar.YEAR);
        int thangSinh = calendar.get(Calendar.MONTH);
        int ngaySinh = calendar.get(Calendar.DAY_OF_MONTH);
        int gioSinh = calendar.get(Calendar.HOUR);
        int phutSinh = calendar.get(Calendar.MINUTE);

        System.out.println(namSinh);
        System.out.println(thangSinh);
        System.out.println(ngaySinh);
        System.out.println(gioSinh);
        System.out.println(phutSinh);
    }
}
