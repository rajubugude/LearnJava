public class Constructors {
      int i;
      char j;

      Constructors(){
            System.out.println("DEFAULT constructor called");
      }

      Constructors(int i){
            System.out.println("Paramitarized constructor called");
            this.i = i;
      }

      Constructors(int i, char k){
            System.out.println("Paramitarized constructor called");
            this.i = i;
            j = k;
      }

      public static void main(String[] args) {
            Constructors obj1 = new Constructors();
            System.out.println(obj1);

            Constructors obj2 = new Constructors(5);
            System.out.println(obj2.i);

            Constructors obj3 = new Constructors(5,'r');
            System.out.println(obj3.i + " " + obj3.j);
            

      }
}
