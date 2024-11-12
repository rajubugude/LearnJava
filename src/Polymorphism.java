//compile time polymorphism: method over-loading => better because, we see errors at compile time
// run time : method over-riding => if error is there, we can see in production i.e, while running the code only.
// so better avoid in most cases performing method-overriding/run time polymorphism
// over-loading -> same fn/method name in same class, different functionalities, diff parameters, diff return types etc.,
// over-riding -> same fn/method name in child classes (mostly used in inheritance),
// different functionalities, diff parameters, diff return types etc.,

//Note: method over-riding explained in Inheritance.
//public class Polymorphism {
//    public static void main(String[] args) {
//        Student s1 = new Student();
//        s1.age = 24;
//        s1.name = " asdf";
//
//        // function/method overloading.
//        s1.printInfo();
//        s1.printInfo(s1.age);
//        s1.printInfo(s1.name);
//        s1.printInfo(s1.age, s1.name);
//    }
//}
//
//class Student{
//    int age;
//    String name;
//
//    Student(){
//        System.out.println("call non parameterized constructor");
//    }
////Method Overloading
//    public void printInfo(){
//        System.out.println("Student details are Empty");
//    }
//    public void printInfo(int age){
//        System.out.println("Student age is "+ this.age);
//    }
//    public void printInfo(String name){
//        System.out.println("Student Name is "+ this.name);
//    }
//    public void printInfo(int age, String name){
//        System.out.println("Student Name is "+ this.name+" and age is "+ this.age);
//    }
//}
