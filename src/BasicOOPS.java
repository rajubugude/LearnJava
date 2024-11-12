
//
//public class BasicOOPS {
//    public static void main(String[] args) {
///* Basic class and obj explanation
//        Pen obj = new Pen();
//        Pen obj1 = new Pen();
//        obj.color = "green";
//        obj1.color = "red";
//        obj.type = "ball";
//        obj.write();
//        System.out.println(obj.color+", "+obj.type);
//
//        obj.getColor();
//        obj1.getColor();
//
// */
//
//        // Constructor calling - 1. Non Parameterized Constructor
//        Student s1 = new Student();
//        s1.age = 23;
//        s1.name = "asdf";
//        s1.printInfo();
//
//        Student s2 = new Student();
//        s2.age = 25;
//        s2.name = "erty";
//        s2.printInfo();
//
//        // Parameterized Constructor
//        Proff p1 = new Proff("QWER", 24);
//        p1.printInfo();
//
//        // Copy Constructor
//        Security s3 = new Security();
//        s3.age = 20;
//        s3.name = "tyui";
//        s3.printInfo();
//        Security s4 = new Security(s3);
//        s4.printInfo();
//
//    }
//}
//
///* Basic class and obj explanation
//
//class Pen{
//    String color;
//    String type;
//
//    public void write(){
//        System.out.println("I'm a pen obj, write something");
//    }
//
//    public void getColor(){
//        System.out.println(this.color);
//    }
//}
//
//*/
//
//
//// Constructor calling - 1. Non Parameterized Constructor
//
//class Student{
//    String name;
//    int age;
//
//    Student(){ // same name as class - Constructor
//        System.out.println("Calling constructor - automatically calls after obj creation");
//    }
//
//    public void printInfo(){
//        System.out.println("Student Name is "+ this.name+" and age is "+ this.age);
//    }
//}
//
//// Constructor calling - 2. Parameterized Constructor
//class Proff{
//    String name;
//    int age;
//    Proff(String name, int age){
//        this.name = name;
//        this.age= age;
//    }
//    public void printInfo(){
//        System.out.println("Proff Name is "+ this.name+" and age is "+ this.age);
//    }
//}
//
//// Constructor calling - 3. Copy Constructor
//
//class Security{
//    String name;
//    int age;
//    Security(Security s2){
//        this.name = s2.name;
//        this.age= s2.age;
//        System.out.println("Copy constructor call");
//    }
//    Security(){
//        System.out.println("Empty Copy constructor call");
//    }
//    public void printInfo(){
//        System.out.println("Security Name is "+ this.name+" and age is "+ this.age);
//    }
//
//}



