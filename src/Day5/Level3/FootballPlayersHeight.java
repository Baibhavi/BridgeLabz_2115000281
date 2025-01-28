package Day5.Level3;

public class FootballPlayersHeight {
    public static void main(String[] args) {
        int height[] = new int[11];
        for(int i = 0; i < 11; i++){
            height[i] = (int) (Math.random()*101) + 150;
        }
        System.out.println("The sum of heights : " + sumOfHeights(height) + "\nThe mean of heights : " + meanOfHeights(height) + "\nThe shortest player is " + shortestOfHeights(height) + "\nThe tallest player is " + tallestOfHeights(height));
    }
    public static int sumOfHeights(int[] heights){
        int sum = 0;
        for(int i : heights){
            sum += i;
        }
        return sum;
    }
    public static int meanOfHeights(int[] heights){
        int sum = 0;
        for(int i : heights){
            sum += i;
        }
        return sum/heights.length;
    }
    public static int shortestOfHeights(int[] heights){
        int shortest = Integer.MAX_VALUE;
        for(int i : heights){
            shortest = Math.min(shortest, i);
        }
        return shortest;
    }
    public static int tallestOfHeights(int[] heights){
        int tallest = Integer.MIN_VALUE;
        for(int i : heights){
            tallest = Math.max(tallest, i);
        }
        return tallest;
    }
}
