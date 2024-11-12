public class TypeOfVar_3 {
    //instance variables
    String name;
    int rollno;

    // static variables
    public static int rollno1;
    public static String name1 = "Ram";

    // Function to add two numbers
    public void add() {
        // Local variables
        int a = 10;
        int b = 20;
        int c = a + b;
        // Printing the sum
        System.out.println(c);
    }

    // Driver Code
    public static void main(String args[]) {
        // Creating an object of Addition class
        TypeOfVar_3 obj = new TypeOfVar_3();
        // Function Call
        obj.add();

        TypeOfVar_3 obj1 = new TypeOfVar_3();
        // Assigning values in the variables(instance variables) only used after creating instances/objects
        obj1.name = "Ram";
        obj1.rollno = 10;
        // Printing name and rollno
        System.out.println(obj1.name);
        System.out.println(obj1.rollno);

        // printing static vaiables only using className.VarName
        // accessing static variable without creating object
        TypeOfVar_3.rollno1 = 10;
        System.out.println(TypeOfVar_3.name1);
        System.out.println(TypeOfVar_3.rollno1);
    }
}


//public class TypeOfVar_3 {
//    int b = 4;
//    public static void main(String[] args) {
//        int a = 5;
//        System.out.println(a);
//        TypeOfVar_3 obj = new TypeOfVar_3();
//        System.out.println(obj.b);
////        System.out.println(b);
//
//        int x;
//        x = 10;
//        {
//            int y = 20;
//            System.out.print(x + " " + y);
//        }
//
//        //System.out.print(x + " " + y); error coz, y is out of scope
//
//    }
//}