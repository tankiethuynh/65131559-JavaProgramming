package HuynhTanKiet;

public class HinhTron extends HinhHoc{
	private double banKinh;

	public HinhTron(String ten, String mauSac, double banKinh) {
		super(ten, mauSac);
		this.banKinh = banKinh;
	}

	@Override
	public double tinhDienTich() {
		// TODO Auto-generated method stub
		return super.tinhDienTich() + (Math.PI * (Math.pow(banKinh, banKinh)));
	}

	@Override
	public double tinhChuVi() {
		// TODO Auto-generated method stub
		return super.tinhChuVi() + (2 * Math.PI * banKinh);
	}

	@Override
	public void hienThiThongTin() {
		// TODO Auto-generated method stub
		super.hienThiThongTin();
	}
	
	
}
