import java.sql.*;

public class JdbcInsertEmployees {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/your_database_name";
        String user = "your_username"; 
        String password = "your_password"; 
        int[] empcodes = {101, 102, 103, 104, 105};
        String[] empnames = {"Jenny", "Jacky", "Joe", "John", "Shameer"};
        int[] empages = {25, 30, 20, 40, 25};
        int[] esalaries = {10000, 20000, 40000, 80000, 90000};
        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            String sql = "INSERT INTO Employees (empcode, empname, empage, esalary) VALUES (?, ?, ?, ?)";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                for (int i = 0; i < empnames.length; i++) {
                    statement.setInt(1, empcodes[i]);
                    statement.setString(2, empnames[i]);
                    statement.setInt(3, empages[i]);
                    statement.setInt(4, esalaries[i]);
                    statement.executeUpdate();
                }
                System.out.println("Employees were inserted successfully.");
            }
        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
