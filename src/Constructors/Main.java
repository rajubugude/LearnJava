package Constructors;

public class Main {
    public static void main(String[] args) {
//        ClassA objA = new ClassA(5);
//        ClassB objB = new ClassB(5,6);
//        objA.displayA();
//        objB.displayA();
//        objB.displayB();

//        ClassC objC = new ClassC(5);
//        objC.displayC();

        PrivateConstructor obj = PrivateConstructor.getConstructor();
        System.out.println(obj.getClass());
    }
}
