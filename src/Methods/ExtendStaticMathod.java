package Methods;

public class ExtendStaticMathod extends StaticMethod {
    @Override
    void abstractMethod(){
        System.out.println("here is implementation of abstract method in static method class");
    }

    public int getSum(int... numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

}
