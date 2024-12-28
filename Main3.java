
 import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Main3{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your birthday (yyyy-mm-dd): ");
        String birthdayInput = scanner.nextLine();
        scanner.close();

        LocalDate birthDate = LocalDate.parse(birthdayInput);
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(birthDate, currentDate);
    
        System.out.println("Your age is: " + period.getYears() + " years, " +
        period.getMonths() + " months, and " +
         period.getDays() + " days.");
    }
}


