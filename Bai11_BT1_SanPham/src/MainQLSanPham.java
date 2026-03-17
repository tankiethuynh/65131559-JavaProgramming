import java.util.List;

public class MainQLSanPham {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\n╔══════════════════════════════════════════════════╗");
        System.out.println("║     HỆ THỐNG QUẢN LÝ SẢN PHẨM - ARRAYLIST      ║");
        System.out.println("╚══════════════════════════════════════════════════╝\n");
 
        QLSanPham ql = new QLSanPham();
 
        // ── 1. THÊM SẢN PHẨM ──────────────────────────────────────────
        System.out.println("1. THÊM SẢN PHẨM");
        ql.themSanPham(new SanPham("SP001", "Laptop Dell XPS 13", 28_000_000, 15));
        ql.themSanPham(new SanPham("SP002", "Chuột Logitech MX3", 1_200_000, 7));
        ql.themSanPham(new SanPham("SP003", "Bàn phím Keychron K2", 2_500_000, 3));
        ql.themSanPham(new SanPham("SP004", "Màn hình LG 27inch", 12_000_000, 20));
        ql.themSanPham(new SanPham("SP005", "Tai nghe Sony WH-1000", 8_500_000, 8));
        ql.themSanPham(new SanPham("SP006", "USB-C Hub 7 cổng", 450_000, 50));
        ql.themSanPham(new SanPham("SP007", "Laptop Asus Zenbook", 22_000_000, 12));

        ql.themSanPham(new SanPham("SP001", "Trùng mã thử nghiệm",        0, 0));
 
        System.out.println("\nDanh sách sau khi thêm:");
        ql.hienThiDanhSach();

        System.out.println("\n2. TÌM THEO TÊN (từ khóa: \"laptop\")");
        List<SanPham> ketQuaTim = ql.timTheoTen("laptop");
        if (ketQuaTim.isEmpty()) {
            System.out.println("  [!] Không tìm thấy sản phẩm nào.");
        } else {
            System.out.println("  Tìm thấy " + ketQuaTim.size() + " sản phẩm:");
            for (SanPham sp : ketQuaTim) {
                System.out.println("  " + sp);
            }
        }

        System.out.println("\n 3. SẮP XẾP THEO GIÁ TĂNG DẦN");
        ql.sapXepTheoGia(true);
        ql.hienThiDanhSach();

        System.out.println("\n4. SẮP XẾP THEO GIÁ GIẢM DẦN");
        ql.sapXepTheoGia(false);
        ql.hienThiDanhSach();

        System.out.println("\n5. TỔNG GIÁ TRỊ KHO HÀNG");
        double tongGiaTri = ql.tinhTongGiaTriKho();
        System.out.printf("  [✓] Tổng giá trị kho: %,.0f VND%n", tongGiaTri);

        System.out.println("\n6. SẢN PHẨM SẮP HẾT HÀNG (số lượng < 10)");
        List<SanPham> sapHet = ql.layDanhSachSapHet();
        if (sapHet.isEmpty()) {
            System.out.println("  [✓] Không có sản phẩm nào sắp hết hàng.");
        } else {
            System.out.println("  [!] Cảnh báo — " + sapHet.size() + " sản phẩm sắp hết:");
            for (SanPham sp : sapHet) {
                System.out.println("  " + sp);
            }
        }
        
        System.out.println("\n7. XÓA SẢN PHẨM");
        ql.xoaSanPham("SP003");
        ql.xoaSanPham("SP999");
 
        System.out.println("\nDanh sách sau khi xóa:");
        ql.hienThiDanhSach();
 
        System.out.println("\n╔══════════════════════════════════════════════════╗");
        System.out.println("║                  KẾT THÚC                       ║");
        System.out.println("╚══════════════════════════════════════════════════╝");
	}

}
