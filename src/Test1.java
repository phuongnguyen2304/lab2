public class Test1 {
    public static void main(String[] args) {
        MathOperations math = new MathOperations();

        // Gọi phương thức add với hai tham số kiểu int
        System.out.println("Sum of 2 and 3: " + math.add(2, 3)); // Output: 5

        // Gọi phương thức add với ba tham số kiểu int
        System.out.println("Sum of 2, 3 and 4: " + math.add(2, 3, 4)); // Output: 9

        // Gọi phương thức add với hai tham số kiểu double
        System.out.println("Sum of 2.5 and 3.5: " + math.add(2.5, 3.5)); // Output: 6.0
    }
}


