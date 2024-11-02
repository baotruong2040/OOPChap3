package Ex7;

public class Player {
    private int number;
    private float x, y, z = 0.0f;

    // Constructor
    public Player(int number, float x, float y) {
        this.number = number;
        this.x = x;
        this.y = y;
    }

    // Methods
    public void move(float xDisp, float yDisp) {
        this.x += xDisp;
        this.y += yDisp;
    }

    public void jump(float zDisp) {
        this.z += zDisp;
    }

    public boolean near(Ball ball) {
        float distance = (float) Math.sqrt(Math.pow(ball.getX() - x, 2) + Math.pow(ball.getY() - y, 2) + Math.pow(ball.getZ() - z, 2));
        return distance < 8;
    }

    public void kick(Ball ball) {
        // Assuming kick moves the ball to a new random position
        ball.setXYZ((float) Math.random() * 100, (float) Math.random() * 100, (float) Math.random() * 100);
    }

    // toString method
    @Override
    public String toString() {
        return String.format("Player[number=%d, position=(%.2f, %.2f, %.2f)]", number, x, y, z);
    }
}
