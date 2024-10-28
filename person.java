public class person 
{
    private String name;
    private int age;
    public person(String n, int a)
    {
        name =n;
        age =a;
    }
    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }

public static void main(String[] args) {
      person p1 = new person("rohit",18);

      System.out.println(p1.getName() + " is " + p1.getAge() + " years old.");
        
      
        

    }
}