package ReferenceTypes;

public class Car {
    String model;
    int year;
    Car(int year, String model){
        this.year = year;
        this.model = model;
    }

    void display(){
        System.out.println("Model is "+model+" year is "+year);
    }
}
