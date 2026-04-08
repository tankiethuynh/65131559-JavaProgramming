package HuynhTanKiet;

public abstract class NhanVien {
	protected String maNV;
	protected String tenNV;
	protected double luongCoBan;
	
	public NhanVien(String maNV, String tenNV, double luongCoBan) {
		this.maNV = maNV;
		this.tenNV = tenNV;
		this.luongCoBan = luongCoBan;
	}
	
	public String getMaNV() {
		return maNV;
	}
	
	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}
	
	public String getTenNV() {
		return tenNV;
	}
	
	public void setTenNV(String tenNV) {
		this.tenNV = tenNV;
	}
	
	public double getLuongCoBan() {
		return luongCoBan;
	}
	
	public void setLuongCoBan(double luongCoBan) {
		this.luongCoBan = luongCoBan;
	}
	
	public abstract double tinhThuong();
	
	public void hienThiThongTin() {
		System.out.println("Mã nhân viên : " + maNV);
		System.out.println("Tên nhân viên : " + tenNV);
		System.out.println("Lương cơ bản : " + luongCoBan);
		System.out.println("Lương tính thưởng : " + tinhThuong());
	}
}
