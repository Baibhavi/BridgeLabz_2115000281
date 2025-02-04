package Day9.Level1;

public class Vehicle {
    private static double registrationFee = 0;
    private String ownerName;
    private String vehicleType;
    private final long registrationNumber;
    public Vehicle(String ownerName, String vehicleType, long registrationNumber){
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }
    public static void updateRegistrationFee(double newRegistrationFee){
        registrationFee = newRegistrationFee;
    }
    public void displayVehicleDetails(){
        if(this instanceof Vehicle){
            System.out.println("Owner Name : " + this.ownerName);
            System.out.println("Vehicle Type : " + this.vehicleType);
            System.out.println("Registration Number : " + this.registrationNumber);
            System.out.println("Registraion Fee : " + registrationFee);
            System.out.print("\n-----------------------------------------------------------------------------------------------\n");
        }
        else{
            System.out.println("Invalid Request");
        }
    }

    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("Baibhavi", "Car", 213456);
        updateRegistrationFee(5000);
        vehicle1.displayVehicleDetails();
        Vehicle vehicle2 = new Vehicle("Vaishnavi", "Motorcycle", 243446);
        updateRegistrationFee(4000);
        vehicle2.displayVehicleDetails();
    }
}
