//public class Animal {
//    void makeSound() {
//        System.out.println("Some generic animal sound");
//    }
//}

abstract class Animal {
    abstract  void sound();

    void sleep() {
        System.out.println("This animal is sleeping.");
    }
}