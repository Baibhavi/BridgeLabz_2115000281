package Day19.Map_Interface;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
public class WordFrequencyCounter {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\Asus\\IdeaProjects\\BridgeLabs_Asssignments\\src\\Day19\\Map_Interface\\SampleText.txt";
        Map<String, Integer> wordFreqCount = countWordFrequency(filePath);
        System.out.println(wordFreqCount);
    }
    public static Map<String, Integer> countWordFrequency(String path){
        Map<String, Integer> wordFrequencyMap = new HashMap<>();
        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String line;
            while((line = br.readLine())!= null){
                String[] words = line.toLowerCase().split("\\W+");
                for(String word : words){
                    if(!word.isEmpty())
                        wordFrequencyMap.put(word, wordFrequencyMap.getOrDefault(word, 0) + 1);
                }
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
        return wordFrequencyMap;
    }
}
