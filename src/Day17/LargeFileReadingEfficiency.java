package Day17;

import java.io.*;
public class LargeFileReadingEfficiency {
    public static long performanceTestInputStreamReader(){
        String filePath = "C:\\Users\\Asus\\Downloads\\100mb-examplefile-com.txt";
        long startT = 0, endT = 0;
        try(BufferedReader br = new BufferedReader(new InputStreamReader( new FileInputStream(filePath)))){
            startT = System.nanoTime();
            while(br.readLine() != null){}
            endT = System.nanoTime();
        }
        catch (IOException e){
            e.printStackTrace();
        }
        return endT-startT;
    }
    public static long performanceTestFileReader(){
        String filePath = "C:\\Users\\Asus\\Downloads\\100mb-examplefile-com.txt";
        long startT = 0, endT = 0;
        try(BufferedReader br = new BufferedReader(new FileReader(filePath))){
            startT = System.nanoTime();
            while(br.readLine() != null){}
            endT = System.nanoTime();
        }
        catch (IOException e){
            e.printStackTrace();
        }
        return endT-startT;
    }

    public static void main(String[] args) {
        long timeTakenInputStreamReader = performanceTestInputStreamReader();
        long timeTakenFileReader = performanceTestFileReader();
        System.out.println("Performance Time of InputStreamReader: " + timeTakenInputStreamReader);
        System.out.println("Performance Time of File Reader: " + timeTakenFileReader);
    }
}
