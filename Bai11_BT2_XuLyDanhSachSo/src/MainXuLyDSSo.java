import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainXuLyDSSo {

    public static List<Integer> nhapDanhSach() {
        Scanner sc = new Scanner(System.in);
        List<Integer> ds = new ArrayList<>();

        System.out.print("  Nhập số lượng phần tử: ");
        int n = sc.nextInt();

        System.out.println("  Nhập " + n + " số nguyên:");
        for (int i = 0; i < n; i++) {
            System.out.print("    Phần tử [" + (i + 1) + "]: ");
            ds.add(sc.nextInt());
        }
        return ds;
    }

    public static List<Integer> loaiBoDuplicates(List<Integer> ds) {
        List<Integer> ketQua = new ArrayList<>();
        for (Integer so : ds) {
            if (!ketQua.contains(so)) {
                ketQua.add(so);
            }
        }
        return ketQua;
    }

    public static Integer timSoLonThu2(List<Integer> ds) {
        if (ds.size() < 2) {
            System.out.println("  [!] Danh sách cần ít nhất 2 phần tử!");
            return null;
        }

        int lon1 = Integer.MIN_VALUE;
        int lon2 = Integer.MIN_VALUE;

        for (Integer so : ds) {
            if (so > lon1) {
                lon2 = lon1;
                lon1 = so;
            } else if (so > lon2 && so != lon1) {
                lon2 = so;
            }
        }

        if (lon2 == Integer.MIN_VALUE) {
            System.out.println("  [!] Không tìm được số lớn thứ 2 (tất cả phần tử bằng nhau)!");
            return null;
        }
        return lon2;
    }

    public static double trungBinhSoChan(List<Integer> ds) {
        List<Integer> soChan = new ArrayList<>();
        for (Integer so : ds) {
            if (so % 2 == 0) {
                soChan.add(so);
            }
        }

        if (soChan.isEmpty()) {
            System.out.println("  [!] Không có số chẵn nào trong danh sách!");
            return 0;
        }

        int tong = 0;
        for (Integer so : soChan) {
            tong += so;
        }
        return (double) tong / soChan.size();
    }

    public static List<List<Integer>> tachChanLe(List<Integer> ds) {
        List<Integer> soChan = new ArrayList<>();
        List<Integer> soLe   = new ArrayList<>();

        for (Integer so : ds) {
            if (so % 2 == 0) {
                soChan.add(so);
            } else {
                soLe.add(so);
            }
        }

        List<List<Integer>> ketQua = new ArrayList<>();
        ketQua.add(soChan);
        ketQua.add(soLe);
        return ketQua;
    }

    public static List<Integer> daoNguoc(List<Integer> ds) {
        List<Integer> ketQua = new ArrayList<>();
        for (int i = ds.size() - 1; i >= 0; i--) {
            ketQua.add(ds.get(i));
        }
        return ketQua;
    }

    public static void inDanhSach(String nhan, List<Integer> ds) {
        System.out.print("  " + nhan + ": [");
        for (int i = 0; i < ds.size(); i++) {
            System.out.print(ds.get(i));
            if (i < ds.size() - 1) System.out.print(", ");
        }
        System.out.println("]  (size = " + ds.size() + ")");
    }

    public static void main(String[] args) {
        System.out.println("\n╔══════════════════════════════════════════════════╗");
        System.out.println("║     XỬ LÝ DANH SÁCH SỐ - ARRAYLIST<INTEGER>      ║");
        System.out.println("╚══════════════════════════════════════════════════╝\n");

        System.out.println("1. NHẬP DANH SÁCH SỐ NGUYÊN");
        List<Integer> danhSach = nhapDanhSach();
        inDanhSach("Danh sách gốc     ", danhSach);

        System.out.println("\n2. LOẠI BỎ SỐ TRÙNG LẶP");
        List<Integer> daSauLoai = loaiBoDuplicates(danhSach);
        inDanhSach("Sau khi loại trùng", daSauLoai);

        System.out.println("\n3. TÌM SỐ LỚN THỨ 2");
        Integer soLonThu2 = timSoLonThu2(daSauLoai);
        if (soLonThu2 != null) {
            System.out.println("  Số lớn thứ 2: " + soLonThu2);
        }

        System.out.println("\n4. TRUNG BÌNH CỘNG CÁC SỐ CHẴN");
        double tb = trungBinhSoChan(daSauLoai);
        if (tb != 0) {
            System.out.printf("  Trung bình các số chẵn: %.2f%n", tb);
        }

        System.out.println("\n5. TÁCH DANH SÁCH THÀNH SỐ CHẴN VÀ SỐ LẺ");
        List<List<Integer>> chanLe = tachChanLe(daSauLoai);
        inDanhSach("Số chẵn", chanLe.get(0));
        inDanhSach("Số lẻ  ", chanLe.get(1));

        System.out.println("\n6. ĐẢO NGƯỢC DANH SÁCH");
        inDanhSach("Trước khi đảo", daSauLoai);
        List<Integer> daDaoNguoc = daoNguoc(daSauLoai);
        inDanhSach("Sau khi đảo   ", daDaoNguoc);

        System.out.println("\n╔══════════════════════════════════════════════════╗");
        System.out.println("║                  KẾT THÚC                        ║");
        System.out.println("╚══════════════════════════════════════════════════╝");
    }
}