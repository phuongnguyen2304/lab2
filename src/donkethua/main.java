package donkethua;

public class main {
    public static void main(String[] args) {
        // Tạo đối tượng của lớp con
        Dog myDog = new Dog();
        myDog.name = "Buddy";

        // Gọi phương thức của lớp cha
        myDog.eat(); // Output: Buddy is eating.

        // Gọi phương thức của lớp con
        myDog.bark(); // Output: Buddy is barking.

    }
}
