package HuynhTanKiet;

public class MainHinhHoc {
	public static void main(String[] args) {
		 
        System.out.println("\n===== HỆ THỐNG HÌNH HỌC =====\n");
 
        HinhChuNhat hcn = new HinhChuNhat("Hình chữ nhật", "Xanh dương", 8, 5);
        hcn.hienThiThongTin();
 
        HinhTron ht = new HinhTron("Hình tròn", "Đỏ", 6);
        ht.hienThiThongTin();
 
        HinhTamGiac htg1 = new HinhTamGiac("Tam giác thường", "Xanh lá", 5, 6, 7);
        htg1.hienThiThongTin();

        HinhTamGiac htg2 = new HinhTamGiac("Tam giác lỗi", "Vàng", 1, 1, 10);
        System.out.println(">>> Kiểm tra tam giác không hợp lệ:");
        htg2.hienThiThongTin();
    }
}
