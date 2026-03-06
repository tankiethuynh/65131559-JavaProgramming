
public class MainDiem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Diem d1 = new Diem(3,5);
		Diem d2 = new Diem(6,6);
		
		
		System.out.printf("Khoang cach: %.5f\n", d1.tinhKhoangCach(d2));

        if (d1.kiemTraTrungNhau(d2)) {
            System.out.println("Hai diem trung nhau");
        } else {
            System.out.println("Hai diem khong trung nhau");
        }

        Diem d3 = d1.doiXungQuaGoc();
        System.out.print("Diem doi xung cua d1: ");
        d3.hienThi();
	}
}
