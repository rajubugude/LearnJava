package ComparatorvsComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//Note: each type has own main class, psvm
//First we will sort numbers in increasing and decreasing order

//using Comparator

//public class Main {
//    public static void main(String[] args) {
//        Comparator<Integer> com = new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                if(o1%10 > o2%10){
//                    return 1;
//                }
//                else{
//                    return -1;
//                }
//            }
//        };
//
//         //Lambda expression
//        // Comparator<Integer> com = (o1,o2) -> o1%10 > o2%10 ? 1 : -1; //sorts based on last digit of number
//
//            Comparator<Integer> comSortReverse = (num1, num2) -> num2-num1;
//            ArrayList<Integer> nums = new ArrayList<>();
//            nums.add(21);
//            nums.add(44);
//            nums.add(33);
//            nums.add(17);
//            Collections.sort(nums, comSortReverse);
//            for (int n : nums) {
//                System.out.println(n);
//            }
//    }
//}



//using Comparable

//class NumberHolder implements Comparable<NumberHolder> {
//    int number;
//
//    public NumberHolder(int number) {
//        this.number = number;
//    }
//
//    @Override
//    public int compareTo(NumberHolder other) {
//        // Descending order by returning `other.number - this.number`
//        return other.number - this.number;
//    }
//
//    @Override
//    public String toString() {
//        return String.valueOf(number);
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        ArrayList<NumberHolder> nums = new ArrayList<>();
//        nums.add(new NumberHolder(21));
//        nums.add(new NumberHolder(44));
//        nums.add(new NumberHolder(33));
//        nums.add(new NumberHolder(17));
//
//        Collections.sort(nums); // Uses the compareTo method of NumberHolder
//        for (NumberHolder n : nums) {
//            System.out.println(n);
//        }
//    }
//}


//Learn to sort strings accordingly
import java.util.Arrays;

//class Car {
//    String carName;
//    String carType;
//
//    public Car(String carName, String carType) {
//        this.carName = carName;
//        this.carType = carType;
//    }
//
//    @Override
//    public String toString() {
//        return carName + " - " + carType;
//    }
//}


//using comparator

//public class Main {
//    public static void main(String[] args) {
//        Car[] carArray = new Car[3];
//        carArray[0] = new Car("SUV", "petrol");
//        carArray[1] = new Car("Sedan", "diesel");
//        carArray[2] = new Car("HatchBack", "CNG");
//
////        Comparator<Car> comp = (obj1, obj2) -> obj1.carType.compareTo(obj2.carType);
//        Comparator<Car> comp = (obj1, obj2) -> obj1.carName.compareTo(obj2.carName);
//        // Use Arrays.sort to sort an array
//        Arrays.sort(carArray, comp);
//
//        // Print sorted array
//        for (Car car : carArray) {
//            System.out.println(car);
//        }
//    }
//}


//sort using comparable

//class Car implements Comparable<Car>{
//    private String type;
//    private String fuel;
//
//    // Constructor
//    public Car(String typ, String fue) {
//        this.type = typ;
//        this.fuel = fue;
//    }
//    // Override the compareTo method to sort cars by type
//    @Override
//    public int compareTo(Car other) {
////        return this.type.compareTo(other.type); // Sorts alphabetically by type
////        return other.fuel.compareTo(this.fuel);
//            return this.fuel.compareTo(other.fuel);
//    }
//
//    // Override toString to print car details
//    @Override
//    public String toString() {
//        return "Car Type: " + type + ", Fuel: " + fuel;
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        Car[] carArray = new Car[3];
//        carArray[0] = new Car("SUV", "petrol");
//        carArray[1] = new Car("Sedan", "diesel");
//        carArray[2] = new Car("HatchBack", "CNG");
//
//        // Use Arrays.sort to sort an array of Car objects
//        Arrays.sort(carArray);
//
//        // Print sorted array
//        for (Car car : carArray) {
//            System.out.println(car);
//        }
//    }
//}

// sort based on 2nd element in 2d array

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Sample input arrays for start and end times of meetings
        int[] start = {1, 3, 0, 5, 8, 5};
        int[] end = {2, 4, 6, 7, 9, 9};

        // Call maxMeetings and store the result
        int maxMeetings = solution.maxMeetings(start, end);

        // Print the result
        System.out.println("Maximum number of meetings: " + maxMeetings);
    }
}
class Solution {
    // Function to find the maximum number of meetings that can
    // be performed in a meeting room.
    public class Meeting {
        int startTime;
        int endTime;

        public Meeting(int startTime, int endTime) {
            this.startTime = startTime;
            this.endTime = endTime;
        }
    }
    public int maxMeetings(int start[], int end[]) {
        int n = start.length;
        ArrayList<Integer> meet = new ArrayList<>();
        meet.add(1);
        meet.add(3);
        meet.add(2);
        for(Integer i: meet){
            System.out.println(i);
        }


        ArrayList<Meeting> meetings = new ArrayList<>();

        // Populate the meetings list
        for (int i = 0; i < n; i++) {
            meetings.add(new Meeting(start[i], end[i]));
        }
        for(Meeting m : meetings){
            System.out.println(m.startTime+" "+ m.endTime+" ,Meeting Class Obj: "+m);
        }

        // Sort meetings by end time
        Collections.sort(meetings, (a, b) -> a.endTime - b.endTime);

        // Initialize count of meetings and the earliest free time
        int count = 1;
        int freeTime = meetings.get(0).endTime;

        // Iterate over sorted meetings
        for (int i = 1; i < n; i++) {
            if (meetings.get(i).startTime > freeTime) {
                count++;
                freeTime = meetings.get(i).endTime;
            }
        }

        return count;
    }
}
