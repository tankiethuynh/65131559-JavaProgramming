
public class MainMayTinh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MayTinh mt = new MayTinh();
		mt.hang = "ASUS";
		mt.ram = 16;
		mt.oCung = 512;
		mt.gia = 20000000;
        System.out.println("===THÔNG TIN MÁY TÍNH===");
        mt.kiemTraCauHinh();

        if (mt.coTheChoiGame()) {
            System.out.println("Máy có thể chơi game");
        } else {
            System.out.println("Máy không thể chơi game");
        }

        System.out.println("Thuế phải trả: " + mt.tinhThue() + " VND");
	}
}
