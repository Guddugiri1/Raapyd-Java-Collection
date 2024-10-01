
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main3 {

    public static void main(String[] args) {
        // Queue<Integer> queue = new LinkedList<>();
        // Queue<Integer> queue = new PriorityQueue<>();
        Queue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());

        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(1);
        queue.add(12);
        queue.add(3);
        queue.forEach((n) -> System.out.print(n + " ")
        );
        // queue.remove();
        // System.out.println("");
        // queue.forEach((n) -> System.out.print(n + " ")
        // );
    }
}
