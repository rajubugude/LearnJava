class Vehicle{
      int noWheels;
      String mode;

      public void start() {
            System.out.println("Start Car");
      }
      public void stopCar() {
            System.out.println("Stop Car");
      }
}

class Car extends Vehicle{
      int mileage;
      public void applyBreak(){
            System.out.println("Apply Break");
      }
}

public class Inheritance {
      public static void main(String[] args) {
            Car c = new Car();
            c.start();
      }
}
