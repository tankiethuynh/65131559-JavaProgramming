package HuynhTanKiet;

public class HinhChuNhat extends HinhHoc{
	private double chieuDai;
	private double chieuRong;

	public HinhChuNhat(String ten, String mauSac, double chieuDai, double chieuRong) {
		super(ten, mauSac);
		this.chieuDai = chieuDai;
		this.chieuRong = chieuRong;
	}

	@Override
	public double tinhDienTich() {
		// TODO Auto-generated method stub
		return super.tinhDienTich() + (chieuDai * chieuRong);
	}

	@Override
	public double tinhChuVi() {
		// TODO Auto-generated method stub
		return super.tinhChuVi() + ((chieuDai + chieuRong) * 2);
	}

	@Override
	public void hienThiThongTin() {
		// TODO Auto-generated method stub
		super.hienThiThongTin();
	}
	
	
}
