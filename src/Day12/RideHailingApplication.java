package Day12;
abstract class Vehicle2{
    private String vehicleId, driverName;
    private double ratePerKm;
    public Vehicle2(String vehicleId, String driverName, double ratePerKm){
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }
    public String getVehicleId() {
        return vehicleId;
    }
    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }
    public String getDriverName() {
        return driverName;
    }
    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }
    public double getRatePerKm() {
        return ratePerKm;
    }
    public void setRatePerKm(double ratePerKm) {
        this.ratePerKm = ratePerKm;
    }
    public abstract double calculateFare(double distance);
    public void getVehicleDetails(){
        System.out.println("VehicleID: " + vehicleId + "\nDriver's Name: " + driverName + "\nRate per KM: " + ratePerKm);
    }
}
interface GPS{
    String getCurrentLocation();
    void updateLocation(String location);
}
class Car2 extends Vehicle2 implements GPS{
    private String currentLocation;
    public Car2(String vehicleId, String driverName, double ratePerKm){
        super(vehicleId, driverName, ratePerKm);
    }
    public double calculateFare(double distance){
        return getRatePerKm() * distance;
    }
    public String getCurrentLocation(){
        return currentLocation;
    }
    public void updateLocation(String location){
        this.currentLocation = location;
    }
}
class Bike2 extends Vehicle2 implements GPS{
    private String currentLocation;
    public Bike2(String vehicleId, String driverName, double ratePerKm){
        super(vehicleId, driverName, ratePerKm);
    }
    public double calculateFare(double distance){
        return getRatePerKm() * distance;
    }
    public String getCurrentLocation(){
        return currentLocation;
    }
    public void updateLocation(String location){
        this.currentLocation = location;
    }
}
class Auto extends Vehicle2 implements GPS{
    private String currentLocation;
    public Auto(String vehicleId, String driverName, double ratePerKm){
        super(vehicleId, driverName, ratePerKm);
    }
    public double calculateFare(double distance){
        return getRatePerKm() * distance;
    }
    public String getCurrentLocation(){
        return currentLocation;
    }
    public void updateLocation(String location){
        this.currentLocation = location;
    }
}
public class RideHailingApplication {
    public static void main(String[] args) {
        Vehicle2 car = new Car2("CAR001", "Baibhavi Pandey", 10);
        Vehicle2 bike = new Bike2("BIKE001", "Aman Gupta", 5);
        Vehicle2 auto = new Auto("AUTO001", "Pooja", 8);
        Vehicle2[] vehicles = {car, bike, auto};
        for(Vehicle2 vehicle : vehicles){
            vehicle.getVehicleDetails();
            System.out.println("Fare for 10 km: " + vehicle.calculateFare(10));
            System.out.println();
        }
    }
}
