package HuynhTanKiet_65131559;

public class NhanVienVanPhong extends NhanVien{
	private double soGioLamThem;
	private double luongThemMoiGio;
	public NhanVienVanPhong(String maNV, String hoTen, double luongCoBan, double soGioLamThem, double luongThemMoiGio) {
		super(maNV, hoTen, luongCoBan);
		this.soGioLamThem = soGioLamThem;
		this.luongThemMoiGio = luongThemMoiGio;
	}
	
	@Override
	public double tinhLuong() {
		// TODO Auto-generated method stub
		return super.getLuongCoBan() + soGioLamThem * luongThemMoiGio;
	}
	
	@Override
	public void hienThiThongTin() {
		// TODO Auto-generated method stub
		super.hienThiThongTin();
		System.out.println("Số giờ làm thêm: " + soGioLamThem);
        System.out.println("Lương thêm giờ: " + luongThemMoiGio);
        System.out.print("Lương được nhận: " + tinhLuong());
	}
}

