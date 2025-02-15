package Day16.FileReaderProblems;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class CountOccurrenceOfWordInFile {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\Asus\\IdeaProjects\\BridgeLabs_Asssignments\\src\\Day16\\FileReaderProblems\\SampleTextFile";
        String target = "text";
        try(BufferedReader br = new BufferedReader(new FileReader(filePath))){
            String line;
            int count = 0;
            while ((line = br.readLine()) != null) {
                String[] words = line.toLowerCase().split("\\W+");
                for(String s : words){
                    if(s.equals(target.toLowerCase())){
                        count++;
                    }
                }
            }
            System.out.println("Occurrence of " + target + " in the file: " + count + " times");
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
