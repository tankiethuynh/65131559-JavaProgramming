import java.util.Scanner;


public class quydoitienbai3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        final double TY_GIA = 23500;

        System.out.print("Nhập số tiền USD: ");
        double usd = sc.nextDouble();

        double vnd = usd * TY_GIA;

        System.out.printf("%.2f USD = %.0f VND%n", usd, vnd);
	}

}
