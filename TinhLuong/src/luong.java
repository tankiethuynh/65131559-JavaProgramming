
public class luong {
	public static void main(String[] args) {
		double gio = 45;
		double luongtheogio = 250000;
		double luong;
		
		if (gio > 40) 
			luong = 40 * luongtheogio + (gio - 40) * luongtheogio * 1.5;
		else luong = gio * luongtheogio;
		
		System.out.printf("Số giờ làm việc: %.0f%n", gio);
		System.out.printf("Lương theo giờ: %.0f%n", luongtheogio);
        System.out.printf("Tổng lương: %.0f%n", luong);
	}
};
