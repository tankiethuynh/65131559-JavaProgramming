package HuynhTanKiet;

public class MayTinhBang extends ThietBiDienTu implements CoTheKetNoiInternet, CoTheCamUng {

	public MayTinhBang(String ten, int gia, String hangSanXuat) {
		super(ten, gia, hangSanXuat);
		// TODO Auto-generated constructor stub
	}

	@Override
    public void bat() { 
		System.out.println("Máy tính bảng " + ten + " sáng màn hình."); 
	}

    @Override
    public void tat() { 
    	System.out.println("Máy tính bảng " + ten + " đang tắt."); 
    }

    @Override
    public void ketNoiWifi() { 
    	System.out.println(ten + " đã kết nối Internet."); 
    }

    @Override
    public void ngatKetNoi() { 
    	System.out.println(ten + " đã ngắt Internet."); 
    }

    @Override
    public void cham() { 
    	System.out.println(ten + ": Chạm để mở app."); 
    }

    @Override
    public void vuot() { 
    	System.out.println(ten + ": Vuốt để chuyển trang."); 
    }
}
