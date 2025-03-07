import java.util.Scanner;

class Area {
    private double length;
    private double breadth;

    // Method to set dimensions
    public void setDim(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Method to calculate and return area
    public double getArea() {
        return length * breadth;
    }
}

public class AreaTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter length of rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter breadth of rectangle: ");
        double breadth = scanner.nextDouble();

        // Creating an object of Area class
        Area rectangle = new Area();
        rectangle.setDim(length, breadth);

        // Printing the area
        System.out.println("The area of the rectangle is: " + rectangle.getArea());

        scanner.close();
    }
}
