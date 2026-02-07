import java.util.Scanner;

public class tinhtiendienbai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số điện tiêu thụ (kWh): ");
        int soDien = sc.nextInt();

        double tienDien = 0;

        if (soDien <= 50) {
            tienDien = soDien * 1678;
        } else if (soDien <= 100) {
            tienDien = 50 * 1678 + (soDien - 50) * 1734;
        } else if (soDien <= 200) {
            tienDien = 50 * 1678 + 50 * 1734 + (soDien - 100) * 2014;
        } else {
            tienDien = 50 * 1678 + 50 * 1734 + 100 * 2014 + (soDien - 200) * 2536;
        }

        System.out.printf("Tiền điện phải trả: %.0f VND%n", tienDien);
    }
}