package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
//        String str = "Nisarg";
//        str = "nisarga";
//        //concat
//
//        final String s1 = "" ;
//                //concat with final
//
//        String s = new String("hello");
//
//        ArrayList<Integer> arr = new ArrayList<>();
//        arr.add(1);
//        arr.add(2);
//        arr.add(3);
//        arr.add(4);
        //streams practice more
//        int countEven = arr.stream().map(captilaize(char c)::c.Captilize).collect()

        //hashtable no null key

        //read about dependency - versions in pom.xml
        //why to we
        //

        //threadpools - read, implement work on that
        //private const - autowired

        int []arr = new int[] {3, 2,1,4,5};
        int n = arr.length;
        for(int i = 0; i < n; i++){
            int curr = arr[i]; //2
            if(i>0){
                int j = i; //1
                while(j>0 && arr[j]<curr){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    j-=1;
                }
            }
        }

//        List<String> names = Arrays.asList("John", "Alice", "Bob", "Carol");
//        List<String> filteredWords = names.stream()
//                .map(String::toUpperCase)
//                .filter(name -> name.startsWith("A"))
//                .collect(Collectors.toList()); // Alice

    }
}
