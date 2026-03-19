package HuynhTanKiet_65131559;

public class TestNhanVien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NhanVien nv = new NhanVien("001", "Huỳnh Tấn Kiệt", 2000000);
		System.out.println(nv.toString());
		
		NhanVienVanPhong nv2 = new NhanVienVanPhong("002", "Nguyễn Thị Khánh Ngọc", 3000000, 3, 200000);
//		System.out.print(nv2.toString());
		nv2.hienThiThongTin();
		
		QuanLy ql1 = new QuanLy("003", "Huỳnh Thị Kim Thoa", 10000000, 500000, 1.2);
		ql1.hienThiThongTin();
		ql1.hopBanGiamDoc();
		
		NhanVienKinhDoanh nv3 = new NhanVienKinhDoanh("004", "Trương Thị Phụng", 2500000, 20000000, 5);
		nv3.hienThiThongTin();
		nv3.chamSocKhachHang();
	}
}
