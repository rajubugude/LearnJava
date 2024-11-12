import java.util.Stack;

public class LearnStack {

    public static void main(String[] args) {
        Stack<String> animals= new Stack<>();

        animals.push("Lion"); // add element to the stack
        animals.push("Dog");
        animals.push("Horse");
        animals.push("Cat");

        System.out.println("Stack: " + animals);

        System.out.println(animals.peek()); // get last element from stack

        animals.pop(); // remove last element from stack

        System.out.println("Stack: " + animals);

        System.out.println(animals.peek());
    }
}
