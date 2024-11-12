package OopsPackage;
//class Addition implements myInterface{
//    @Override
//    public int getSum(int a, int b){
//        int c = a+b ;
//        System.out.println("sum is " + c);
//        return c;
//    }
//}


//abstract class Example{
//    int num;
//    String str;
//
//    static final int num2 = 5;
//    public Example(int a, String s){
//        this.num = a;
//        this.str = s;
//    }
//    protected void display(){
//        System.out.println("Parent Class, this obj num is  "+ num+" string is "+str);
//    }
//
//    static void display(int a){
//        System.out.println("this num is  "+ a);
//    }
//
//    protected abstract void myAbstract();
//}
//
//interface myInterface{
//    public int getSum(int a, int b);
//    public static void print(){
//        System.out.println("Here I'm in interface as static method");
//    }
//}
//
//
//class ExampleAddition extends Example implements myInterface{
////    int a;
////    int b;
////    String str;
////    public ExampleAddition(int a, int b, String str){
////        super(a,str);
////        this.b = b;
////    }
//
//    int b;
//    public ExampleAddition(int a, int b, String str) {
//        super(a, str);  // Initialize superclass fields
//        this.b = b;
//    }
//    @Override
//    public int getSum(int a, int b){
//        int c = a+b ;
//        System.out.println("sum is " + c);
//        return c;
//    }
//
//    @Override
//    protected void myAbstract(){
//        System.out.println("Here is execution of abstract method");
//    }
//
//    void displayChild(){
//        System.out.println("Child Class, this obj num is "+ super.num+" "+b+" string is "+str);
//    }
//
//}



class MyClass {
    static int staticVar = 10;  // Static field
    int instanceVar = 20;       // Non-static field (instance variable)
}

public class BasicClassObj {
    public static void main(String[] args) {
//        Example obj1 = new Example(21, "asdf");
//        obj1.display();
//        Example.display(4);


//        Addition obj2 = new Addition();
//        myInterface obj3 = new Addition();
//        myInterface obj4 = new myInterface() {
//            @Override
//            public int getSum(int a, int b) {
//                int c = a+b ;
//                System.out.println("sum is " + c);
//                return c;
//            }
//        };
//        obj2.getSum(3,4);
//        obj3.getSum(4,5);
//        obj4.getSum(5,7);
//        myInterface.print();

//        ExampleAddition obj1 = new ExampleAddition(3,4,"qwer");
//        obj1.displayChild();
//        obj1.display();
////        Example.num2 = 5;
//        System.out.println(Example.num2);
////        Example.num2 = 15;
////        System.out.println(Example.num2);

        MyClass obj1 = new MyClass();
        MyClass obj2 = new MyClass();
        System.out.println(MyClass.staticVar);

        // Accessing instance variable through the object
        System.out.println("Instance variable (obj1): " + obj1.instanceVar);

        // Modifying the instance variable for obj2
        obj2.instanceVar = 30;
        System.out.println("Instance variable (obj2): " + obj2.instanceVar);
        System.out.println("Instance variable (obj1): " + obj1.instanceVar);
    }
}




