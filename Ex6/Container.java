package Ex6;
    public class Container {
        private int x1, y1, x2, y2;
    
        // Constructor
        public Container(int x, int y, int width, int height) {
            this.x1 = x;
            this.y1 = y;
            this.x2 = x + width - 1;
            this.y2 = y + height - 1;
        }
    
        // Getters
        public int getX() { return x1; }
        public int getY() { return y1; }
        public int getWidth() { return x2 - x1 + 1; }
        public int getHeight() { return y2 - y1 + 1; }
    
        // Check if the ball collides with the container
        public boolean collides(Ball ball) {
            float ballMinX = ball.getX() - ball.getRadius();
            float ballMinY = ball.getY() - ball.getRadius();
            float ballMaxX = ball.getX() + ball.getRadius();
            float ballMaxY = ball.getY() + ball.getRadius();
    
            if (ballMinX < x1 || ballMaxX > x2) {
                ball.reflectHorizontal();
                return true;
            }
            if (ballMinY < y1 || ballMaxY > y2) {
                ball.reflectVertical();
                return true;
            }
            return false;
        }
    
        // toString method
        @Override
        public String toString() {
            return String.format("Container[(%d,%d),(%d,%d)]", x1, y1, x2, y2);
        }
    
    }
