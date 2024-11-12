package Threads;

public class MyClass implements Runnable{

    public void run(){
        System.out.println("run method implemented "+ Thread.currentThread().getName());
    }
    public void display(){
        System.out.println("my class method");
    }
}
