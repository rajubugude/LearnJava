abstract class Vehicle{
      public void start(){ //non - abstract method
            System.out.println("Start ");
      }

      abstract public void getNoOfWheels(); // abstract method
}

class Car extends Vehicle{
      public void getNoOfWheels(){ 
            System.out.println("Car has 4 wheels");
      }
}


public class Abstraction {
      public static void main(String[] args) {
            //Vehicle v = new Vehicle(); // throws error, coz abstract class can't be instanciated
            Car c = new Car();
            c.start();
            c.getNoOfWheels();


      }
}
