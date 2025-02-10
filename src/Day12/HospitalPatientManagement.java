package Day12;
import java.util.ArrayList;
import java.util.List;
abstract class Patient{
    private String patientId, name;
    private int age;
    public Patient(String patientId, String  name, int age){
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }
    public void setPatientId(String patientId){
        this.patientId = patientId;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getPatientId(){
        return patientId;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    abstract double calculateBill();
    public void getPatientDetails(){
        System.out.println("Patient ID: " + getPatientId() + "\nName: " + getName()  + "\nAge: " + getAge());
    }
}
interface MedicalRecord{
    void addRecord(String record);
    List<String> viewRecords();
}
class InPatient extends Patient implements MedicalRecord{
    private double dailyCost;
    private int noOfDays;
    private List<String> medicalHistory;
    public InPatient(String patientId, String  name, int age, double dailyCost, int noOfDays){
        super(patientId, name, age);
        this.dailyCost = dailyCost;
        this.noOfDays = noOfDays;
        this.medicalHistory = new ArrayList<>();
    }
    public void setDailyCost(double dailyCost){
        this.dailyCost = dailyCost;
    }
    public void setNoOfDays(int noOfDays){
        this.noOfDays = noOfDays;
    }
    public double getDailyCost(){
        return dailyCost;
    }
    public int getNoOfDays(){
        return noOfDays;
    }
    public double calculateBill(){
        return getDailyCost() * getNoOfDays();
    }
    public void addRecord(String record){
        medicalHistory.add(record);
    }
    public List<String> viewRecords(){
        return medicalHistory;
    }
}
class OutPatient extends Patient implements MedicalRecord{
    private double consultFee;
    private List<String> medicalHistory;
    public OutPatient(String patientId, String  name, int age, double consultFee){
        super(patientId, name, age);
        this.consultFee = consultFee;
        this.medicalHistory = new ArrayList<>();
    }
    public double calculateBill(){
        return consultFee;
    }
    public void addRecord(String record) {
        medicalHistory.add(record);
    }
    public List<String> viewRecords() {
        return medicalHistory;
    }
}
public class HospitalPatientManagement {
    public static void main(String[] args) {
        Patient inPatient = new InPatient("IN001", "Baibhavi", 22, 2000, 5);
        Patient outPatient = new OutPatient("OUT001", "Pooja", 21, 500);
        inPatient.getPatientDetails();
        System.out.println("Bill: " + inPatient.calculateBill());
        if(inPatient instanceof MedicalRecord){
            MedicalRecord medicalRecord = (MedicalRecord) inPatient;
            medicalRecord.addRecord("Pneumonia");
            medicalRecord.addRecord("Jaundice");
            System.out.println("Medical Records: " + medicalRecord.viewRecords());
        }
        System.out.println();
        outPatient.getPatientDetails();
        System.out.println("Bill: " + outPatient.calculateBill());
        if(outPatient instanceof MedicalRecord){
            MedicalRecord medicalRecord = (MedicalRecord) outPatient;
            medicalRecord.addRecord("Annual Checkup");
            System.out.println("Medical Records: " + medicalRecord.viewRecords());
        }
    }
}
