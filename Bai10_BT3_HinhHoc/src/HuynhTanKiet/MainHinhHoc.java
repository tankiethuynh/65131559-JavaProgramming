package HuynhTanKiet;

public class MainHinhHoc {

	public static void main(String[] args) {
		HinhTron ht = new HinhTron("Vàng", 0, 0, 5);
        HinhVuong hv = new HinhVuong("Đỏ", 10, 10, 4);
        HinhTamGiac htg = new HinhTamGiac("Xanh", 4, 5, 6, 6, 0);

        System.out.println("Thông tin hình tròn: ");
        ht.hienThiThongTin();
        ht.phongTo(3);
        System.out.println("Thông tin hình vuông: ");
        hv.hienThiThongTin();
        hv.quay(90);
        System.out.println("Thông tin hình tam giác: ");
        htg.hienThiThongTin();
        htg.diChuyen(3, 2);
	}
}
