
public class MayTinh {
	String hang;
	int ram;
	int oCung;
	double gia;
	
	void kiemTraCauHinh() {
		System.out.println("Hãng: " + hang);
		System.out.println("RAM: " + ram);
		System.out.println("Ổ cứng: " + oCung);
		System.out.println("Gia: " + gia);
	}
	
	boolean coTheChoiGame() {
		return ram >= 8;
	}
	
	double tinhThue() {
		return gia * 0.1;
	}
}
