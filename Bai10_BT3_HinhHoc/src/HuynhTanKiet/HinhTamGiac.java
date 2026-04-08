package HuynhTanKiet;

public class HinhTamGiac extends HinhHoc implements CoTheDiChuyen, CoTheQuay{
	private double a, b, c;
    private double x, y;

    public HinhTamGiac(String mauSac, double a, double b, double c, double x, double y) {
        super(mauSac);
        if (a + b > c && a + c > b && b + c > a) {
            this.a = a;
            this.b = b;
            this.c = c;
        } else {
            this.a = 1; this.b = 1; this.c = 1;
            System.out.println("Cảnh báo: 3 cạnh không tạo thành tam giác. Đã gán giá trị mặc định.");
        }
        this.x = x;
        this.y = y;
    }

    @Override
    public double tinhChuVi() {
        return a + b + c;
    }

    @Override
    public double tinhDienTich() {
        double p = tinhChuVi() / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public void phongTo(double tyLe) {
        this.a *= tyLe;
        this.b *= tyLe;
        this.c *= tyLe;
        System.out.println("Đã phóng to tam giác theo tỷ lệ " + tyLe);
    }

    @Override
    public void diChuyen(double dx, double dy) {
        this.x += dx;
        this.y += dy;
        System.out.println("Tam giác đã dời đến tọa độ: (" + x + ", " + y + ")");
    }

    @Override
    public void quay(double goc) {
        System.out.println("Tam giác đã xoay một góc " + goc + " độ quanh tâm hình học.");
    }

	@Override
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("Chi tiết cạnh: a = " + a + ", b = " + b + ", c = " + c);
        System.out.println("Tọa độ hiện tại: (" + x + ", " + y + ")");
	}
}
