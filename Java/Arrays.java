import java.util.*;

public class Arrays {
      public static void main(String[] args) {
            int arr[] = new int[5]  ;
            Scanner s = new Scanner(System.in);
            for(int i = 0; i < arr.length; i++) {
                  System.out.println("Enter the input number "+ (i+1));
                  arr[i] = s.nextInt();
                  }

            for(int i = 0; i < arr.length; i++) {
                  System.out.println("you entered "+ (i+1) + "th number is "+ arr[i]);
                  }
            
}
}
