package Day8.Level1;

public class Person {
    private String name;
    private int age;
    public Person(){
        this.name = "Unknown";
        this.age = 0;
    }
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public Person(Person other){
        this.name = other.name;
        this.age = other.age;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String toString(){
        return "Name: " + name + ", Age: " + age;
    }
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("John Doe", 30);
        Person person3 = new Person(person2);
        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
    }

}
