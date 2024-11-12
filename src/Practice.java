import java.util.Scanner;

public class Practice {
    public static int getSum(int x, int y) {
        int carry;
        while (y != 0) {
            // generate carry
            carry = x & y;
            System.out.println("carry"+carry);
            // xor x,y and assign the result into x
            x = x ^ y;
            System.out.println("x"+x);
            // left shift carry and assign into y
            y = carry << 1;
            System.out.println("y"+y);
        }
        return x;
    }

    public static void main(String[] args) {
//        Scanner sc = new Scanner();
        int a = 1, b=3;

        System.out.println(getSum(a,b));
    }
}
