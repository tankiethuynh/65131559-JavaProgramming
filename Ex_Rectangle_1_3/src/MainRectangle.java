
public class MainRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r1 = new Rectangle(1.2f, 3.4f);
        System.out.println(r1);

        Rectangle r2 = new Rectangle();
        System.out.println(r2);

        // Test setters và getters
        r1.setLength(5.6f);
        r1.setWidth(7.8f);
        System.out.println(r1);
        System.out.println("length: " + r1.getLength());
        System.out.println("width: "  + r1.getWidth());

        System.out.printf("area: %.2f%n", r1.getArea());
        System.out.printf("perimeter: %.2f%n", r1.getPerimeter());
	}

}
