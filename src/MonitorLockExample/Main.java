package MonitorLockExample;

public class Main {
    public static void main(String[] args) {
        MonitorLockExample obj = new MonitorLockExample();

        //method1 without lamda expression
        MonitorThread1 obj1 = new MonitorThread1(obj);
        Thread t1 = new Thread(obj1);

        //method 2: with lamda, coz it's functional interface

        Thread t2 = new Thread(()->{obj.task2();});
        Thread t3 = new Thread(()->{obj.task3();});

        t1.start();
        t2.start();
        t3.start();
    }
}

class MonitorLockExample {
    public synchronized void task1(){
        try{
            System.out.println("inside task1");
            Thread.sleep(1000);
            System.out.println("task1 completed");
        }
        catch (Exception e){
            //exception handling here
        }
    }

    public void task2(){
        System.out.println("task2, but before synchronized");
        synchronized (this){
            System.out.println("task2, inside synchronized");
        }
    }

    public void task3(){
        System.out.println("task3");
    }
}
