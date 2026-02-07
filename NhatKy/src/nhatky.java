import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class nhatky {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.println("=== NHẬP NHẬT KÝ CÁ NHÂN ===");
        System.out.print("Ngày: ");
        String date = scanner.nextLine();

        System.out.print("Tiêu đề: ");
        String title = scanner.nextLine();

        System.out.print("Nội dung nhật ký: ");
        String content = scanner.nextLine();

        // Ghi vào file
        try {
            FileWriter writer = new FileWriter("nhatky.txt", true);

            writer.write("=== NHẬT KÝ ===\n");
            writer.write("Ngày: " + date + "\n");
            writer.write("Tiêu đề: " + title + "\n");
            writer.write("Nội dung: " + content + "\n");
            writer.write("================\n\n");

            writer.close();
            System.out.println("\nĐã lưu nhật ký vào file nhatky.txt");

        } catch (IOException e) {
            System.out.println("Lỗi ghi file: " + e.getMessage());
        }

        scanner.close();
	}

}
