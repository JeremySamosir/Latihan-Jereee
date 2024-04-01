package driver;
import java.util.Scanner;
import model.Sphere;
import model.Cube;
import model.Pyramid;
import model.Cone;
import model.Cylinder;

/*
 * This class calculates the volume of a shape based on the user's choice.
 * 12S22029-Jeremy Samosir
 */

public class CalculateVolume {
    // Main method
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);
        // Display the menu
        System.out.println("Select a shape to calculate the volume:");
        System.out.println("1. Sphere");
        System.out.println("2. Cube");
        System.out.println("3. Pyramid");
        System.out.println("4. Cone");
        System.out.println("5. Cylinder");
        int choice = scanner.nextInt();
        double radius, height, baseLength, baseWidth;
        // Check the user's choice
        switch (choice) {
            case 1:
                // Get the radius of the sphere
                System.out.print("Enter the radius of the sphere: ");
                radius = scanner.nextDouble();
                // Create a Sphere object
                Sphere sphere = new Sphere(radius);
                // Display the volume of the sphere
                System.out.println("The volume of the sphere is: " + sphere.getVolume());
                break;
            case 2:
                // Get the length of the cube
                System.out.print("Enter the length of the cube: ");
                baseLength = scanner.nextDouble();
                // Create a Cube object
                Cube cube = new Cube(baseLength);
                // Display the volume of the cube
                System.out.println("The volume of the cube is: " + cube.getVolume());
                break;
            case 3:
                // Get the base length of the pyramid
                System.out.print("Enter the base length of the pyramid: ");
                baseLength = scanner.nextDouble();
                // Get the base width of the pyramid
                System.out.print("Enter the base width of the pyramid: ");
                baseWidth = scanner.nextDouble();
                // Get the height of the pyramid
                System.out.print("Enter the height of the pyramid: ");
                height = scanner.nextDouble();
                // Create a Pyramid object
                Pyramid pyramid = new Pyramid(baseLength, baseWidth, height);
                // Display the volume of the pyramid
                System.out.println("The volume of the pyramid is: " + pyramid.getVolume());
                break;
            case 4:
                // Get the radius of the cone
                System.out.print("Enter the radius of the cone: ");
                radius = scanner.nextDouble();
                // Get the height of the cone
                System.out.print("Enter the height of the cone: ");
                height = scanner.nextDouble();
                // Create a Cone object
                Cone cone = new Cone(radius, height);
                // Display the volume of the cone
                System.out.println("The volume of the cone is: " + cone.getVolume());
                break;
            case 5:
                // Get the radius of the cylinder
                System.out.print("Enter the radius of the cylinder: ");
                radius = scanner.nextDouble();
                // Get the height of the cylinder
                System.out.print("Enter the height of the cylinder: ");
                height = scanner.nextDouble();
                // Create a Cylinder object
                Cylinder cylinder = new Cylinder(radius, height);
                // Display the volume of the cylinder
                System.out.println("The volume of the cylinder is: " + cylinder.getVolume());
                break;
            default:
                System.out.println("Invalid choice!");
        }
        // Close the scanner
        scanner.close();
    }
}