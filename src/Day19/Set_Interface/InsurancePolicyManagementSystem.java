package Day19.Set_Interface;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.TimeUnit;
class Policy implements Comparable<Policy> {
    private String policyNumber;
    private String policyholderName;
    private Date expiryDate;
    private String coverageType;
    private double premiumAmount;
    public Policy(String policyNumber, String policyholderName, Date expiryDate, String coverageType, double premiumAmount) {
        this.policyNumber = policyNumber;
        this.policyholderName = policyholderName;
        this.expiryDate = expiryDate;
        this.coverageType = coverageType;
        this.premiumAmount = premiumAmount;
    }
    public String getPolicyNumber() {
        return policyNumber;
    }
    public String getPolicyholderName() {
        return policyholderName;
    }
    public Date getExpiryDate() {
        return expiryDate;
    }
    public String getCoverageType() {
        return coverageType;
    }
    public double getPremiumAmount() {
        return premiumAmount;
    }
    public int compareTo(Policy other) {
        return this.expiryDate.compareTo(other.expiryDate);
    }
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Policy policy = (Policy) o;
        return policyNumber.equals(policy.policyNumber);
    }
    public int hashCode() {
        return policyNumber.hashCode();
    }
    public String toString() {
        return "Policy{" +
                "policyNumber='" + policyNumber + '\'' +
                ", policyholderName='" + policyholderName + '\'' +
                ", expiryDate=" + expiryDate +
                ", coverageType='" + coverageType + '\'' +
                ", premiumAmount=" + premiumAmount +
                '}';
    }
}
class PolicyStorage {
    private Set<Policy> hashSet;
    private Set<Policy> linkedHashSet;
    private Set<Policy> treeSet;
    public PolicyStorage() {
        hashSet = new HashSet<>();
        linkedHashSet = new LinkedHashSet<>();
        treeSet = new TreeSet<>();
    }
    public void addPolicy(Policy policy) {
        hashSet.add(policy);
        linkedHashSet.add(policy);
        treeSet.add(policy);
    }
    public Set<Policy> getHashSet() {
        return hashSet;
    }
    public Set<Policy> getLinkedHashSet() {
        return linkedHashSet;
    }
    public Set<Policy> getTreeSet() {
        return treeSet;
    }
}
class PolicyRetrieval {
    public static List<Policy> getAllUniquePolicies(Set<Policy> policySet) {
        return new ArrayList<>(policySet);
    }
    public static List<Policy> getPoliciesExpiringSoon(Set<Policy> policySet, int days) {
        List<Policy> expiringSoon = new ArrayList<>();
        Date currentDate = new Date();
        for (Policy policy : policySet) {
            long diffInMillies = Math.abs(policy.getExpiryDate().getTime() - currentDate.getTime());
            long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
            if (diff <= days) {
                expiringSoon.add(policy);
            }
        }
        return expiringSoon;
    }
    public static List<Policy> getPoliciesByCoverageType(Set<Policy> policySet, String coverageType) {
        List<Policy> policiesByCoverage = new ArrayList<>();
        for (Policy policy : policySet) {
            if (policy.getCoverageType().equalsIgnoreCase(coverageType)) {
                policiesByCoverage.add(policy);
            }
        }
        return policiesByCoverage;
    }
    public static List<Policy> getDuplicatePolicies(Set<Policy> policySet) {
        List<Policy> duplicates = new ArrayList<>();
        Set<String> policyNumbers = new HashSet<>();
        for (Policy policy : policySet) {
            if (!policyNumbers.add(policy.getPolicyNumber())) {
                duplicates.add(policy);
            }
        }
        return duplicates;
    }
}
public class InsurancePolicyManagementSystem {
    public static void main(String[] args) throws ParseException {
        PolicyStorage storage = new PolicyStorage();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Policy policy1 = new Policy("P001", "John Doe", sdf.parse("2025-03-01"), "Health", 1000.0);
        Policy policy2 = new Policy("P002", "Jane Doe", sdf.parse("2025-02-15"), "Auto", 500.0);
        Policy policy3 = new Policy("P003", "Jim Beam", sdf.parse("2025-03-25"), "Home", 800.0);
        Policy policy4 = new Policy("P004", "Jake Long", sdf.parse("2025-02-28"), "Health", 1200.0);
        storage.addPolicy(policy1);
        storage.addPolicy(policy2);
        storage.addPolicy(policy3);
        storage.addPolicy(policy4);
        List<Policy> allPolicies = PolicyRetrieval.getAllUniquePolicies(storage.getHashSet());
        System.out.println("All Unique Policies: " + allPolicies);
        List<Policy> expiringSoon = PolicyRetrieval.getPoliciesExpiringSoon(storage.getTreeSet(), 30);
        System.out.println("Policies Expiring Soon: " + expiringSoon);
        List<Policy> healthPolicies = PolicyRetrieval.getPoliciesByCoverageType(storage.getHashSet(), "Health");
        System.out.println("Health Policies: " + healthPolicies);
        List<Policy> duplicatePolicies = PolicyRetrieval.getDuplicatePolicies(storage.getHashSet());
        System.out.println("Duplicate Policies: " + duplicatePolicies);
        long startTime = System.nanoTime();
        storage.addPolicy(new Policy("P005", "Anna Smith", sdf.parse("2025-04-01"), "Auto", 600.0));
        long endTime = System.nanoTime();
        System.out.println("Time taken to add a policy to HashSet: " + (endTime - startTime) + " ns");
        startTime = System.nanoTime();
        storage.getLinkedHashSet().add(new Policy("P006", "Bob Brown", sdf.parse("2025-05-01"), "Home", 700.0));
        endTime = System.nanoTime();
        System.out.println("Time taken to add a policy to LinkedHashSet: " + (endTime - startTime) + " ns");
        startTime = System.nanoTime();
        storage.getTreeSet().add(new Policy("P007", "Cathy Green", sdf.parse("2025-06-01"), "Health", 900.0));
        endTime = System.nanoTime();
        System.out.println("Time taken to add a policy to TreeSet: " + (endTime - startTime) + " ns");
    }
}
