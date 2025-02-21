package Day21;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class CheckedException {
    public static void main(String[] args) {
        String file = "data.txt";
        try(BufferedReader br = new BufferedReader(new FileReader(file))){
            String line;
            while((line = br.readLine()) != null){
                System.out.println(line);
            }
        }
        catch (FileNotFoundException e){
            System.out.println("File not found: " + file);
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
