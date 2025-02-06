package Day11.IntroductionOfInheritance.AnimalHierarchy;

public class Animal {
    String name;
    int age;
    public Animal(String name, int age){
        this.age = age;
        this.name = name;
    }
    public void makeSound(){
        System.out.println("Animal makes sound!");
    }
    public static void main(String[] args) {
        Animal animal = new Animal("Jake", 2);
        Dog dog = new Dog("Scooby", 3);
        Cat cat = new Cat("Kitty", 2);
        Bird bird = new Bird("Tweety", 1);
        System.out.print(animal.name + " ");
        animal.makeSound();
        System.out.print(dog.name + " ");
        dog.makeSound();
        System.out.print(cat.name + " ");
        cat.makeSound();
        System.out.print(bird.name + " ");
        bird.makeSound();
    }
}
class Cat extends Animal{
    public Cat(String name, int age){
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Cat Meows!");
    }
}
class Dog extends Animal{
    public Dog(String name, int age){
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Dog Barks!");
    }
}
class Bird extends Animal{
    public Bird(String name, int age){
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Bird Chirps!");
    }
}
