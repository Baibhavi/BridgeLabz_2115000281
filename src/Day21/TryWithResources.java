package Day21;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources {
    public static void main(String[] args) {
        String file = "C:\\Users\\Asus\\IdeaProjects\\BridgeLabs_Asssignments\\src\\Day21\\info.txt" ;
        try(BufferedReader br = new BufferedReader(new FileReader(file))){
            String firstLine = br.readLine();
            System.out.println(firstLine);
        }
        catch (IOException e){
            System.out.println("Error reading file");;
        }
    }
}
