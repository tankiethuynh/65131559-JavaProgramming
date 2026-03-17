import java.util.ArrayList;
import java.util.List;

public class MainQLDonHang {
    public static void main(String[] args) {

        System.out.println("\n╔══════════════════════════════════════════════════╗");
        System.out.println("║          HỆ THỐNG ĐẶT HÀNG - ARRAYLIST           ║");
        System.out.println("╚══════════════════════════════════════════════════╝\n");

        QLDonHang ql = new QLDonHang();

        System.out.println("1. THÊM ĐƠN HÀNG");

        List<String> sp1 = new ArrayList<>();
        sp1.add("Laptop Dell"); sp1.add("Chuột Logitech");
        ql.themDonHang(new DonHang("DH001", "Nguyễn Văn An",  sp1, 29_200_000, "2026-01-05"));

        List<String> sp2 = new ArrayList<>();
        sp2.add("Bàn phím Keychron"); sp2.add("USB-C Hub");
        ql.themDonHang(new DonHang("DH002", "Trần Thị Bình",  sp2,  2_950_000, "2026-01-12"));

        List<String> sp3 = new ArrayList<>();
        sp3.add("Màn hình LG 27\"");
        ql.themDonHang(new DonHang("DH003", "Lê Minh Cường",  sp3, 12_000_000, "2026-01-08"));

        List<String> sp4 = new ArrayList<>();
        sp4.add("Tai nghe Sony"); sp4.add("Laptop Dell");
        ql.themDonHang(new DonHang("DH004", "Nguyễn Văn An",  sp4, 37_500_000, "2026-02-01"));

        List<String> sp5 = new ArrayList<>();
        sp5.add("USB-C Hub"); sp5.add("Chuột Logitech"); sp5.add("Bàn phím Keychron");
        ql.themDonHang(new DonHang("DH005", "Phạm Thị Dung",  sp5,  4_150_000, "2026-01-20"));

        List<String> sp6 = new ArrayList<>();
        sp6.add("Laptop Asus Zenbook");
        ql.themDonHang(new DonHang("DH006", "Trần Thị Bình",  sp6, 22_000_000, "2026-01-03"));

        System.out.println("\nDanh sách đơn hàng:");
        ql.hienThiDanhSach();

        System.out.println("\n2. ĐƠN HÀNG GIÁ TRỊ CAO NHẤT");
        DonHang dhMax = ql.timDonHangCaoNhat();
        if (dhMax != null) {
            System.out.printf("  Mã: %-6s | Khách: %-18s | Tổng: %,.0f VND%n",
                    dhMax.getMaDH(), dhMax.getTenKH(), dhMax.getTongTien());
        }

        System.out.println("\n3. THỐNG KÊ SỐ ĐƠN HÀNG THEO KHÁCH HÀNG");
        ql.thongKeTheoKhachHang();

        System.out.println("\n4. TỔNG DOANH THU");
        System.out.printf("  Tổng doanh thu: %,.0f VND%n", ql.tinhTongDoanhThu());

        System.out.println("\n5. SẮP XẾP THEO NGÀY ĐẶT (TĂNG DẦN)");
        ql.sapXepTheoNgay();
        ql.hienThiDanhSach();

        System.out.println("\n╔══════════════════════════════════════════════════╗");
        System.out.println("║                  KẾT THÚC                        ║");
        System.out.println("╚══════════════════════════════════════════════════╝");
    }
}