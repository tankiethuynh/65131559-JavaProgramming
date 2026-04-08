package HuynhTanKiet;

public class HinhVuong extends HinhHoc implements CoTheDiChuyen, CoTheQuay{
	private double canh;
    private double x, y;

    public HinhVuong(String mauSac, double x, double y, double canh) {
        super(mauSac);
        this.x = x;
        this.y = y;
        this.canh = canh;
    }

    @Override
    public double tinhDienTich() {
        return canh * canh;
    }

    @Override
    public double tinhChuVi() {
        return 4 * canh;
    }

    @Override
    public void phongTo(double tyLe) {
        this.canh *= tyLe;
        System.out.println("Đã phóng to hình vuông. Cạnh mới: " + canh);
    }

    @Override
    public void diChuyen(double dx, double dy) {
        this.x += dx;
        this.y += dy;
        System.out.println("Hình vuông di chuyển đến: (" + x + ", " + y + ")");
    }

    @Override
    public void quay(double goc) {
        System.out.println("Hình vuông xoay " + goc + " độ.");
    }

	@Override
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("Cạnh: " + canh);
        System.out.println("Tọa độ hiện tại: (" + x + ", " + y + ")");
	}
}
