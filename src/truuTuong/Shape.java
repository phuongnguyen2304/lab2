package truuTuong;
// Lớp trừu tượng
abstract class Shape {
    // Phương thức trừu tượng
    public abstract double area();

    // Phương thức không trừu tượng
    public void display() {
        System.out.println("This is a shape.");
    }
}

// Lớp con Circle kế thừa từ lớp trừu tượng Shape
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

// Lớp con Rectangle kế thừa từ lớp trừu tượng Shape
class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }
}





