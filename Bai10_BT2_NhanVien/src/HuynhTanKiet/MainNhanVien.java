package HuynhTanKiet;

public class MainNhanVien {
	public static void main (String[] args) {
		NhanVien nv1 = new NhanVienVanPhong("VP001", "HTK", 7000000, 25);
		NhanVien nv2 = new NhanVienKinhDoanh("KD001", "VNTN", 10000000, 500000000);
		NhanVien ql = new QuanLy("QL001", "TQS", 20000000, 5000000);

		nv1.hienThiThongTin();
		nv2.hienThiThongTin();
		ql.hienThiThongTin();
	}
}
