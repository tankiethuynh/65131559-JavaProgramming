package HuynhTanKiet;

public class MainThietBiDienTu {
	public static void main(String[] args) {
        DienThoaiThongMinh dt = new DienThoaiThongMinh("Galaxy S24", 22000000, "Samsung");
        Laptop lt = new Laptop("MacBook M3", 32000000, "Apple");

        dt.hienThiThongTin();
        dt.bat();
        dt.ketNoiWifi();
        dt.vuot();

        lt.hienThiThongTin();
        lt.bat();
        lt.ketNoiWifi();
    }
}
