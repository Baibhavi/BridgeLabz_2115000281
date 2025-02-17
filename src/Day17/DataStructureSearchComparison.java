package Day17;

import java.util.HashSet;
import java.util.TreeSet;
import java.util.Random;
public class DataStructureSearchComparison {
    public static int[] generateDataset(int size) {
        Random random = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(size * 10);
        }
        return arr;
    }
    public static long arraySearchTime(int[] array, int target) {
        long start, end;
        start = System.nanoTime();
        for (int i : array) {
            if (i == target) {
                break;
            }
        }
        end = System.nanoTime();
        return end - start;
    }
    public static long hashSetSearchTime(HashSet<Integer> hashSet, int target) {
        long start, end;
        start = System.nanoTime();
        boolean found = hashSet.contains(target);
        end = System.nanoTime();
        return end - start;
    }
    public static long treeSetSearchTime(TreeSet<Integer> treeSet, int target) {
        long start, end;
        start = System.nanoTime();
        boolean found = treeSet.contains(target);
        end = System.nanoTime();
        return end - start;
    }
    public static void main(String[] args) {
        int[] dataSizes = {1000, 100000, 1000000};
        for (int size : dataSizes) {
            int[] dataSet = generateDataset(size);
            int target = dataSet[new Random().nextInt(size)];
            long arrayTime = arraySearchTime(dataSet, target);
            HashSet<Integer> hashSet = new HashSet<>();
            for (int num : dataSet) {
                hashSet.add(num);
            }
            long hashSetTime = hashSetSearchTime(hashSet, target);
            TreeSet<Integer> treeSet = new TreeSet<>();
            for (int num : dataSet) {
                treeSet.add(num);
            }
            long treeSetTime = treeSetSearchTime(treeSet, target);
            System.out.println("For data size " + size + ":");
            System.out.println("Array Search Time: " + arrayTime + " ns");
            System.out.println("HashSet Search Time: " + hashSetTime + " ns");
            System.out.println("TreeSet Search Time: " + treeSetTime + " ns");
            System.out.println();
        }
    }
}

