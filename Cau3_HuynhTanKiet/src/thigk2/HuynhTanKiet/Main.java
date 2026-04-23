package thigk2.HuynhTanKiet;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/* * TÓM TẮT CÁCH GIẢI:
 * 1. Sử dụng File và Scanner để kết nối và đọc dữ liệu từ file văn bản.
 * 2. Dùng vòng lặp while (hasNextDouble) để đọc từng số thực và lưu vào một ArrayList.
 * 3. In danh sách: Duyệt ArrayList và in từng phần tử ra màn hình.
 * 4. Kiểm tra X: Duyệt danh sách, nếu có phần tử nào bằng X (ngày sinh) thì đánh dấu tìm thấy.
 * 5. Thông báo kết quả tìm kiếm ra màn hình.
*/

public class Main {
    public static void main(String[] args) {
        String fileName = "sothuc.txt"; // Tên file chứa 80 số thực
        ArrayList<Integer> danhSachSo = new ArrayList<>();
        int ngaySinh = 24; // Giả sử ngày sinh là 23
        boolean timThay = false;

        try {
            File file = new File(fileName);
            Scanner fileScanner = new Scanner(file);

            // 1. Đọc dữ liệu từ file
            while (fileScanner.hasNextDouble()) {
                danhSachSo.add(fileScanner.nextInt());
            }
            fileScanner.close();

            // 2. In danh sách số thực ra màn hình
            System.out.println("--- Danh sách số thực từ file ---");
            for (int i = 0; i < danhSachSo.size(); i++) {
                System.out.println("Dòng " + (i + 1) + ": " + danhSachSo.get(i));
                
                // 3. Kiểm tra giá trị X (ngày sinh)
                if (danhSachSo.get(i) == ngaySinh) {
                    timThay = true;
                }
            }

            // 4. Thông báo kết quả
            System.out.println("Giá trị X cần tìm (Ngày sinh): " + ngaySinh);
            if (timThay) {
                System.out.println("=> KẾT QUẢ: Tìm thấy giá trị " + ngaySinh + " trong danh sách.");
            } else {
                System.out.println("=> KẾT QUẢ: Không tìm thấy giá trị " + ngaySinh + " trong danh sách.");
            }

        } catch (FileNotFoundException e) {
            System.out.println("Lỗi: Không tìm thấy file " + fileName);
            System.out.println("Hãy đảm bảo bạn đã tạo file sothuc.txt trong thư mục dự án.");
        }
    }
}
