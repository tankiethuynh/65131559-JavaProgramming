package HuynhTanKiet;

public class NhanVienKinhDoanh extends NhanVien implements CoTheTinhLuong, CoTheXepLoai{
	private double doanhSo;

	public NhanVienKinhDoanh(String maNV, String tenNV, double luongCoBan, double doanhSo) {
		super(maNV, tenNV, luongCoBan);
		this.doanhSo = doanhSo;
	}

	@Override
	public String xepLoai() {
		if (doanhSo > 100000000) return "Xuất Sắc";
		return "Tốt";
	}

	@Override
	public double tinhLuong() {
		return this.luongCoBan * (doanhSo * 0.1);
	}

	@Override
	public double tinhThuong() {
		return doanhSo * 0.5;
	}

	@Override
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("Xếp loại: " + xepLoai());
	}
	
}
