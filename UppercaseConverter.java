import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UppercaseConverter {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("aBc", "d", "ef");
        List<String> uppercaseList = stream
            .map(String::toUpperCase) 
            .collect(Collectors.toList()); 
        System.out.println("Uppercase List: " + uppercaseList);
    }
}
