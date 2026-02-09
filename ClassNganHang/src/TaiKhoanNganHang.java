
public class TaiKhoanNganHang {

	    String soTaiKhoan;
	    String tenChuTaiKhoan;
	    double soDu;

	    void guiTien(double soTien) {
	        if (soTien > 0) {
	            soDu += soTien;
	            System.out.println("Gửi tiền thành công: " + soTien);
	        } else {
	            System.out.println("Số tiền gửi không hợp lệ!");
	        }
	    }

	    boolean rutTien(double soTien) {
	        if (soTien > 0 && soTien <= soDu) {
	            soDu -= soTien;
	            System.out.println("Rút tiền thành công: " + soTien);
	            return true;
	        } else {
	            System.out.println("Rút tiền thất bại! Không đủ số dư.");
	            return false;
	        }
	    }

	    void chuyenTien(TaiKhoanNganHang taiKhoanKhac, double soTien) {
	        if (this.rutTien(soTien)) {
	            taiKhoanKhac.guiTien(soTien);
	            System.out.println("Chuyển tiền thành công!");
	        } else {
	            System.out.println("Chuyển tiền thất bại!");
	        }
	    }

	    void hienThiSoDu() {
	        System.out.println("Số dư hiện tại: " + soDu + " VND");
	    }
}
