import java.util.Scanner;

    public class PrintNumbersForLoop {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the starting number: ");
            int start = scanner.nextInt();
            System.out.print("Enter the ending number: ");
            int end = scanner.nextInt();
    
            System.out.println("Numbers from " + start + " to " + end + " using for loop:");
            for (int i = start; i <= end; i++) {
                System.out.print(i + " ");
            }
            scanner.close();
        }
    }   

