package thigk2.HuynhTanKiet;

import java.util.Scanner;

public class Cau1 {
	public static void main(String[] args) {
//			Từ hai tọa độ (x1, y1) và (x2, y2), ta tính độ dài các cạnh bằng cách lấy trị tuyệt đối của hiệu các tọa độ tương ứng:
//				Chiều rộng = abs(x2 - x1)
//				Chiều cao = abs(y2 - y1)
//			Sau đó thì ta sử dụng công thức tính chu vi và diện tích hình chữ nhật như bình thường:
//				Chu vi = 2 * (Chiều dài + Chiều rộng)
//				Diện tích = Chiều dài * Chiều rộng
//
//
//			Quy trình thực hiện (Java)
//			1.  Khai báo: Sử dụng Scanner để nhận dữ liệu.
//			2.  Nhập: Đọc 4 giá trị int từ bàn phím.
//			3.  Xử lý: Dùng hàm Math.abs() để tính cạnh, sau đó tính chu vi và diện tích.
//			4.  Xuất: In kết quả ra màn hình.

		Scanner sc = new Scanner(System.in);
		
		//Nhập thông tin tọa độ của góc
		System.out.print("Nhập x1 (Trên): ");
		int x1 = sc.nextInt();
		System.out.print("Nhập y1 (Trái): ");
		int y1 = sc.nextInt();
		System.out.print("Nhập x2 (Dưới): ");
		int x2 = sc.nextInt();
		System.out.print("Nhập y2 (Phải): ");
		int y2 = sc.nextInt();

		int chieuRong = Math.abs(x2 - x1);
		int chieuDai = Math.abs(y2 - y1);

        // Tính toán
		int chuVi = 2 * (chieuRong + chieuDai);
		int dienTich = chieuRong * chieuDai;
		
        // Xuất kết quả
        System.out.println("------------------------------");
        System.out.println("Chu vi hình chữ nhật: " + chuVi);
        System.out.println("Diện tích hình chữ nhật: " + dienTich);

        sc.close();
        
	}
}