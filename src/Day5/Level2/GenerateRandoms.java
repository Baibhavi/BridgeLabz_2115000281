package Day5.Level2;

public class GenerateRandoms {
    public static void main(String[] args) {
        GenerateRandoms obj = new GenerateRandoms();
        int numbers[] = obj.generate4DigitRandomArray(5);
        System.out.println("Random numbers: ");
        for(int i : numbers){
            System.out.print(i + " ");
        }
        double[] avgMinMax = obj.findAverageMinMax(numbers);
        System.out.println("Average of random numbers : " + avgMinMax[0]);
        System.out.println("Minimum of random numbers : " + avgMinMax[1]);
        System.out.println("Maximum of random numbers : " + avgMinMax[2]);
    }
    public int[] generate4DigitRandomArray(int size){
        int[] randomNumbers = new int[size];
        for(int i = 0; i < randomNumbers.length; i++){
            randomNumbers[i] =(int) (Math.random() * 9000) + 1000;
        }
        return randomNumbers;
    }
    public double[] findAverageMinMax(int[] numbers){
        double[] result = new double[3];
        double avg = 0;
        double min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for(int i : numbers){
            avg += i;
            min = Math.min(i, min);
            max = Math.max(i, max);
        }
        result[0] = avg/numbers.length;
        result[1] = min;
        result[2] = max;
        return result;
    }

}
