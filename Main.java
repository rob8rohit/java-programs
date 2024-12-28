
 import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> streamNames = Arrays.asList("aBc", "d", "ef");
    
        List<String> uppercaseNames = streamNames.stream()
        .map(String::toUpperCase)
        .collect(Collectors.toList());
    
        System.out.println(uppercaseNames);
    }
}

