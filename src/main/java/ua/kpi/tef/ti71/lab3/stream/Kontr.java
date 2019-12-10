package ua.kpi.tef.ti71.lab3.stream;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class Kontr {
    public static void main(String[] args){
        /*List<Integer> primes = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        primes.stream()
                .mapToInt(i -> i)
                .average()
                .ifPresent(avg -> System.out.println("Average found is " + avg));

        IntStream stream = IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        OptionalDouble obj = stream.average();
        return obj.ifPresentOrElse(() ->System.out.println("Error404"));
*/
        IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .average()
                .ifPresentOrElse(avg -> System.out.println("Average found is " + avg), ()-> System.out.println("Error ### "));

    }
}

