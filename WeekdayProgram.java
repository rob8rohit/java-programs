
import java.util.Scanner;

public class WeekdayProgram {
    public static void main(String[] args) {
        String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter the day index (0 for Sunday, 1 for Monday, ..., 6 for Saturday): ");
            int dayIndex = scanner.nextInt();
            System.out.println("The day is: " + daysOfWeek[dayIndex]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: The index you entered is out of range. Please enter a number between 0 and 6.");
        } catch (Exception e) {
            System.out.println("Error: Invalid input. Please enter a valid integer.");
        } 
        finally {
            scanner.close();
        }
    }
}

    
