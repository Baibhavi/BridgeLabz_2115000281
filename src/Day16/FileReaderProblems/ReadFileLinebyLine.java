package Day16.FileReaderProblems;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class ReadFileLinebyLine {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\Asus\\IdeaProjects\\BridgeLabs_Asssignments\\src\\Day16\\FileReaderProblems\\SampleTextFile";
        try(BufferedReader br = new BufferedReader(new FileReader(filePath))){
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }

    }
}
