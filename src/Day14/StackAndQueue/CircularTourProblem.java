package Day14.StackAndQueue;
import java.util.LinkedList;
import java.util.Queue;
class PetrolPump {
    int petrol;
    int distance;
    public PetrolPump(int petrol, int distance) {
        this.petrol = petrol;
        this.distance = distance;
    }
}
public class CircularTourProblem {
    public static int findStartingPoint(PetrolPump[] pumps) {
        int start = 0, end = 0;
        int curr_petrol = 0;
        int total_surplus = 0, total_deficit = 0;
        Queue<Integer> queue = new LinkedList<>();
        while (end < pumps.length) {
            curr_petrol += pumps[end].petrol - pumps[end].distance;
            total_surplus += pumps[end].petrol - pumps[end].distance;
            queue.add(end);
            while (curr_petrol < 0 && !queue.isEmpty()) {
                int removedPump = queue.remove();
                curr_petrol -= pumps[removedPump].petrol - pumps[removedPump].distance;
                total_deficit += pumps[removedPump].petrol - pumps[removedPump].distance;
                start = (removedPump + 1) % pumps.length;
            }
            end++;
        }
        return total_surplus + total_deficit >= 0 ? start : -1;
    }
    public static void main(String[] args) {
        PetrolPump[] pumps = {
                new PetrolPump(4, 6),
                new PetrolPump(6, 5),
                new PetrolPump(7, 3),
                new PetrolPump(4, 5)
        };
        int start = findStartingPoint(pumps);

        if (start != -1) {
            System.out.println("Start at petrol pump: " + start);
        } else {
            System.out.println("No solution");
        }
    }
}
