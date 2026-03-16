public class MainCircle {
	public static void main(String[] args) {

        Circle c1 = new Circle();
        System.out.println("radius = " + c1.getRadius() + ", area = " + c1.getArea());

        Circle c2 = new Circle(2.0);
        System.out.println("radius = " + c2.getRadius() + ", area = " + c2.getArea());

        Circle c3 = new Circle(3.0, "blue");
        System.out.println(c3.getColor());

        Circle c4 = new Circle();
        c4.setRadius(5.5);
        c4.setColor("green");
        System.out.println("radius = " + c4.getRadius());
        System.out.println("color = "  + c4.getColor());

        Circle c5 = new Circle(5.5);
        System.out.println(c5.toString());
        System.out.println(c5);
        System.out.println("Info: " + c5);
    }
}
