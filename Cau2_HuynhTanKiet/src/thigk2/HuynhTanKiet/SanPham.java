package thigk2.HuynhTanKiet;

public class SanPham {
	private String maSP;
	private String tenSP;
	private String loaiSP;
	private double giaBan; // Thuộc tính thứ 4

	    // Constructor đầy đủ tham số
	public SanPham(String maSP, String tenSP, String loaiSP, double giaBan) {
		this.maSP = maSP;
		this.tenSP = tenSP;
		this.loaiSP = loaiSP;
		this.giaBan = giaBan;
	 }

	    // Getter và Setter
	 public String getMaSP() { return maSP; }
	 public void setMaSP(String maSP) { this.maSP = maSP; }

	 public String getTenSP() { return tenSP; }
	 public void setTenSP(String tenSP) { this.tenSP = tenSP; }

	 public String getLoaiSP() { return loaiSP; }
	 public void setLoaiSP(String loaiSP) { this.loaiSP = loaiSP; }

	 public double getGiaBan() { return giaBan; }
	 public void setGiaBan(double giaBan) { this.giaBan = giaBan; }

	 // Ghi đè toString để in thông tin nhanh
	 @Override
	 public String toString() {
	     return String.format("Mã: %s | Tên: %-15s | Loại: %-20s | Giá: %,.0f VNĐ", 
	                          maSP, tenSP, loaiSP, giaBan);
	 }
}
