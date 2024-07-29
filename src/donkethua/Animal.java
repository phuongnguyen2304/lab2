package donkethua;
// lớp cha

public class Animal {
    // thuộc tính lớp cha
    String name ;

    // phương thức lớp cha
    void eat (){
        System.out.println(name + " is eating.");

    }

}
// Lớp con kế thừa từ lớp cha
class Dog extends Animal {
    // Phương thức của lớp con
    void bark() {
        System.out.println(name + " is barking.");
    }
}
