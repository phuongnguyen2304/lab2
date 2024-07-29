package DaKeThua;

// Interface đầu tiên
interface Animal {
    void eat();
}

// Interface thứ hai
interface Pet {
    void play();
}

// Lớp Dog kế thừa từ hai interface
class Dog implements Animal, Pet {
    @Override
    public void eat() {
        System.out.println("Dog is eating.");
    }

    @Override
    public void play() {
        System.out.println("Dog is playing.");
    }
}







