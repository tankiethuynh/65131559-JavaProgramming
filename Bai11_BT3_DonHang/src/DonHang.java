import java.util.List;

public class DonHang {
    private String maDH;
    private String tenKH;
    private List<String> danhSachSanPham;
    private double tongTien;
    private String ngayDat;

    public DonHang(String maDH, String tenKH, List<String> danhSachSanPham, double tongTien, String ngayDat) {
        this.maDH = maDH;
        this.tenKH = tenKH;
        this.danhSachSanPham = danhSachSanPham;
        this.tongTien = tongTien;
        this.ngayDat = ngayDat;
    }

    public String getMaDH() { return maDH; }
    public String getTenKH() { return tenKH; }
    public List<String> getDanhSachSanPham() { return danhSachSanPham; }
    public double getTongTien() { return tongTien; }
    public String getNgayDat() { return ngayDat; }

    @Override
    public String toString() {
        return String.format("| %-6s | %-18s | %-28s | %14s VND | %s |",
                maDH, tenKH,
                String.join(", ", danhSachSanPham),
                String.format("%,.0f", tongTien),
                ngayDat);
    }
}