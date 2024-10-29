import java.util.Scanner;
interface Taxable {
    double SALES_TAX= 0.07; 
    double INCOME_TAX = 0.105; 

    double calcTax();
}
class Employee implements Taxable {
    private int empId;
    private String name;
    private double salary;

    public Employee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }


    public double calcTax() {
        return salary * INCOME_TAX;
    }
}


class Product implements Taxable {
    private int pid;
    private double price;
    private String quality;

    public Product(int pid, double price, String quality) {
        this.pid = pid;
        this.price = price;
        this.quality = quality;
    }

    @Override
    public double calcTax() {
        return price * SALES_TAX; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    
        System.out.println("Enter Employee ID: ");
        int empId = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter Employee Name: ");
        String name = scanner.nextLine();
        System.out.println("Enter Employee Salary: ");
        double salary = scanner.nextDouble();

        Employee employee = new Employee(empId, name, salary);
        double incomeTax = employee.calcTax();

    
        System.out.println("Enter Product ID: ");
        int pid = scanner.nextInt();
        System.out.println("Enter Product Price: ");
        double price = scanner.nextDouble();
        scanner.nextLine(); 
        System.out.println("Enter Product Quality: ");
        String quality = scanner.nextLine();

        Product product = new Product(pid, price, quality);
        double salesTax = product.calcTax();


        System.out.printf("Income Tax for %s (ID: %d): %.2f%n", name, empId, incomeTax);
        System.out.printf("Sales Tax for Product ID %d: %.2f%n", pid, salesTax);

        scanner.close();
    }
}
