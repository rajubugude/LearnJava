public class Instance0f_6 {

        public static void main(String args[]) {

            // Creating the objects of parent
            // and the child class
            ParentClass obj1 = new ParentClass();
            ChildClass obj2 = new ChildClass();


            // Comparing the object to a specified type
            System.out.println("obj1 is instance of ParentClass = " + (obj1 instanceof ParentClass));
            System.out.println("obj1 is instance of ChildClass = " +  (obj1 instanceof ChildClass));
            System.out.println("obj1 is instance of MyInterface = " + (obj1 instanceof MyInterface));
            System.out.println("obj2 is instance of ParentClass = " + (obj2 instanceof ParentClass));
            System.out.println("obj2 is instance of ChildClass = " +  (obj2 instanceof ChildClass));
            System.out.println("obj2 is instance of MyInterface = " + (obj2 instanceof MyInterface));
        }
    }


    // Creating parent class
    class ParentClass {


    }

    // Creating an interface
    interface MyInterface {


    }

    // Creating child class
    class ChildClass extends ParentClass implements MyInterface {



}
