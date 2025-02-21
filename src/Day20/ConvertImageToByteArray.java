package Day20;

import java.io.*;
import java.nio.file.Files;
import java.util.Arrays;
public class ConvertImageToByteArray {
    public static void main(String[] args) {
        String inputImagePath = "C:\\Users\\Asus\\IdeaProjects\\BridgeLabs_Asssignments\\src\\Day20\\inputImage.png";
        String outputImagePath = "C:\\Users\\Asus\\IdeaProjects\\BridgeLabs_Asssignments\\src\\Day20\\outputImage.png";
        try{
            byte[] imageByte = convertImageToByteArray(inputImagePath);
            writeByteArrayToImage(imageByte, outputImagePath);
            if(Arrays.equals(Files.readAllBytes(new File(inputImagePath).toPath()), Files.readAllBytes(new File(outputImagePath).toPath()))){
                System.out.println("The new image is identical to the original image.");
            }else{
                System.out.println("The new image is NOT identical to the original image.");
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static byte[] convertImageToByteArray(String imagePath) throws IOException {
        try(FileInputStream fio = new FileInputStream(imagePath);
            ByteArrayOutputStream bos = new ByteArrayOutputStream()){
            byte[] buffer = new byte[1024];
            int byteRead;
            while((byteRead = fio.read(buffer))!=-1){
                bos.write(buffer, 0, byteRead);
            }
            return bos.toByteArray();
        }
    }
    public static void writeByteArrayToImage(byte[] imageBytes, String imagePath) throws IOException{
        try(ByteArrayInputStream bis = new ByteArrayInputStream(imageBytes);
            FileOutputStream fos = new FileOutputStream(imagePath)){
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = bis.read(buffer))!= -1){
                fos.write(buffer, 0, bytesRead);
            }
        }
    }
}
