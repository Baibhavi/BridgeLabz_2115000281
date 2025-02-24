package Day23.Annotations.BasicProblems;

public class Animal {
    public void makeSound(){
        System.out.println("Animal makes sound");
    }
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();
    }
}
class Dog extends Animal{
    @Override
    public void makeSound(){
        System.out.println("Dog Barks");
    }
}