import java.util.Scanner;

public class printNumbersForLoop1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the starting number: ");
        int start = scanner.nextInt();
        System.out.print("Enter the ending number: ");
        int end = scanner.nextInt();

        System.out.println("Numbers from " + start + " to " + end + " using while loop:");
        int i = start;
        while (i <= end) {
            System.out.print(i + " ");
            i++;
        }
        scanner.close();
    }
}

