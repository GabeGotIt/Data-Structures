import java.util.*;

public class Counter {

    public static void main(String[] args){

        int limit = 20;

        System.out.println("Enter your numbers");

        List<Double> number_list = new ArrayList<Double>(limit);

        Scanner scanner = new Scanner(System.in);

        for (int i=0; i < limit; i++) {
            double next_double = scanner.nextDouble();
            number_list.add(next_double);

        }

        Double[] number_array = number_list.toArray(new Double[0]);

        System.out.println(Arrays.toString(number_array));

    }
}

