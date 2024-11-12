public class ArraysLearn {
    public static void main(String[] args) {
//        int[] myArray = new int[5]; // an array of 5 integers
//        System.out.println(myArray);
//        int[] myArray = {6, 7, 3, 4, 5}; // an array with 5 elements
//        for(int i = 0; i < 5; i ++){
//            System.out.println(myArray[i]);
//        }

        int [] arr = new int[10]; // declaring arr
        int count = 20;
        for(int i = 0; i < 5; i ++){
            arr[i] = count;
            count++;
        }
        for(int i : arr){
            System.out.println(i);
        }
        System.out.println("arr length is: " + arr.length);
    }
}
