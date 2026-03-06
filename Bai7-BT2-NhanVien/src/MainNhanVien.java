
public class MainNhanVien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NhanVien nv1 =  new NhanVien();
		nv1.setmaNV("NV001");
		nv1.sethoTen("Nguyen Van A");
		nv1.setluongCoBan(10000000);
		nv1.setheSoLuong(2.0);
		nv1.hienThiThongTin();
		
		NhanVien nv2 =  new NhanVien();
		nv2.setmaNV("");
		nv2.sethoTen("Huynh Duy B");
		nv2.setluongCoBan(3000000);
		nv2.setheSoLuong(3.0);
		nv2.hienThiThongTin();
	}

}
