package Constructors;

public class ClassB extends ClassA {

    int b;

    ClassB(int a, int b){
        super(a);
        this.b = b;
        System.out.println("Constructor B");
    }
    void displayB(){
        System.out.println("ClassA, method display "+ super.a + " "+ b);
    }
}
