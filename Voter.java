class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}
public class Voter {
    private int voterID;
    private String name;
    private int age;


    public Voter(int voterID, String name, int age) throws InvalidAgeException {
        if (age < 18) {
        
            throw new InvalidAgeException("Invalid age for voter");
        }
        this.voterID = voterID;
        this.name = name;
        this.age = age;
    }
    public int getVoterID() {
        return voterID;
    }

    public void setVoterID(int voterID) {
        this.voterID = voterID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void displayVoterInfo() {
        System.out.println("Voter ID: " + voterID);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    public static void main(String[] args) {
        try {
            Voter voter = new Voter(1, "Rohit", 16); 
            voter.displayVoterInfo();
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
