package ReferenceTypes;

public class Main {
    public static void main(String[] args) {
        /*
//        1.Class type

        Car car1 = new Car(2000, "BMW");
        car1.display();
        Car car2 = car1;
        car2.model = "XUV";
        car2.display();
        car1.display();
        Car car3 = car2;
        car3.model = "AUDI";
        car2.display();
        car1.display();
        car3.display();

         */

        /*

//        2.String

//        Hash Code (hashCode()): Calculated based on the contents of the String.
//        Memory Address: Managed internally by the JVM; two strings with the same content
//        may have the same hash code but will have different memory addresses unless
//        they are the same instance (e.g., interned strings).


        String s1 = "hello";  // in string constant pool
        String s2 = "hello world"; // in string constant pool
        System.out.println(s2);
        System.out.println(s1);

        s1 = s2;
        System.out.println(s1);


        System.out.println(s1.equals(s2)); //checks content
        System.out.println(s1 == s2); //checks address

        String s3 = new String("hello world");  //in heap memory
        System.out.println(s1.equals(s3)); //checks content
        System.out.println(s1 == s3); //checks address

        */
    }
}


