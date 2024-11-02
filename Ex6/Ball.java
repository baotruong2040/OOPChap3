package Ex6;

public class Ball {
    private float x, y;
    private float xDelta, yDelta;
    private int radius, speed, direction;

    // Constructor
    public Ball(float x, float y, int radius, int speed, int direction) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.speed = speed;
        this.direction = direction;
        updateDeltas();
    }

    // Getters and Setters
    public float getX() { return x; }
    public void setX(float x) { this.x = x; }

    public float getY() { return y; }
    public void setY(float y) { this.y = y; }

    public int getRadius() { return radius; }
    public void setRadius(int radius) { this.radius = radius; }

    public int getSpeed() { return speed; }
    public void setSpeed(int speed) { this.speed = speed; updateDeltas(); }

    public int getDirection() { return direction; }
    public void setDirection(int direction) { this.direction = direction; updateDeltas(); }

    public float getXDelta() { return xDelta; }
    public void setXDelta(float xDelta) { this.xDelta = xDelta; }

    public float getYDelta() { return yDelta; }
    public void setYDelta(float yDelta) { this.yDelta = yDelta; }

    // Update xDelta and yDelta based on speed and direction
    private void updateDeltas() {
        double radian = Math.toRadians(direction);
        xDelta = (float) (speed * Math.cos(radian));
        yDelta = (float) (speed * Math.sin(radian));
    }

    // Move the ball
    public void move() {
        x += xDelta;
        y += yDelta;
    }

    // Reflect the ball horizontally
    public void reflectHorizontal() {
        xDelta = -xDelta;
    }

    // Reflect the ball vertically
    public void reflectVertical() {
        yDelta = -yDelta;
    }

    // toString method
    @Override
    public String toString() {
        return String.format("Ball[(%.2f, %.2f), speed=(%.2f, %.2f)]", x, y, xDelta, yDelta);
    }

}

