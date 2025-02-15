package Day16.InputStreamReaderProblems;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
public class ReadUserInputAndWriteToFile {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\Asus\\IdeaProjects\\BridgeLabs_Asssignments\\src\\Day16\\InputStreamReaderProblem\\SampleFile.txt";
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            FileWriter fw = new FileWriter(filePath, true); // enable appending doesn't overrite
            System.out.println("Write something (type 'exit' to stop): ");
            String entry;
            while(!(entry = br.readLine()).equalsIgnoreCase( "exit")){
                fw.write(entry + System.lineSeparator());
                fw.flush(); // ensures data is written
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
