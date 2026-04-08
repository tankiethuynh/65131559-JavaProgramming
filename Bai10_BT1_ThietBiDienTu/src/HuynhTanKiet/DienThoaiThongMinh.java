package HuynhTanKiet;

public class DienThoaiThongMinh extends ThietBiDienTu implements CoTheKetNoiInternet,  CoTheCamUng {
	
	public DienThoaiThongMinh(String ten, int gia, String hangSanXuat) {
		super(ten, gia, hangSanXuat);
	}

	@Override
	public void cham() {
		System.out.println("Điện thoại " + ten + " đang khởi động...");
	}

	@Override
	public void vuot() {
		System.out.println("Điện thoại " + ten + " đang tắt nguồn...");
	}

	@Override
	public void ketNoiWifi() {
		System.out.println(ten + " đã kết nối Wifi.");
	}

	@Override
	public void ngatKetNoi() {
		System.out.println(ten + " đã ngắt kết nối.");
	}

	@Override
	public void bat() {
		System.out.println(ten + ": Phản hồi thao tác chạm.");
	}

	@Override
	public void tat() {
		System.out.println(ten + ": Phản hồi thao tác vuốt màn hình.");
	}
	
}
