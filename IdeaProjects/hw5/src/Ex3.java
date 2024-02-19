public class Ex3 {
    class Shape {
        private String color;
        private boolean filled;
        public Shape() {
            this.color = "red";
            this.filled = true;
        }
        public Shape(String color, boolean filled) {
            this.color = color;
            this.filled = filled;
        }
        public String getColor() {
            return color;
        }
        public void setColor(String color) {
            this.color = color;
        }
        public boolean isFilled() {
            return filled;
        }
        public void setFilled(boolean filled) {
            this.filled = filled;
        }
        @Override
        public String toString() {
            return "Shape with color=" + color + " ,filled=" + filled ;
        }
    }

    class Circle extends Shape {
        private double radius;
        public Circle() {
            this.radius = 1.0;
        }
        public Circle(double radius) {
            this.radius = radius;
        }
        public Circle(double radius, String color, boolean filled) {
            super(color, filled);
            this.radius = radius;
        }
        public double getRadius() {
            return radius;
        }
        public void setRadius(double radius) {
            this.radius = radius;
        }
        public double getArea() {
            return Math.PI * radius * radius;
        }
        public double getPerimeter() {
            return 2 * Math.PI * radius;
        }
        @Override
        public String toString() {
            return "Circle["+ super.toString()+"radius="+radius+"]";
        }
    }

    class Rectangle extends Shape {
        private double width;
        private double length;

        public Rectangle() {
            this.width = 1.0;
            this.length = 1.0;
        }
        public Rectangle(double width, double length) {
            this.width = width;
            this.length = length;
        }

        public Rectangle(double width, double length, String color, boolean filled) {
            super(color, filled);
            this.width = width;
            this.length = length;
        }

        public double getWidth() {
            return width;
        }

        public void setWidth(double width) {
            this.width = width;
        }

        public double getLength() {
            return length;
        }

        public void setLength(double length) {
            this.length = length;
        }

        public double getArea() {
            return width * length;
        }

        public double getPerimeter() {
            return 2 * (width + length);
        }

        @Override
        public String toString() {
            return "Rectangle[" + super.toString()+"width="+width+"length="+length+"]";
        }
    }

    class Square extends Rectangle {
        public Square() {
            super(1.0, 1.0);
        }

        public Square(double side) {
            super(side, side);
        }

        public Square(double side, String color, boolean filled) {
            super(side, side, color, filled);
        }

        public double getSide() {
            return getWidth();
        }

        public void setSide(double side) {
            setWidth(side);
            setLength(side);
        }

        @Override
        public void setWidth(double side) {
            super.setWidth(side);
            super.setLength(side);
        }

        @Override
        public void setLength(double side) {
            super.setLength(side);
            super.setWidth(side);
        }

        @Override
        public String toString() {
            return "A Square with side=" + getSide() + ", which is a subclass of " + super.toString();
        }
    }
}



