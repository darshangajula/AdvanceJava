package CharFrequency;
//  14.WAP using stream to find frequency of each character in a given String ?
import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main1 {
    public static void main(String[] args) {
        String string = "manjunath gajula";
        Map<String, Long> countFrequency = Arrays.stream(string.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(countFrequency);
    }
}
