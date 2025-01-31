package Day8.Level1;

public class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;
    private double dailyRate;
    public CarRental(){
        this.customerName = "Unknown";
        this.carModel = "Unknown";
        this.rentalDays = 0;
        this.dailyRate = 0.0;

    }
    public CarRental(String customerName, String carModel, int rentalDays, double dailyRate){
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.dailyRate = dailyRate;
    }
    public CarRental(CarRental other){
        this.customerName = other.customerName;
        this.carModel = other.carModel;
        this.rentalDays = other.rentalDays;
        this.dailyRate = other.dailyRate;
    }
    public String toString() {
        return "Customer Name: " + customerName + ", Car Model: " + carModel + ", Rental Days: " + rentalDays + ", Daily Rate: " + dailyRate;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public void setRentalDays(int rentalDays) {
        this.rentalDays = rentalDays;
    }

    public void setDailyRate(double dailyRate) {
        this.dailyRate = dailyRate;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCarModel() {
        return carModel;
    }
    public int getRentalDays() {
        return rentalDays;
    }

    public double getDailyRate() {
        return dailyRate;
    }
    public double calculateTotalCost(){
        return rentalDays*dailyRate;
    }

    public static void main(String[] args) {
        CarRental rental1 = new CarRental("Alice", "Toyota Camry", 5, 30.0);
        System.out.println(rental1);
        System.out.println("Total Cost: " + rental1.calculateTotalCost());
        CarRental rental2 = new CarRental(rental1);
        rental2.setCustomerName("Bob");
        System.out.println(rental2);
        System.out.println("Total Cost: " + rental2.calculateTotalCost());
    }
}
