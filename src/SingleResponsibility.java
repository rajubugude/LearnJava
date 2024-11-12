public class SingleResponsibility {
    public static void main(String[] args) {
        Employee employee = new Employee("Raju", "Software Engineer", 100000);

        EmployeeDatabase employeeDatabase = new EmployeeDatabase();
        employeeDatabase.save(employee);

        EmailService emailService = new EmailService();
        emailService.sendEmail(employee, "Welcome to the company!");
    }
}

//WITH SINGLE RESPONSIBILITY PRINCIPLE(SRP)
class Employee {
    private String name;
    private String role;
    private double salary;

    public Employee(String name, String role, double salary) {
        this.name = name;
        this.role = role;
        this.salary = salary;
    }

    public String getDetails() {
        return name + " is a " + role + " earning " + salary;
    }

    public String getName() {
        return name;
    }
}

class EmployeeDatabase {
    public void save(Employee employee) {
        // Code to save the employee details to the database
        System.out.println("Saving " + employee.getName() + " to the database...");
    }
}

class EmailService {
    public void sendEmail(Employee employee, String message) {
        // Code to send email to the employee
        System.out.println("Sending email to " + employee.getName() + ": " + message);
    }
}



//WITHOUT SINGLE RESPONSIBILITY PRINCIPLE
//class Employee {
//    private String name;
//    private String role;
//    private double salary;
//
//    public Employee(String name, String role, double salary) {
//        this.name = name;
//        this.role = role;
//        this.salary = salary;
//    }
//
//    public String getDetails() {
//        return name + " is a " + role + " earning " + salary;
//    }
//
//    public void saveToDatabase() {
//        // Code to save the employee details to the database
//        System.out.println("Saving " + name + " to the database...");
//    }
//
//    public void sendEmail(String message) {
//        // Code to send email to the employee
//        System.out.println("Sending email to " + name + ": " + message);
//    }
//}
