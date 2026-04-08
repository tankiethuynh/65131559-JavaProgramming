package HuynhTanKiet;

public class QuanLy extends NhanVien implements CoTheTinhLuong, CoTheXepLoai{
	private double luongTrachNhiem;

	public QuanLy(String maNV, String tenNV, double luongCoBan, double luongTrachNhiem) {
		super(maNV, tenNV, luongCoBan);
		this.luongTrachNhiem = luongTrachNhiem;
	}

	@Override
	public String xepLoai() {
		return "Lãnh đạo";
	}

	@Override
	public double tinhLuong() {
		return this.luongCoBan * luongTrachNhiem;
	}

	@Override
	public double tinhThuong() {
		return this.luongCoBan * 2;
	}

	@Override
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("Xếp loại: " + xepLoai());
	}
}
