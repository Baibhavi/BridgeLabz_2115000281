package Day25.PracticeProblems;

import com.google.gson.Gson;
class Car{
    private String make;
    private String model;
    private int year;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

}
public class JavaObjectToJSON {
    public static void main(String[] args) {
        Car car = new Car("Suzuki", "SX-4", 2018);
        Gson gson = new Gson();
        String json = gson.toJson(car);
        System.out.println(json);
    }
}
