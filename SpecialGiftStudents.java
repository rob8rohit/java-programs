import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class SpecialGiftStudents {
    public static void main(String[] args) {
        List<String> students = Arrays.asList("Alice", "Bob", "Amelia", "James", "Anna", "John", "Aaron", "Sophia", "Albert", "Mike");
        List<String> studentsWithA = students.stream()
                                            .filter(name -> name.startsWith("A"))  
                                            .collect(Collectors.toList()); 
        System.out.println("Students whose names start with 'A': " + studentsWithA);
    }
}

