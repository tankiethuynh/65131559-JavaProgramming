
public class MainBall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ball ball = new Ball(1.1f, 2.2f, 10, 3.3f, 4.4f);
        System.out.println(ball);

        ball.setX(80.0f);
        ball.setY(35.0f);
        ball.setRadius(5);
        ball.setXDelta(4.0f);
        ball.setYDelta(6.0f);
        System.out.println(ball);
        System.out.println("x: " + ball.getX());
        System.out.println("y: " + ball.getY());
        System.out.println("radius: " + ball.getRadius());
        System.out.println("xDelta: " + ball.getXDelta());
        System.out.println("yDelta: " + ball.getYDelta());

        float xMin = 0.0f, xMax = 100.0f;
        float yMin = 0.0f, yMax = 50.0f;

        for (int i = 0; i < 15; i++) {
            ball.move();
            System.out.println(ball);

            float xNew = ball.getX();
            float yNew = ball.getY();
            int   r    = ball.getRadius();

            if ((xNew + r) > xMax || (xNew - r) < xMin) {
                ball.reflectHorizontal();
            }
            if ((yNew + r) > yMax || (yNew - r) < yMin) {
                ball.reflectVertical();
            }
        }
	}

}
