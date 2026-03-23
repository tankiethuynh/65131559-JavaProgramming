package HuynhTanKiet;

public class HinhHoc {
	private String ten;
	private String mauSac;
	public HinhHoc(String ten, String mauSac) {
		super();
		this.ten = ten;
		this.mauSac = mauSac;
	}
	
	public HinhHoc() {
		super();
	}

	public String getTen() {
		return ten;
	}
	
	public void setTen(String ten) {
		this.ten = ten;
	}
	
	public String getMauSac() {
		return mauSac;
	}
	
	public void setMauSac(String mauSac) {
		this.mauSac = mauSac;
	}
	
	public double tinhDienTich() {
		return 0;
	}
	
	public double tinhChuVi() {
		return 0;
	}
	
	public void hienThiThongTin() {
		System.out.println("Ten hinh: " + ten);
		System.out.println("Mau sac: " + mauSac);
		System.out.println("Dien tich hinh: " + tinhDienTich());
		System.out.println("Ten hinh: " + tinhChuVi());
	}
}
