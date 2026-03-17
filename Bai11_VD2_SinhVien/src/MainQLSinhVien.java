import java.util.List;

public class MainQLSinhVien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("=== HỆ THỐNG QUẢN LÝ SINH VIÊN VỚI ARRAYLIST ===\n");
        
        QuanLySinhVien qlsv = new QuanLySinhVien();
        
        qlsv.themSinhVien(new SinhVien("SV001", "Nguyễn Văn A", 8.5));
        qlsv.themSinhVien(new SinhVien("SV002", "Trần Thị B", 7.2));
        qlsv.themSinhVien(new SinhVien("SV003", "Lê Văn C", 6.8));
        qlsv.themSinhVien(new SinhVien("SV004", "Phạm Thị D", 9.1));
        qlsv.themSinhVien(new SinhVien("SV005", "Hoàng Văn E", 5.5));
        
        qlsv.hienThiDanhSach();
        
        System.out.println("\n=== TÌM KIẾM SINH VIÊN ===");
        SinhVien sv = qlsv.timTheoMa("SV003");
        System.out.println("Tìm SV003: " + (sv != null ? sv : "Không tìm thấy"));
        
        System.out.println("\n=== SINH VIÊN ĐIỂM CAO NHẤT ===");
        System.out.println(qlsv.timDiemCaoNhat());
        
        System.out.println("\n=== ĐIỂM TRUNG BÌNH LỚP ===");
        System.out.printf("Điểm TB lớp: %.2f%n", qlsv.tinhDiemTrungBinhLop());
        
        System.out.println("\n=== SINH VIÊN CÓ ĐIỂM >= 8.0 ===");
        List<SinhVien> svGioi = qlsv.locSinhVienTheoDiem(8.0);
        if (!svGioi.isEmpty()) svGioi.forEach(System.out::println);
        else System.out.println("Không có sinh viên nào đạt điểm >= 8.0");
        
        System.out.println("\n=== DANH SÁCH SAU KHI SẮP XẾP (GIẢM DẦN THEO ĐIỂM) ===");
        qlsv.sapXepTheoDiem();
        qlsv.hienThiDanhSach();
        
        System.out.println("\n=== XÓA SINH VIÊN ===");
        qlsv.xoaSinhVien("SV002");
        qlsv.hienThiDanhSach();
        
        qlsv.hienThiHaiSinhVienDauTien();
	}

}
