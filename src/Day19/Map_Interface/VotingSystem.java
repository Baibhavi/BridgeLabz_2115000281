package Day19.Map_Interface;

import java.util.*;
public class VotingSystem {
    private Map<String, Integer> voteMap = new HashMap<>();
    private Map<String, Integer> orderedVoteMap = new LinkedHashMap<>();
    private Map<String, Integer> sortedResultMap;
    public VotingSystem() {
        sortedResultMap = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String candidate1, String candidate2) {
                int compare = voteMap.get(candidate2).compareTo(voteMap.get(candidate1));
                if (compare == 0) {
                    return candidate1.compareTo(candidate2);
                }
                return compare;
            }
        });
    }
    public void addVote(String candidate){
        voteMap.put(candidate, voteMap.getOrDefault(candidate, 0)+1);
        orderedVoteMap.put(candidate, orderedVoteMap.getOrDefault(candidate, 0)+1);
        sortedResultMap.put(candidate, voteMap.get(candidate));
    }
    public void displayResults(){
        System.out.println("Votes in insertion order:");
        for(Map.Entry<String, Integer> entry : orderedVoteMap.entrySet() ){
            System.out.println("Candidate: " + entry.getKey() + ", Votes: " + entry.getValue());
        }
        System.out.println("Votes in sorted order:");
        for(Map.Entry<String, Integer> entry : sortedResultMap.entrySet() ){
            System.out.println("Candidate: " + entry.getKey() + ", Votes: " + entry.getValue());
        }
    }
    public static void main(String[] args) {
        VotingSystem vote = new VotingSystem();
        vote.addVote("BJP");
        vote.addVote("Congress");
        vote.addVote("BJP");
        vote.addVote("AAP");
        vote.addVote("SDP");
        vote.addVote("BJP");
        vote.displayResults();
    }
}
