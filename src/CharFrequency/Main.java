package CharFrequency;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class Main {
    public static void main(String[] args) {


    String input =  "darshan";

   Map<String,Long> countMap= Arrays.stream(input.split(""))
            .collect(
                    Collectors.groupingBy(
                            Function.identity(),counting()
                    )
            );
        System.out.println(countMap);
        System.out.println(counting().getClass());





















        String name = "yogmaYa";
        Map<String,Long> mapCount=    Arrays.stream(name.split(""))
                .collect(
                groupingBy(
                        Function.identity(),counting()
                )
                );
        System.out.println(mapCount);
}
}
