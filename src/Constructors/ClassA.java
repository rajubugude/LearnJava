package Constructors;

public class ClassA {
    int a;
    ClassA(int a){
        this.a = a;
        System.out.println("Constructor A");
    }
    void displayA(){
        System.out.println("ClassA, method display "+ a);
    }
}
