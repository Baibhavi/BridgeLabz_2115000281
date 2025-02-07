package Day11.SingleInheritance;

public class SmartHomeDevice {
    public static void main(String[] args) {
        Thermostat thermostat = new Thermostat("T123", "Active", 22.5);
        thermostat.displayStatus();
    }
}
class Device{
    String deviceID;
    String status;
    public Device(String deviceID, String status){
        this.deviceID = deviceID;
        this.status = status;
    }
    public void displayStatus(){
        System.out.println("DeviceID: " + deviceID + "\nStatus: " + status);
    }
}
class Thermostat extends Device{
    double temperatureSetting ;
    public Thermostat(String deviceId, String status, double temperatureSetting){
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }
    public void displayStatus(){
        super.displayStatus();
        System.out.println("Temperature Setting: " + temperatureSetting + "°C");
    }
}
