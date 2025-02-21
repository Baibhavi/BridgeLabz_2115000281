package Day20;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class CountWordsInFile {
    public static void main(String[] args) {
        String file = "C:\\Users\\Asus\\IdeaProjects\\BridgeLabs_Asssignments\\src\\Day20\\WordCountFile.txt";
        try(BufferedReader br = new BufferedReader(new FileReader(file))){
            Map<String, Integer> wordCount = new HashMap<>();
            String line;
            while((line = br.readLine()) != null){
                String[] words = line.toLowerCase().split("\\W+");
                for(String word : words){
                    if(word.isEmpty())
                        continue;
                    wordCount.put(word, wordCount.getOrDefault(word, 0)+1);
                }
            }
            List<Map.Entry<String, Integer>> sortedEntries = new ArrayList<>(wordCount.entrySet());
            sortedEntries.sort((p1, p2) -> p2.getValue().compareTo(p1.getValue()));
            System.out.println("Top 5 most frequently occurring words:");
            for(int i =0; i<Math.min(5, sortedEntries.size()); i++){
                Map.Entry<String, Integer> entry = sortedEntries.get(i);
                System.out.printf("%s: %d%n", entry.getKey(), entry.getValue());
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
