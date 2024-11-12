public class ScopeOfVar_2 {
    /*
    int y; // this is a Member/Class Level Variable Scope
    void method() {
        // local variable (Method Level Scope)
        // This method can’t be accessed outside
        // method body.
        int x; // Local Variables Scope (Only in methods
    }

    */

    /*
    public void display() {

        int x = 10;
    }
    public static void main(String args[]) {
        System.out.println(x); //it throws error coz x is in display method
    }

     */

    int y = 10;

    public static void main(String args[]) {
        ScopeOfVar_2 obj = new ScopeOfVar_2();
        System.out.println(obj.y);
    }
}
