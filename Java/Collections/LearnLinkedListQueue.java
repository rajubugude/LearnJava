import java.util.LinkedList;
import java.util.Queue;

public class LearnLinkedListQueue {

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();

        queue.offer(12); // add element to queue
        queue.offer(24);
        queue.offer(36);

        System.out.println(queue);

        System.out.println(queue.poll()); // remove top element from queue

        System.out.println(queue);

        System.out.println(queue.peek());  // gets top element from queue

    }
}
