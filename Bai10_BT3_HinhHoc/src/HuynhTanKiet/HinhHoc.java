package HuynhTanKiet;

abstract class HinhHoc {
	protected String mauSac;
 
	public HinhHoc(String mauSac) {
		this.mauSac = mauSac;
	}
 
	public String getMauSac() {
		return mauSac;
	}
 
	public void setMauSac(String mauSac) {
		this.mauSac = mauSac;
	}
 
	public abstract double tinhDienTich();
	public abstract double tinhChuVi();
 
	public abstract void phongTo(double tyLe);
 
	public void hienThiThongTin() {
		System.out.println("Màu sắc: " + mauSac);
		System.out.println("Diện tích: " + tinhDienTich());
		System.out.println("Chu vi: " + tinhChuVi());
	}
}
