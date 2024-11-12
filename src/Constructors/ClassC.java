package Constructors;

public class ClassC extends ClassA{
    int a;

    ClassC(int a){
        super(a); //calling super class's constructor
        this.a = a;
        System.out.println("Constructor C");
    }
    void displayC(){
        System.out.println("ClassC, method display "+ a);
    }
}