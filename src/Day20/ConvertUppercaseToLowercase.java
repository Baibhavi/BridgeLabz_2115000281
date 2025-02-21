package Day20;

import java.io.*;
public class ConvertUppercaseToLowercase {
    public static void main(String[] args) {
        String inputFile = "C:\\Users\\Asus\\IdeaProjects\\BridgeLabs_Asssignments\\src\\Day20\\SourceFile.txt";
        String outputFile = "C:\\Users\\Asus\\IdeaProjects\\BridgeLabs_Asssignments\\src\\Day20\\lowerCaseOutput.txt";
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(inputFile), "UTF-8"));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(outputFile), "UTF-8"))){
            String line;
            while((line = br.readLine()) != null){
                bw.write(line.toLowerCase());
                bw.newLine();
            }
            System.out.println("File has been converted and saved to " + outputFile);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
