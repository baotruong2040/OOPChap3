package Ex7;

public class Test {
    public static void main(String[] args) {
        Ball ball = new Ball(0, 0, 0);
        Player player = new Player(10, 5, 5);

        System.out.println(ball);
        System.out.println(player);

        player.move(2, 3);
        player.jump(1);
        System.out.println("After moving and jumping: " + player);

        System.out.println("Is player near the ball? " + player.near(ball));

        player.kick(ball);
        System.out.println("After kicking the ball: " + ball);
    }
}
