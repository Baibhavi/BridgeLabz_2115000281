package Day23.Reflections.BasicLevel;

import java.lang.reflect.Field;
public class Person {
    private int age;
    public Person(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public static void main(String[] args) {
        try{
            Person person = new Person(25);
            Field ageField = Person.class.getDeclaredField("age");
            ageField.setAccessible(true);
            int ageValue = (int) ageField.get(person);
            System.out.println("Original Age: " + ageValue);
            ageField.set(person, 30);
            ageValue = (int) ageField.get(person);
            System.out.println("Modified Age: " + ageValue);
        }
        catch (NoSuchFieldException | IllegalAccessException e){
            e.printStackTrace();
        }
    }
}
