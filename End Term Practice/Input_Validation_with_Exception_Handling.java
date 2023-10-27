import java.util.*;

public class Input_Validation_with_Exception_Handling {
    static void validate(String name, int id, double salary) throws Exception {
        if (!name.matches("[a-zA-Z]+")) {
            throw new Exception("Invalid Name");
        }
        if (id <= 0) {
            throw new Exception("Invalid ID");
        }
        if (salary < 0) {
            throw new Exception("Invalid Salary");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {

            System.out.println("Enter Your Name: ");
            String name = sc.nextLine();

            System.out.println("Enter Your ID:");
            int id = sc.nextInt();

            System.out.println("Enter Your Salary:");
            double salary = sc.nextDouble();

            validate(name, id, salary);

            System.out.println("Your Name is: " + name);
            System.out.println("Your ID is: " + id);
            System.out.println("Your Salary is: " + salary);
        } 
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
