import java.util.*;

public class Input_Output_5 {
    public static void main(String[] args) {
        System.out.println("Coding");
        System.out.println("Ninjas");
        System.out.print("Coding");
        System.out.print("Ninjas");

        System.out.println();
        int k = 5;
        System.out.println("value is: "+ k);

        // this will print upto 2 decimal places
        System.out.printf("Formatted with precision: PI = %.2f\n", Math.PI);

        // Automatically appends Zeros to the rightmost part of the decimal
        float n = 5.2f;
        System.out.printf("Formatted to specific width: n = %.4f\n", n);

        //taking input
        Scanner sc = new Scanner(System.in);

        // Read integer value from the user
        System.out.println("Enter first number: ");
        int a = sc.nextInt();

        System.out.println("Enter second number: ");
        int b = sc.nextInt();

        // Adding two values
        int c = a + b;

        // Printing the sum
        System.out.println("Sum is: " +c);

        sc.nextLine(); // consume the newline character left over from nextInt()

        System.out.println("Enter a String : ");
        // Read a string from the user
        String str = sc.nextLine();
        System.out.println("Your entered string is : " + str);

        System.out.println("Enter a number: ");
        int d = sc.nextInt();
        System.out.println(d);
    }
}
