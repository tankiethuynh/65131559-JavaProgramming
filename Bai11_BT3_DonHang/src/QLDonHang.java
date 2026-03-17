import java.util.ArrayList;
import java.util.List;

public class QLDonHang {
    private List<DonHang> danhSachDH;

    public QLDonHang() {
        danhSachDH = new ArrayList<>();
    }

    public void themDonHang(DonHang dh) {
        danhSachDH.add(dh);
        System.out.println("  [+] Đã thêm: " + dh.getMaDH()
                + " | " + dh.getTenKH()
                + " | " + String.format("%,.0f", dh.getTongTien()) + " VND"
                + " | " + dh.getNgayDat());
    }

    public DonHang timDonHangCaoNhat() {
        if (danhSachDH.isEmpty()) return null;
        DonHang max = danhSachDH.get(0);
        for (DonHang dh : danhSachDH) {
            if (dh.getTongTien() > max.getTongTien()) {
                max = dh;
            }
        }
        return max;
    }

    public void thongKeTheoKhachHang() {
        List<String> danhSachKH = new ArrayList<>();
        List<Integer> soLuongDH = new ArrayList<>();

        for (DonHang dh : danhSachDH) {
            String tenKH = dh.getTenKH();
            int viTri = danhSachKH.indexOf(tenKH);
            if (viTri == -1) {
                danhSachKH.add(tenKH);
                soLuongDH.add(1);
            } else {
                soLuongDH.set(viTri, soLuongDH.get(viTri) + 1);
            }
        }

        System.out.println("  " + "-".repeat(35));
        System.out.printf("  %-20s | %s%n", "Khách hàng", "Số đơn");
        System.out.println("  " + "-".repeat(35));
        for (int i = 0; i < danhSachKH.size(); i++) {
            System.out.printf("  %-20s | %d đơn%n", danhSachKH.get(i), soLuongDH.get(i));
        }
        System.out.println("  " + "-".repeat(35));
    }

    public double tinhTongDoanhThu() {
        double tong = 0;
        for (DonHang dh : danhSachDH) {
            tong += dh.getTongTien();
        }
        return tong;
    }

    public void sapXepTheoNgay() {
        for (int i = 0; i < danhSachDH.size() - 1; i++) {
            for (int j = 0; j < danhSachDH.size() - i - 1; j++) {
                String ngayA = danhSachDH.get(j).getNgayDat();
                String ngayB = danhSachDH.get(j + 1).getNgayDat();
                if (ngayA.compareTo(ngayB) > 0) {
                    DonHang temp = danhSachDH.get(j);
                    danhSachDH.set(j, danhSachDH.get(j + 1));
                    danhSachDH.set(j + 1, temp);
                }
            }
        }
    }

    public void hienThiDanhSach() {
        if (danhSachDH.isEmpty()) {
            System.out.println("  [!] Chưa có đơn hàng nào.");
            return;
        }
        System.out.println("  " + "=".repeat(90));
        System.out.printf("  | %-6s | %-18s | %-28s | %-18s | %-10s |%n",
                "Mã DH", "Khách hàng", "Sản phẩm", "Tổng tiền", "Ngày đặt");
        System.out.println("  " + "=".repeat(90));
        for (DonHang dh : danhSachDH) {
            System.out.println("  " + dh);
        }
        System.out.println("  " + "=".repeat(90));
        System.out.println("  Tổng số đơn: " + danhSachDH.size());
    }
}