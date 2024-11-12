import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class LearnPriorityQueue {

    public static void main(String[] args) {

      //   Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder()); // implements max heap
        Queue<Integer> pq = new PriorityQueue<>(); // implements min heap

        pq.offer(40); // to add the element in heap/priority queue
        pq.offer(12);
        pq.offer(24);
        pq.offer(36);

        System.out.println(pq);
        pq.poll(); // delete top most element from heap
        System.out.println(pq);

        System.out.println(pq.peek()); // get the top element from heap

    }

}
