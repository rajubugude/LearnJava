package Generics;


//without generics
//public class Box { //without generics
//    private Object value;
//
//    // Setter method
//    public void setValue(Object value) {
//        this.value = value;
//    }
//
//    // Getter method
//    public Object getValue() {
//        return value;
//    }
//
//}

public class Box<T> { //TODO with generics
    private T value;

    // Setter method
    public void setValue(T value) {
        this.value = value;
    }

    // Getter method
    public T getValue() {
        return value;
    }
}