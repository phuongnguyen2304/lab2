public class Animal {
    // ví dụ ghi đè
    // lớp cha
    public void makeSound(){
        System.out.println("Animal makes a sound  ");


    }

}
   class Dog extends Animal{
      @Override
    public void makeSound(){
          System.out.println("Dog barks ");

    }
   }
   class Cat extends Animal{
    @Override
    public void makeSound(){
        System.out.println("cat meow meow ");
    }
   }







