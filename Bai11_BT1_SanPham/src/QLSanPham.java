import java.util.ArrayList;
import java.util.List;

public class QLSanPham {
	private List<SanPham> dsSanPham;
	
	public QLSanPham() {
		 dsSanPham = new ArrayList<>();
	}
	 
	public void themSanPham(SanPham sp) {
		for (SanPham s : dsSanPham) {
            if (s.getMaSP().equalsIgnoreCase(sp.getMaSP())) {
                System.out.println("  [!] Mã sản phẩm '" + sp.getMaSP() + "' đã tồn tại!");
                return;
            }
        }
		dsSanPham.add(sp);
        System.out.println("  [+] Đã thêm: " + sp.getTenSP() + " (Mã: " + sp.getMaSP() + ")");
	}
	
	public boolean xoaSanPham(String maSP) {
        for (int i = 0; i < dsSanPham.size(); i++) {
            if (dsSanPham.get(i).getMaSP().equalsIgnoreCase(maSP)) {
                SanPham spBiXoa = dsSanPham.remove(i);
                System.out.println("  [-] Đã xóa: " + spBiXoa.getTenSP() + " (Mã: " + maSP + ")");
                return true;
            }
        }
        System.out.println("  [!] Không tìm thấy sản phẩm với mã: " + maSP);
        return false;
    }
	
	public List<SanPham> timTheoTen(String tuKhoa) {
		List<SanPham> ketQua = new ArrayList<>();
		String tuKhoaLower = tuKhoa.toLowerCase();
		
		for (SanPham sp : dsSanPham) {
			if (sp.getTenSP().toLowerCase().contains(tuKhoaLower))
				ketQua.add(sp);
		}
		return ketQua;
	}
	
	public void sapXepTheoGia(boolean tangDan) {
        // Bubble sort
        for (int i = 0; i < dsSanPham.size() - 1; i++) {
            for (int j = 0; j < dsSanPham.size() - i - 1; j++) {
                SanPham a = dsSanPham.get(j);
                SanPham b = dsSanPham.get(j + 1);
                boolean canHoiDoi = tangDan
                        ? a.getGia() > b.getGia()
                        : a.getGia() < b.getGia();
                if (canHoiDoi) {
                	dsSanPham.set(j, b);
                	dsSanPham.set(j + 1, a);
                }
            }
        }
        System.out.println("  [✓] Đã sắp xếp theo giá " + (tangDan ? "TĂNG DẦN" : "GIẢM DẦN"));
    }
	
	public double tinhTongGiaTriKho() {
        double tong = 0;
        for (SanPham sp : dsSanPham) {
            tong += sp.getGia() * sp.getSoLuong();
        }
        return tong;
    }

    public List<SanPham> layDanhSachSapHet() {
        List<SanPham> sapHet = new ArrayList<>();
        for (SanPham sp : dsSanPham) {
            if (sp.getSoLuong() < 10) {
                sapHet.add(sp);
            }
        }
        return sapHet;
    }

    public void hienThiDanhSach() {
        if (dsSanPham.isEmpty()) {
            System.out.println("  [!] Danh sách sản phẩm đang trống!");
            return;
        }
        in("=", 65);
        System.out.printf("  | %-8s | %-22s | %-17s | %-6s |%n",
                "Mã SP", "Tên sản phẩm", "Giá", "SL");
        in("-", 65);
        for (SanPham sp : dsSanPham) {
            System.out.println("  " + sp);
        }
        in("=", 65);
        System.out.printf("  Tổng số sản phẩm: %d%n", dsSanPham.size());
    }

    private void in(String ky, int soLan) {
        System.out.println("  " + ky.repeat(soLan));
    }
}
