class Student {
    // Static variable to count total students
    static int totalStudents = 0;

    // Instance variable
    String name;

    // Static block (executes once when the class is loaded)
    static {
        System.out.println("Welcome to the Student Management System!");
        totalStudents = 0; // Initializing static variable
    }

    // Constructor to create a new student
    Student(String name) {
        this.name = name;
        totalStudents++; // Increment student count
        System.out.println("Student registered: " + name);
    }

    // Static method to display total students
    static void displayTotalStudents() {
        System.out.println("Total Students: " + totalStudents);
    }

    public static void main(String[] args) {
        // Creating students
        Student s1 = new Student("John");
        Student s2 = new Student("Emma");
        Student s3 = new Student("Mike");

        // Display total students using static method
        Student.displayTotalStudents();
    }
}
