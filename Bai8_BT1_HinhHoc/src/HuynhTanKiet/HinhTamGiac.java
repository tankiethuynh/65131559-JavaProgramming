package HuynhTanKiet;

public class HinhTamGiac extends HinhHoc{
	private double canhA;
	private double canhB;
	private double canhC;
	public HinhTamGiac(String ten, String mauSac, double canhA, double canhB, double canhC) {
		super(ten, mauSac);
		this.canhA = canhA;
		this.canhB = canhB;
		this.canhC = canhC;
	}
	@Override
	public double tinhDienTich() {
		// TODO Auto-generated method stub
		double s = (canhA + canhB + canhC) / 2;
		return super.tinhDienTich() + Math.sqrt(s * (s - canhA) * (s - canhB) * (s - canhC));
	}
	@Override
	public double tinhChuVi() {
		// TODO Auto-generated method stub
		return super.tinhChuVi() + canhA + canhB + canhC;
	}
	@Override
	public void hienThiThongTin() {
		// TODO Auto-generated method stub
		super.hienThiThongTin();
	}
	
	
}
