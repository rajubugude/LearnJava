
import java.util.* ;
import java.io.*;
//public class LinkedList {
//    public static void main(String[] args) {
//        Solution sol = new Solution();
//        Node node1 = new Node(4);
//        Node node2 = new Node(2);
//        Node node3 = new Node(-3);
//        Node node4 = new Node(4);
//        node1.next = node2;
//        node2.next = node3;
//        node3.next = node4;
//        node2.prev = node1;
//        node3.prev = node2;
//        node4.prev = node3;
//
//        Node node5 = sol.partition(node1, node2);
//        System.out.println(node5.value);
//    }
//}



/****************************************************

 Following is the Node class for the Singly Linked List:

 class Node {
 int data;
 Node next;

 public Node(int data) {
 this.data = data;
 this.next = null;
 }
 }

 ****************************************************/

public class LinkedList {

    // Helper function to find the middle of the list
    public static Node helper(Node head){
        Node slow = head;
        Node fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // Function to add the first and second halves of the list
    public static Node addFirstAndSecondHalf(Node head) {
        if(head == null || head.next == null){
            return head;
        }
        Node curr = head;
        Node mid = helper(head);
        Node second = mid.next;
        mid.next = null;
        int firsthalf = 0;
        while(curr!=null){
            firsthalf += (curr.data);
            firsthalf *= 10;
            curr = curr.next;
        }
        int secondhalf = 0;
        while(second!=null){
            secondhalf += (second.data);
            secondhalf *= 10;
            second = second.next;
        }
        int summ = firsthalf + secondhalf;
        if(summ == 0){
            Node curr1 = new Node(0);
            return curr1;
        }
        String s = Integer.toString(summ);
        Node head1 = null;
        Node tail1 = null;
        for(int i = 0; i < s.length()-1; i++){
            char c = s.charAt(i);
            int digit = Character.getNumericValue(c);
            Node curr1 = new Node(digit);
            if(head1 == null){
                head1 = curr1;
                tail1 = head1;
            }
            else{
                tail1.next = curr1;
                tail1 = tail1.next;
            }
        }
        return head1;
    }
    public static void main(String[] args) {
        // Example linked list: 9 -> 9
//        Node head = new Node(9);
//        head.next = new Node(9);

        // 9 1 9 9 2 1 9 9
        Node head = new Node(9);
        head.next = new Node(1);
        head.next.next = new Node(9);
        head.next.next.next = new Node(9);
        head.next.next.next.next = new Node(2);
        head.next.next.next.next.next = new Node(1);
        head.next.next.next.next.next.next = new Node(9);
        head.next.next.next.next.next.next.next = new Node(9);
        // Process and add the first and second halves
        Node result = addFirstAndSecondHalf(head);

        // Print the resulting linked list
        while(result != null){
            System.out.print(result.data + " ");
            result = result.next;
        }
    }
}
//
//
//class Solution {
//    public  Node partition(Node start, Node end){
//        int pivot = end.value;
//        Node curr = start;
//        Node left = start;
//        while(curr != end){
//            if(pivot >= curr.value){
//                swap(left, curr); //value swap present in that node.
//                left = left.next;
//            }
//            curr = curr.next;
//        }
//        swap(left, end);
//        return left;
//
//    }
//    public static void swap(Node a, Node b){
//        int temp = b.value;
//        b.value=a.value;
//        a.value=temp;
//    }
//}
//
//
class Node {
    int data;
//    Node prev;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}