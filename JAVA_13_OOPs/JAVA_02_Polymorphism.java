package JAVA_13_OOPs;

public class JAVA_02_Polymorphism {
    public static class Dog{
        void speak(){
            System.out.println("Barking");
        }
    }
    public static class Cat{
        void speak(){
            System.out.println("Meowing");
        }
    }
    public static class Human{
        void speak(){
            System.out.println("Hello");
        }
    }
    public static class Pikachu{
        void speak(){
            System.out.println("Pika pii");
        }
    }
    static void main() {
        Dog d = new Dog();
        Cat c = new Cat();
        Human h = new Human();
        Pikachu p = new Pikachu();
        d.speak();
        c.speak();
        h.speak();
        p.speak();
    }
}