package Day20;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
public class ReadUserInputFromConsole {
    public static void main(String[] args) {
        String path = "C:\\Users\\Asus\\IdeaProjects\\BridgeLabs_Asssignments\\src\\Day20\\userInfo.txt";
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileWriter writer = null;
        try{
            System.out.println("Enter your name, age and favorite programming language: ");
            String name = reader.readLine();
            String  age = reader.readLine();
            String programmingLanguage = reader.readLine();
            writer = new FileWriter(path);
            writer.write("Name: " + name + "\n");
            writer.write("Age: " + age + "\n");
            writer.write("Favorite Programming Language: " + programmingLanguage + "\n");
            System.out.println("User information saved to userInfo.txt.");
        }
        catch (IOException e){
            e.printStackTrace();
        }
        finally {
            try {
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException e) {
                System.out.println("Error closing the FileWriter: " + e.getMessage());
            }
        }
    }
}
