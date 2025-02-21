package Day20;

import java.io.*;
public class EfficientFileCopy {
    public static void main(String[] args) {
        String sourceFile = "C:\\Users\\Asus\\Downloads\\100mb-examplefile-com.txt";
        String destinationFile = "C:\\Users\\Asus\\Desktop\\Destination.txt";
        long bufferedStartTime = System.nanoTime();
        try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream(sourceFile));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destinationFile))){
            byte[] buffer = new byte[4096];
            int byteRead;
            while ((byteRead = bis.read()) != -1) {
                bos.write(buffer, 0, byteRead);
            }
        }
        catch(IOException e) {
            System.out.println("An error occurred during buffered copy: " + e.getMessage());
        }

        long bufferedEndTime = System.nanoTime();
        long bufferedDuration = (bufferedEndTime - bufferedStartTime) / 1000000; // Convert to ms
        System.out.println("Buffered Stream Copy Time: "+bufferedDuration +" ms");
        long unbufferedStartTime = System.nanoTime();
        try(FileInputStream fis = new FileInputStream(sourceFile);
            FileOutputStream fos = new FileOutputStream(destinationFile)){
            byte[] buffer = new byte[4096];
            int byteRead;
            while ((byteRead = fis.read()) != -1) {
                fos.write(buffer, 0, byteRead);
            }
        }
        catch(IOException e) {
            System.out.println("An error occurred during buffered copy: " + e.getMessage());
        }

        long unbufferedEndTime = System.nanoTime();
        long unbufferedDuration = (unbufferedEndTime - unbufferedStartTime) / 1000000; // Convert to ms
        System.out.println("Unbuffered Stream Copy Time: "+unbufferedDuration +" ms");
    }
}
