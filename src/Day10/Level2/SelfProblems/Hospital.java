package Day10.Level2.SelfProblems;
import java.util.ArrayList;
import java.util.List;
class Patient {
    private String name;
    private List<Doctor> doctors;
    public Patient(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
    }
    public String getName() {
        return name;
    }
    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }
    public List<Doctor> getDoctors() {
        return doctors;
    }
}

class Doctor {
    private String name;
    private List<Patient> patients;

    public Doctor(String name) {
        this.name = name;
        this.patients = new ArrayList<>();
    }
    public String getName() {
        return name;
    }
    public void addPatient(Patient patient) {
        patients.add(patient);
        patient.addDoctor(this);
    }
    public List<Patient> getPatients() {
        return patients;
    }
    public void consult(Patient patient) {
        System.out.println("Doctor " + name + " is consulting with patient " + patient.getName());
    }
}
class Hospital {
    private String name;
    private List<Doctor> doctors;
    private List<Patient> patients;
    public Hospital(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }
    public String getName() {
        return name;
    }
    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }
    public void addPatient(Patient patient) {
        patients.add(patient);
    }
    public List<Doctor> getDoctors() {
        return doctors;
    }
    public List<Patient> getPatients() {
        return patients;
    }
    public static void main(String[] args) {
        Hospital hospital = new Hospital("P.M.C.H. Hospital");
        Doctor doctor1 = new Doctor("Dr. A.K. Sinha");
        Doctor doctor2 = new Doctor("Dr. S. Mahapatra");
        Patient patient1 = new Patient("Baibhavi");
        Patient patient2 = new Patient("Pooja");
        hospital.addDoctor(doctor1);
        hospital.addDoctor(doctor2);
        hospital.addPatient(patient1);
        hospital.addPatient(patient2);
        doctor1.addPatient(patient1);
        doctor1.addPatient(patient2);
        doctor2.addPatient(patient1);
        doctor1.consult(patient1);
        doctor1.consult(patient2);
        doctor2.consult(patient1);
    }
}

