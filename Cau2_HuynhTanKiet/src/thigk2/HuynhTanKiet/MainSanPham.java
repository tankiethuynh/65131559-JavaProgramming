package thigk2.HuynhTanKiet;

import java.util.ArrayList;
import java.util.Scanner;

/* TÓM TẮT CÁCH GIẢI:
 * 1. Sử dụng ArrayList<SanPham> để lưu trữ danh sách sản phẩm động.
 * 2. Hard-code: Sử dụng phương thức add() để thêm trực tiếp 3 đối tượng vào List.
 * 3. Nhập mới: Dùng Scanner đọc dữ liệu từ bàn phím, khởi tạo đối tượng rồi add vào List.
 * 4. Hiển thị: Dùng vòng lặp for-each để duyệt qua danh sách.
 * 5. Lọc: Dùng vòng lặp kết hợp câu lệnh if so sánh chuỗi bằng equalsIgnoreCase().
*/

public class MainSanPham {

    public static void main(String[] args) {
        ArrayList<SanPham> dsSanPham = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        // 1. Hard-code tạo danh sách 3 sản phẩm ban đầu
        dsSanPham.add(new SanPham("SP01", "Sữa Alpha", "Thực phẩm chức năng", 450000));
        dsSanPham.add(new SanPham("SP02", "Bánh Quy", "Bánh kẹo", 35000));
        dsSanPham.add(new SanPham("SP03", "Vitamin C", "Thực phẩm chức năng", 120000));

        System.out.println("--- Danh sách sản phẩm ban đầu ---");
        for (SanPham sp : dsSanPham) {
            System.out.println(sp);
        }

        // 2. Thêm mới 1 sản phẩm nhập từ bàn phím
        System.out.println("\n--- Nhập thông tin sản phẩm mới ---");
        System.out.print("Nhập mã SP: ");
        String ma = sc.nextLine();
        System.out.print("Nhập tên SP: ");
        String ten = sc.nextLine();
        System.out.print("Nhập loại SP: ");
        String loai = sc.nextLine();
        System.out.print("Nhập giá bán: ");
        double gia = sc.nextDouble();

        dsSanPham.add(new SanPham(ma, ten, loai, gia));

        // 3. In lại toàn bộ danh sách
        System.out.println("\n--- Danh sách sau khi cập nhật ---");
        for (SanPham sp : dsSanPham) {
            System.out.println(sp);
        }

        // 4. Lọc danh sách có loại là "Thực phẩm chức năng"
        System.out.println("\n--- Các sản phẩm là 'Thực phẩm chức năng' ---");
        for (SanPham sp : dsSanPham) {
            if (sp.getLoaiSP().equalsIgnoreCase("Thực phẩm chức năng")) {
                System.out.println(sp);
            }
        }
        
        sc.close();
    }
}
