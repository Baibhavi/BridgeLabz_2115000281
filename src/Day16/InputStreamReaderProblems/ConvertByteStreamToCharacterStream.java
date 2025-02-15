package Day16.InputStreamReaderProblems;

import java.io.FileInputStream;
import java.io.InputStreamReader;
public class ConvertByteStreamToCharacterStream {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\Asus\\IdeaProjects\\BridgeLabs_Asssignments\\src\\Day16\\InputStreamReaderProblem\\SampleFile.txt";
        try(InputStreamReader isr = new InputStreamReader(new FileInputStream(filePath), "UTF-8")){
            int i;
            while((i = isr.read()) != -1){
                System.out.print((char)i);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
