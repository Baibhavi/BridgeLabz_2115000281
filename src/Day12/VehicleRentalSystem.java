package Day12;
import java.util.List;
import java.util.ArrayList;
abstract class Vehicle{
    private String vehicleNumber, type;
    private double rentalRate;
    public Vehicle(String vehicleNumber,String type, double rentalRate){
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }
    public void setVehicleNumber(String vehicleNumber){
        this.vehicleNumber = vehicleNumber;
    }
    public void setType(String Type){
        this.type = Type;
    }
    public void setRentalRate(double rentalRate){
        this.rentalRate = rentalRate;
    }
    public String getVehicleNumber(){
        return vehicleNumber;
    }
    public String getType(){
        return type;
    }
    public double getRentalRate(){
        return rentalRate;
    }
    abstract double calculateRentalCost(int days);
    public void displayDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Type: " + type);
        System.out.println("Rental Rate: " + rentalRate);
    }
}
interface Insurable{
    double calculateInsurance();
    String getInsuranceDetails();
}
class Car extends Vehicle implements Insurable{
    private String insuranceNumber;
    public Car(String vehicleNumber,String type, double rentalRate, String insuranceNumber){
        super(vehicleNumber, type, rentalRate);
        this.insuranceNumber = insuranceNumber;
    }
    public void setInsuranceNumber(String insuranceNumber){
        this.insuranceNumber = insuranceNumber;
    }
    public String getInsuranceNumber(){
        return insuranceNumber;
    }
    public double calculateRentalCost(int days){
        return getRentalRate() * days;
    }
    public double calculateInsurance(){
        return getRentalRate() * 0.1;
    }
    public String getInsuranceDetails(){
        return "Insurance Policy Number: " + getInsuranceNumber();
    }
    public void displayDetails() {
        super.displayDetails();
        System.out.println(getInsuranceDetails());
    }
}
class Bike extends Vehicle implements Insurable{
    private String insuranceNumber;
    public Bike(String vehicleNumber,String type, double rentalRate, String insuranceNumber){
        super(vehicleNumber, type, rentalRate);
        this.insuranceNumber = insuranceNumber;
    }
    public void setInsuranceNumber(String insuranceNumber){
        this.insuranceNumber = insuranceNumber;
    }
    public String getInsuranceNumber(){
        return insuranceNumber;
    }
    public double calculateRentalCost(int days){
        return getRentalRate() * days;
    }
    public double calculateInsurance(){
        return getRentalRate() * 0.05;
    }
    public String getInsuranceDetails(){
        return "Insurance Policy Number: " + getInsuranceNumber() ;
    }
    public void displayDetails() {
        super.displayDetails();
        System.out.println(getInsuranceDetails());
    }
}
class Truck extends Vehicle implements Insurable{
    private String insuranceNumber;
    public Truck(String vehicleNumber,String type, double rentalRate, String insuranceNumber){
        super(vehicleNumber, type, rentalRate);
        this.insuranceNumber = insuranceNumber;
    }
    public void setInsuranceNumber(String insuranceNumber){
        this.insuranceNumber = insuranceNumber;
    }
    public String getInsuranceNumber(){
        return insuranceNumber;
    }
    public double calculateRentalCost(int days){
        return getRentalRate() * days + 50;
    }
    public double calculateInsurance(){
        return getRentalRate() * 0.15;
    }
    public String getInsuranceDetails(){
        return "Insurance Policy Number: " + getInsuranceNumber() ;
    }
    public void displayDetails() {
        super.displayDetails();
        System.out.println(getInsuranceDetails());
    }
}
public class VehicleRentalSystem {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car("CAR123", "Car", 100, "INS123CAR"));
        vehicles.add(new Bike("BIKE123", "Bike", 50, "INS123BIKE"));
        vehicles.add(new Truck("TRUCK123", "Truck", 200, "INS123TRUCK"));
        for (Vehicle vehicle : vehicles) {
            vehicle.displayDetails();
            if (vehicle instanceof Insurable) {
                Insurable insurable = (Insurable) vehicle;
                System.out.println("Insurance Cost: " + insurable.calculateInsurance());
            }
            System.out.println("Rental Cost for 5 days: " + vehicle.calculateRentalCost(5));
            System.out.println();
        }
    }
}
