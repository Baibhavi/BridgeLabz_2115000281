package Day17;

public class StringConcatenationPerformance {
    public static long stringConcatenation(){
        String str = "";
        long start = System.nanoTime();
        for(int i = 0; i < 100000; i++){
            str += "hello";
        }
        long end = System.nanoTime();
        return end-start;
    }
    public static long stringBuilderConcatenation(){
        StringBuilder str = new StringBuilder();
        long start = System.nanoTime();
        for(int i = 0; i < 100000; i++){
            str.append("hello");
        }
        long end = System.nanoTime();
        return end-start;
    }
    public static long stringBufferConcatenation(){
        StringBuffer str = new StringBuffer();
        long start = System.nanoTime();
        for(int i = 0; i < 100000; i++){
            str.append("hello");
        }
        long end = System.nanoTime();
        return end-start;
    }
    public static void main(String[] args) {
        long stringTime = stringConcatenation();
        long stringBuilderTime = stringBuilderConcatenation();
        long stringBufferTime = stringBufferConcatenation();
        System.out.println("Time taken for concatenation by String = " + stringTime + ", StringBuilder = " + stringBuilderTime+ ", StringBuffer = " + stringBufferTime);
    }
}
