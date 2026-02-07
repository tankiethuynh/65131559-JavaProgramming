
public class quydoitien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double usd_vnd = 23500;
		final double eur_vnd = 27000;
		
		double usd = 20;
		double eur = 30;
		
		double vn_from_usd = usd * usd_vnd;
		double vn_from_eur = eur * eur_vnd;
		
		System.out.printf("Số tiền USD: %.0f%n", usd);
		System.out.printf("Chuyển sang VND là: %.0f%n", vn_from_usd);
		
		System.out.printf("Số tiền EUR: %.0f%n", eur);
		System.out.printf("Chuyển sang VND là: %.0f%n", vn_from_eur);
	}
}
