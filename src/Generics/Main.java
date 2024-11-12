package Generics;

public class Main {
    public static void main(String[] args) {
        Box<String> obj = new Box();

        obj.setValue("Hello, World!");
        System.out.println(obj.getValue());

        Box<Integer> obj1 = new Box();
        obj1.setValue(1);
        System.out.println(obj1.getValue());



    }


    //TODO with out  generics

//        Box obj = new Box();
//        obj.setValue("Hello, World!"); // Storing a String
//        System.out.println((String) obj.getValue()); // Casting to String
//        obj.setValue(42); // Storing an Integer
//        System.out.println((Integer) obj.getValue()); // Casting to Integer
//    }

}