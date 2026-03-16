
public class MainCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1 = new Circle(1.1);
        System.out.println(c1);

        Circle c2 = new Circle();
        System.out.println(c2);

        c1.setRadius(2.2);
        System.out.println(c1);
        System.out.println("radius: " + c1.getRadius());
        System.out.printf("area: %.2f%n", c1.getArea());
        System.out.printf("circumference: %.2f%n", c1.getCircumference());
	}

}
