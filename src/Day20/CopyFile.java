package Day20;

import java.io.*;
public class CopyFile {
    public static void main(String[] args) {
        String sourceFile = "C:\\Users\\Asus\\IdeaProjects\\BridgeLabs_Asssignments\\src\\Day20\\SourceFile.txt";
        String destinationFile = "C:\\Users\\Asus\\IdeaProjects\\BridgeLabs_Asssignments\\src\\Day20\\DestinationFile.txt";
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try{
            File source = new File(sourceFile);
            if(!source.exists()){
                System.out.println("Source file does not exist.");
                return;
            }
            File destination = new File(destinationFile);
            if(!destination.exists()){
                destination.createNewFile();
            }
            fis = new FileInputStream(source);
            fos = new FileOutputStream(destination);
            int byteContent;
            while((byteContent=fis.read())!=-1){
                fos.write(byteContent);
            }
            System.out.println("File Copied Successfully");
        }
        catch (IOException e){
            System.out.println("An error occurred: " + e.getMessage());
        }
        try {
            if (fis != null) {
                fis.close();
            }
            if(fos != null){
                fos.close();
            }
        } catch (IOException e) {
            System.out.println("Error closing the FileWriter: " + e.getMessage());
        }
    }
}
