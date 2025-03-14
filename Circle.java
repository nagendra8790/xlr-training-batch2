import java.util.Scanner;

public class Circle{
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the radius
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        
        // Calculate the area of the circle
        double area = Math.PI * Math.pow(radius, 2);
        
        // Display the result
        System.out.printf("The area of the circle with radius %.2f is %.2f\n", radius, area);
        
        // Close the scanner
        scanner.close();
    }
}