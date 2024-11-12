public class Methods {
      public static void main(String[] args) {
            Methods m = new Methods();
            m.sayHello();
            m.addNumbers(2,3);
            m.addNumbers(2, 45);
            System.out.println("Multiplication is " + m.multiply(3, 5));
      }

      void sayHello(){
            System.out.println("Hello R");
      }

      void addNumbers(int a, int b){
            int c = a+b;
            System.out.println("sum is " + c);
      }

      int multiply(int a, int b){
            return (a*b);
      }

}
