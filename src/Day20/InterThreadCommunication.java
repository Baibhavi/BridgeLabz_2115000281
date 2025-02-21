package Day20;
import java.io.*;
public class InterThreadCommunication {
    public static void main(String[] args) {
        try {
            PipedOutputStream pos = new PipedOutputStream();
            PipedInputStream pis = new PipedInputStream(pos);
            Thread writerThread = new Thread(new Runnable() {
                @Override
                public void run() {
                    try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(pos))) {
                        for (int i = 1; i <= 5; i++) {
                            writer.write("Message " + i);
                            writer.newLine();
                            writer.flush();
                            System.out.println("Written: Message " + i);
                            Thread.sleep(500);
                        }
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
            Thread readerThread = new Thread(new Runnable() {
                @Override
                public void run() {
                    try (BufferedReader reader = new BufferedReader(new InputStreamReader(pis))) {
                        String message;
                        while ((message = reader.readLine()) != null) {
                            System.out.println("Read: " + message);
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            });
            writerThread.start();
            readerThread.start();
            writerThread.join();
            readerThread.join();

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
