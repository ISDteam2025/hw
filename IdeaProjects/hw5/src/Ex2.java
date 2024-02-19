public class Ex2 {
    class Point {
        private float x;
        private float y;
        public Point(float x, float y) {
            this.x = x;
            this.y = y;
        }
        public Point() {
            this(0.0f, 0.0f);
        }
        public float getX() {
            return x;
        }
        public void setX(float x) {
            this.x = x;
        }
        public float getY() {
            return y;
        }
        public void setY(float y) {
            this.y = y;
        }
        public void setXY(float x, float y) {
            this.x = x;
            this.y = y;
        }
        public float[] getXY() {
            return new float[]{x, y};
        }
        @Override
        public String toString() {
            return "(" + x + "," + y + ")";
        }
    }

    class MovablePoint extends Point {
        private float xSpeed;
        private float ySpeed;

        public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
            super(x, y);
            this.xSpeed = xSpeed;
            this.ySpeed = ySpeed;
        }
        public MovablePoint(float xSpeed, float ySpeed) {
            this(0.0f, 0.0f, xSpeed, ySpeed);
        }
        public MovablePoint() {
            this(0.0f, 0.0f, 0.0f, 0.0f);
        }
        public float getXSpeed() {
            return xSpeed;
        }
        public void setXSpeed(float xSpeed) {
            this.xSpeed = xSpeed;
        }
        public float getYSpeed() {
            return ySpeed;
        }
        public void setYSpeed(float ySpeed) {
            this.ySpeed = ySpeed;
        }
        public void setSpeed(float xSpeed, float ySpeed) {
            this.xSpeed = xSpeed;
            this.ySpeed = ySpeed;
        }
        public float[] getSpeed() {
            return new float[]{xSpeed, ySpeed};
        }
        public MovablePoint move() {
            setX(getX() + xSpeed);
            setY(getY() + ySpeed);
            return this;
        }
        @Override
        public String toString() {
            return "(" + getX() + "," + getY() + "),speed=(" + xSpeed + "," + ySpeed + ")";
        }
    }

}