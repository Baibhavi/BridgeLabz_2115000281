package Day20;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class ReadLargeFile {
    public static void main(String[] args) {
        String largeFile = "C:\\Users\\Asus\\Downloads\\100mb-examplefile-com.txt";
        try(BufferedReader br = new BufferedReader(new FileReader(largeFile))){
            String line;
            while((line = br.readLine()) != null){
                if(line.toLowerCase().contains("error")){
                    System.out.println(line);
                }
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
