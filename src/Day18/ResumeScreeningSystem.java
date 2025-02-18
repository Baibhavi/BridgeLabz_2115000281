package Day18;

import java.util.ArrayList;
import java.util.List;
abstract class JobRole{
    private String name;
    private String description;
    public JobRole(String name, String description) {
        this.name = name;
        this.description = description;
    }
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    public String toString() {
        return "Role: " + name + ", Description: " + description;
    }
}
class SoftwareEngineer extends JobRole {
    private String programmingLanguages;
    public SoftwareEngineer(String name, String description, String programmingLanguages) {
        super(name, description);
        this.programmingLanguages = programmingLanguages;
    }
    public String getProgrammingLanguages() {
        return programmingLanguages;
    }
    @Override
    public String toString() {
        return super.toString() + ", Programming Languages: " + programmingLanguages;
    }
}
class DataScientist extends JobRole {
    private String tools;
    public DataScientist(String name, String description, String tools) {
        super(name, description);
        this.tools = tools;
    }
    public String getTools() {
        return tools;
    }
    @Override
    public String toString() {
        return super.toString() + ", Tools: " + tools;
    }
}
class ProductManager extends JobRole {
    private String domains;
    public ProductManager(String name, String description, String domains) {
        super(name, description);
        this.domains = domains;
    }
    public String getDomains() {
        return domains;
    }
    @Override
    public String toString() {
        return super.toString() + ", Domains: " + domains;
    }
}
class Resume<T extends JobRole>{
    private List<T> resumes;
    public Resume(){
        resumes = new ArrayList<>();
    }
    public void addResume(T resume){
        resumes.add(resume);
    }
    public void removeResume(T resume){
        resumes.remove(resume);
    }
    public T getResume(int i){
        return resumes.get(i);
    }
    public List<T> getAllResumes(){
        return resumes;
    }
    public void displayResumes(List<? extends JobRole> resumes){
        for(JobRole resume : resumes){
            System.out.println(resume);
        }
    }
}
public class ResumeScreeningSystem {
    public static void main(String[] args) {
        Resume<SoftwareEngineer> softwareEngineerResumes = new Resume<>();
        Resume<DataScientist> dataScientistResumes = new Resume<>();
        Resume<ProductManager> productManagerResumes = new Resume<>();
        SoftwareEngineer seResume = new SoftwareEngineer("Alice", "Experienced Software Engineer", "Java, Python");
        DataScientist dsResume = new DataScientist("Bob", "Skilled Data Scientist", "R, Python, SQL");
        ProductManager pmResume = new ProductManager("Charlie", "Seasoned Product Manager", "E-commerce, SaaS");
        softwareEngineerResumes.addResume(seResume);
        dataScientistResumes.addResume(dsResume);
        productManagerResumes.addResume(pmResume);
        System.out.println("Software Engineer Resumes:");
        softwareEngineerResumes.displayResumes(softwareEngineerResumes.getAllResumes());
        System.out.println("Data Scientist Resumes:");
        dataScientistResumes.displayResumes(dataScientistResumes.getAllResumes());
        System.out.println("Product Manager Resumes:");
        productManagerResumes.displayResumes(productManagerResumes.getAllResumes());
    }
}
