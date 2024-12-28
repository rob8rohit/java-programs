import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class  Main2 {
    public static void main(String[] args) {
        List<String> students = Arrays.asList(
            "Alice", "Bob", "Anna", "Charlie", "Andrew", "David", 
            "Aiden", "Eve", "Aaron", "Grace"
        );
        List<String> studentsWithA = students.stream()
        .filter(name -> name.startsWith("A"))  
        .collect(Collectors.toList()); 
        System.out.println("Students whose names start with 'A': " + studentsWithA);
    }
}

    