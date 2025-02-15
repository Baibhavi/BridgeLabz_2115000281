package Day16.StringBufferProblems;

public class ComparisonStringBuilderStringBuffer {
    public static long performanceTestStringBuilder(){
        long startTime, endTime;
        StringBuilder sb = new StringBuilder();
        startTime = System.nanoTime();
        for(int i = 0; i < 100000; i++){
            sb.append("Hello");
        }
        endTime = System.nanoTime();
        return endTime-startTime;
    }
    public static long performanceTestStringBuffer(){
        long startTime, endTime;
        StringBuffer sb = new StringBuffer();
        startTime = System.nanoTime();
        for(int i = 0; i < 100000; i++){
            sb.append("Hello");
        }
        endTime = System.nanoTime();
        return endTime-startTime;
    }
    public static void main(String[] args) {
        long timeTakenStringBuilder = performanceTestStringBuilder();
        long timeTakenStringBuffer = performanceTestStringBuffer();
        System.out.println("Performance Time of Sting Builder: " + timeTakenStringBuilder);
        System.out.println("Performance Time of Sting Buffer: " + timeTakenStringBuffer);
        if(timeTakenStringBuffer > timeTakenStringBuilder)
            System.out.println("String Buffer is faster than String Builder");
        else
            System.out.println("String Builder is faster than String Buffer");

    }
}
