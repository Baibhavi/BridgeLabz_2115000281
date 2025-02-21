package Day20;

import java.io.*;
public class StoreRetrievePrimitiveData {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\Asus\\IdeaProjects\\BridgeLabs_Asssignments\\src\\Day20\\BinaryFile.doc";
        try(DataOutputStream dos = new DataOutputStream(new FileOutputStream(filePath))){
            dos.writeInt(1);
            dos.writeUTF("Baibhavi");
            dos.writeDouble(8.08);
            dos.writeInt(2);
            dos.writeUTF("Pooja");
            dos.writeDouble(7.89);
            System.out.println("Student details have been written to Binary File(doc)");
        }catch (IOException e){
            e.printStackTrace();
        }
        try(DataInputStream dis = new DataInputStream(new FileInputStream(filePath))){
            while(dis.available() > 0){
                int rollNumber = dis.readInt();
                String name = dis.readUTF();
                double gpa = dis.readDouble();
                System.out.printf("Roll Number: %d, Name: %s, GPA: %.2f%n", rollNumber, name, gpa);
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
