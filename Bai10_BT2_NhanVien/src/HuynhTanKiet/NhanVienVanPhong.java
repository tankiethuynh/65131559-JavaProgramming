package HuynhTanKiet;

public class NhanVienVanPhong extends NhanVien implements CoTheTinhLuong{
	private int soNgayCong;

	public NhanVienVanPhong(String maNV, String tenNV, double luongCoBan, int soNgayCong) {
		super(maNV, tenNV, luongCoBan);
		this.soNgayCong = soNgayCong;
	}

	@Override
	public double tinhLuong() {
		return luongCoBan * (soNgayCong / 22.0);
	}

	@Override
	public double tinhThuong() {
		return (soNgayCong > 20) ? 500000 : 0;
	}
}
