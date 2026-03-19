package HuynhTanKiet_65131559;

public class NhanVien {
	private String maNV;
	private String hoTen;
	private double luongCoBan;
	public NhanVien(String maNV, String hoTen, double luongCoBan) {
		super();
		this.maNV = maNV;
		this.hoTen = hoTen;
		this.luongCoBan = luongCoBan;
	}
	
	public NhanVien() {
		super();
	}
	
	public String getMaNV() {
		return maNV;
	}

	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public double getLuongCoBan() {
		return luongCoBan;
	}

	public void setLuongCoBan(double luongCoBan) {
		this.luongCoBan = luongCoBan;
	}

	public double tinhLuong() {
		return luongCoBan;
	}

	@Override
	public String toString() {
		return "NhanVien [maNV = " + maNV + ", hoTen = " + hoTen + ", luongCoBan = " + luongCoBan + "]";
	}
	
	public void hienThiThongTin() {
		System.out.println("Mã NV: " + maNV);
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Lương cơ bản: " + luongCoBan);
	}
}

