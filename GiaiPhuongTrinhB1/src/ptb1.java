
public class ptb1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		int b = 10;
		
		if (a != 0) {
            double x = -b / a;
            System.out.println("Phương trình " + a + "x + " + b + " = 0 có nghiệm là x = " + x);
        } else {
            if (b == 0) {
                System.out.println("Phương trình " + a + "x + " + b + " = 0 có vô số nghiệm");
            } else {
                System.out.println("Phương trình " + a + "x + " + b + " = 0 vô nghiệm");
            }
        }
	}

}
