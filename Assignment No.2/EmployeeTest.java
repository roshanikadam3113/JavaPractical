class Employee {
    private String firstName;
    private String lastName;
    private double monthlySalary;

    // Constructor
    public Employee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        setMonthlySalary(monthlySalary);
    }

    // Setter and Getter for firstName
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    // Setter and Getter for lastName
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    // Setter and Getter for monthlySalary
    public void setMonthlySalary(double monthlySalary) {
        if (monthlySalary > 0) {
            this.monthlySalary = monthlySalary;
        } else {
            this.monthlySalary = 0.0;
        }
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        // Creating Employee objects
        Employee emp1 = new Employee("John", "Doe", 5000);
        Employee emp2 = new Employee("Jane", "Smith", 6000);

        // Displaying yearly salary of each Employee
        System.out.println(emp1.getFirstName() + " " + emp1.getLastName() + " Yearly Salary: " + (emp1.getMonthlySalary() * 12));
        System.out.println(emp2.getFirstName() + " " + emp2.getLastName() + " Yearly Salary: " + (emp2.getMonthlySalary() * 12));

        // Giving a 10% raise
        emp1.setMonthlySalary(emp1.getMonthlySalary() * 1.10);
        emp2.setMonthlySalary(emp2.getMonthlySalary() * 1.10);

        // Displaying yearly salary after raise
        System.out.println("After 10% raise:");
        System.out.println(emp1.getFirstName() + " " + emp1.getLastName() + " Yearly Salary: " + (emp1.getMonthlySalary() * 12));
        System.out.println(emp2.getFirstName() + " " + emp2.getLastName() + " Yearly Salary: " + (emp2.getMonthlySalary() * 12));
    }
}
