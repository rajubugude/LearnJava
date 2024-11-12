package Threads;

import org.w3c.dom.ls.LSOutput;

import java.lang.Thread;
public class ThreadsLearn {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        Thread thread1 = new Thread(obj);
        thread1.start();
        System.out.println("Finish main method "+Thread.currentThread().getName());
    }
}
