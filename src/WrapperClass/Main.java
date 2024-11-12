package WrapperClass;

public class Main {
    public static void main(String[] args) {
        int num1 = 7;

        Integer num2 = num1; //autoboxing : primitive to reference/non-primitive
        // here num2 is object of class Integer
        System.out.println(num2);

        int num3 = num2; //auto-unboxing : reference to primitive
        System.out.println(num3);

        Integer num4 = null; // wrapper class objs can have null values
        System.out.println(num4);


        String s = "12";
        Integer num5 = Integer.parseInt(s);
        System.out.println(2*num5); //12*2 = 24

        Integer num6 = 1266;
        String s1 = Integer.toString(num6);
        System.out.println(s1); // "1266" is string

    }
}
