package Day9.Level1;

public class Patient {
    private static String hospitalName = "P.M.C.H. Hospital";
    private static int totalPatients = 0;
    private String name;
    private int age;
    private String ailment;
    private final int patientId;
    public Patient(String name, int age, String ailment, int patientId){
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientId = patientId;
        totalPatients++;
    }
    public static void getTotalPatients(){
        System.out.println("Total Patients : " + totalPatients);
    }
    public void displayPatientDetails(){
        if(this instanceof Patient){
            System.out.println("Hospital : " + hospitalName);
            System.out.println("Patient Name : " + name);
            System.out.println("Age : " + age);
            System.out.println("Ailment : " + ailment);
            System.out.println("Patient ID : " + patientId);
            System.out.print("\n-----------------------------------------------------------------------------------------------\n");
        }
        else{
            System.out.println("Invalid Request");
        }
    }

    public static void main(String[] args) {
        Patient patient1 = new Patient("Baibhavi", 22, "Anemia", 234);
        Patient patient2 = new Patient("Pooja", 21, "PCOD", 238);
        patient1.displayPatientDetails();
        patient2.displayPatientDetails();
        getTotalPatients();
    }
}
