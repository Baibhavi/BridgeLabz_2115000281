package Day11.IntroductionOfInheritance.VehicleAndTransportSystem;

public class Vehicle {
    protected int maxSpeed;
    protected String fuelType;

    public Vehicle(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    public void displayInfo() {
        System.out.print("Max Speed: " + maxSpeed + " km/h, Fuel Type: " + fuelType);
    }

    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = new Car(200, "Petrol", 5);
        vehicles[1] = new Truck(120, "Diesel", 10000);
        vehicles[2] = new Motorcycle(180, "Petrol", "Sport");

        for (Vehicle vehicle : vehicles) {
            vehicle.displayInfo();
        }
    }
}
class Car extends Vehicle {
    private int seatCapacity;

    public Car(int maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.print(", Seat Capacity: " + seatCapacity + "\n");
    }
}
class Truck extends Vehicle {
    private int loadCapacity;

    public Truck(int maxSpeed, String fuelType, int loadCapacity) {
        super(maxSpeed, fuelType);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.print(", Load Capacity: " + loadCapacity + " kg\n");
    }
}
class Motorcycle extends Vehicle {
    private String type;

    public Motorcycle(int maxSpeed, String fuelType, String type) {
        super(maxSpeed, fuelType);
        this.type = type;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println(", Type: " + type +"\n");
    }
}
