
public class MainSanPham {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SanPham s1 = new SanPham();
		s1.setmaSP("SP001");
		s1.settenSP("But");
		s1.setgia(5000);
		s1.setsoLuong(2);
		s1.hienThiThongTin();
		
		SanPham s2 = new SanPham();
		s2.setmaSP("");
        s2.settenSP("Vo");
        s2.setgia(0);
        s2.setsoLuong(-1);
		s2.hienThiThongTin();
	}
}
