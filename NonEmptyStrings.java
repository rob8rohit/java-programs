import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class NonEmptyStrings {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("abc", "", "be", "efg", "abcd", "", "jkl");
        List<String> nonEmptyStrings = strings.stream()
                                              .filter(s -> !s.isEmpty()) 
                                              .collect(Collectors.toList()); 
        System.out.println("Non-empty strings: " + nonEmptyStrings);
    }
}

