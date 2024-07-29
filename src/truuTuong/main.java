package truuTuong;

public class main {
    public static void main(String[] args) {
        Shape myCircle = new Circle(5.0);
        Shape myRectangle = new Rectangle(4.0, 6.0);
        System.out.println("Area of Circle: " + myCircle.area());
        System.out.println("Area of Rectangle: " + myRectangle.area());
        myCircle.display(); // Output: This is a shape.
        myRectangle.display(); // Output: This is a shape.


    }
}
