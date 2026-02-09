
public class MainTKNganHang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TaiKhoanNganHang tk1 = new TaiKhoanNganHang();
		TaiKhoanNganHang tk2 = new TaiKhoanNganHang();
		
		tk1.soTaiKhoan = "001";
		tk1.tenChuTaiKhoan = "Huỳnh Tấn KIệt";
		tk1.soDu = 5000000;
		
		tk2.soTaiKhoan = "002";
		tk2.tenChuTaiKhoan = "Võ Văn Hùng";
		tk2.soDu = 3000000;

		System.out.println("=== TÀI KHOẢN A ===");
		tk1.hienThiSoDu();

		System.out.println("\n=== TÀI KHOẢN B ===");
		tk2.hienThiSoDu();

		System.out.println("\n--- Chuyển 2.000.000 từ A sang B ---");
		tk1.chuyenTien(tk2, 2000000);

		System.out.println("\n=== SAU KHI CHUYỂN ===");
		tk1.hienThiSoDu();
		tk2.hienThiSoDu();
	}
}
