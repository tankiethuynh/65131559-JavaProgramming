package HuynhTanKiet;

public class HinhTron extends HinhHoc implements CoTheDiChuyen, CoTheQuay{
	private double banKinh;
    private double x, y;

    public HinhTron(String mauSac, double x, double y, double banKinh) {
        super(mauSac);
        this.x = x;
        this.y = y;
        this.banKinh = banKinh;
    }

    @Override
    public double tinhDienTich() {
        return Math.PI * banKinh * banKinh;
    }

    @Override
    public double tinhChuVi() {
        return 2 * Math.PI * banKinh;
    }

    @Override
    public void phongTo(double tyLe) {
        this.banKinh *= tyLe;
        System.out.println("Đã phóng to hình tròn. Bán kính mới: " + banKinh);
    }

    @Override
    public void diChuyen(double dx, double dy) {
        this.x += dx;
        this.y += dy;
        System.out.println("Hình tròn di chuyển đến: (" + x + ", " + y + ")");
    }

    @Override
    public void quay(double goc) {
        System.out.println("Hình tròn xoay " + goc + " độ quanh tâm (" + x + "," + y + ")");
    }

	@Override
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("Bán kính: " + banKinh);
        System.out.println("Tọa độ hiện tại: (" + x + ", " + y + ")");
	}
}
