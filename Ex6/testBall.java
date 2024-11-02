package Ex6;

public class testBall {
    public static void main(String[] args) {
        Ball ball = new Ball(0, 0, 10, 5, 45);
        System.out.println("Initial state: " + ball);
        ball.move();
        System.out.println("After move: " + ball);
        ball.reflectHorizontal();
        ball.move();
        System.out.println("After reflect and move: " + ball);
    }
}
