package Day19.Map_Interface;
import java.util.*;
import java.time.LocalDate;
class Policy {
    String policyNumber;
    String policyHolderName;
    LocalDate expiryDate;
    Policy(String policyNumber, String policyHolderName, LocalDate expiryDate) {
        this.policyNumber = policyNumber;
        this.policyHolderName = policyHolderName;
        this.expiryDate = expiryDate;
    }
    public String toString() {
        return "PolicyNumber: " + policyNumber + ", PolicyHolder: " + policyHolderName + ", ExpiryDate: " + expiryDate;
    }
}
public class InsurancePolicyManagement {
    private Map<String, Policy> policyMap = new HashMap<>();
    private Map<String, Policy> orderedPolicyMap = new LinkedHashMap<>();
    private Map<LocalDate, Policy> sortedByExpiryDateMap = new TreeMap<>();
    public void addPolicy(Policy policy) {
        policyMap.put(policy.policyNumber, policy);
        orderedPolicyMap.put(policy.policyNumber, policy);
        sortedByExpiryDateMap.put(policy.expiryDate, policy);
    }
    public Policy retrievePolicyByNumber(String policyNumber) {
        return policyMap.get(policyNumber);
    }
    public List<Policy> listPoliciesExpiringWithin30Days() {
        List<Policy> expiringPolicies = new ArrayList<>();
        LocalDate now = LocalDate.now();
        LocalDate in30Days = now.plusDays(30);
        sortedByExpiryDateMap.forEach((expiryDate, policy) -> {
            if (!expiryDate.isBefore(now) && !expiryDate.isAfter(in30Days)) {
                expiringPolicies.add(policy);
            }
        });

        return expiringPolicies;
    }
    public List<Policy> listPoliciesForPolicyHolder(String policyHolderName) {
        List<Policy> holderPolicies = new ArrayList<>();
        orderedPolicyMap.forEach((policyNumber, policy) -> {
            if (policy.policyHolderName.equals(policyHolderName)) {
                holderPolicies.add(policy);
            }
        });
        return holderPolicies;
    }
    public void removeExpiredPolicies() {
        LocalDate now = LocalDate.now();
        sortedByExpiryDateMap.entrySet().removeIf(entry -> entry.getKey().isBefore(now));
        policyMap.entrySet().removeIf(entry -> entry.getValue().expiryDate.isBefore(now));
        orderedPolicyMap.entrySet().removeIf(entry -> entry.getValue().expiryDate.isBefore(now));
    }
    public static void main(String[] args) {
        InsurancePolicyManagement system = new InsurancePolicyManagement();
        system.addPolicy(new Policy("P123", "Alice", LocalDate.of(2025, 3, 15)));
        system.addPolicy(new Policy("P124", "Bob", LocalDate.of(2025, 2, 25)));
        system.addPolicy(new Policy("P125", "Carol", LocalDate.of(2025, 4, 10)));
        System.out.println("Retrieve Policy P123: " + system.retrievePolicyByNumber("P123"));
        System.out.println("Policies expiring within 30 days: " + system.listPoliciesExpiringWithin30Days());
        System.out.println("Policies for Bob: " + system.listPoliciesForPolicyHolder("Bob"));
        system.removeExpiredPolicies();
        System.out.println("All Policies after removing expired ones: ");
        system.policyMap.values().forEach(System.out::println);
    }
}

