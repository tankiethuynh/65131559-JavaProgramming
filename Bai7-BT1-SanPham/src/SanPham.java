
public class SanPham {
	private String maSP, tenSP;
	private double gia;
	private int soLuong;
	
	public SanPham() {
		this.maSP = "null";
		this.tenSP = "null";
		this.gia = 0;
		this.soLuong = 0;
	}
	
	public SanPham(String maSP, String tenSP, int gia, int soLuong) {
		this.maSP = maSP;
		this.tenSP = tenSP;
		this.gia = gia;
		this.soLuong = soLuong;
	}
	
	public String getmaSP() {
		return maSP;
	}
	
	public String gettenSP() {
		return tenSP;
	}
	
	public double getgia() {
		return gia;
	}
	
	public int getsoLuong() {
		return soLuong;
	}
	
	public void setmaSP(String maSP) {
		if (maSP != null && !maSP.trim().isEmpty())
			this.maSP = maSP;
		else 
			System.out.println("Ma san pham khong duoc de trong!"); 
	}
	
	public void settenSP(String tenSP) {
		this.tenSP = tenSP;
	}
	
	public void setgia(double gia) {
		if (gia > 0)
			this.gia = gia;
		else 
			System.out.println("Gia san pham phai lon hon 0!"); 
	}
	
	public void setsoLuong(int soLuong) {
		if (soLuong >= 0)
			this.soLuong = soLuong;
		else 
			System.out.println("So luong san pham toi thieu la 0!"); 
	}
	
	public double tinhThanhTien() {
		return gia * soLuong;
	}
	
	public void hienThiThongTin() {
		System.out.println("Ma san pham: " + maSP);
		System.out.println("Ten san pham: " + tenSP);
		System.out.println("Gia niem yet: " + gia); 
		System.out.println("So luong: " + soLuong);
		System.out.println("Thanh tien: " + tinhThanhTien()); 
	}
	
}
