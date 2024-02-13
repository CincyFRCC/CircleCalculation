import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class CircleCalculation {
    public static void main(String[] args) {

        double radius, diameter, circumference, area, pi;
        pi = Math.PI;
        //Read the radius of Circle
        Scanner rd = new Scanner(System.in);
        System.out.print("Enter the radius:");
        radius = rd.nextDouble();
        //Calculating Diameter
        diameter = circleDiameter(radius);
        //Printing the Diameter of the Circle
        System.out.printf("Diameter is: %.2f\n", diameter);
        //Calculating Area
        area = circleArea(radius);
        //Printing the Area of the Circle
        System.out.printf("Area is: %.2f\n", area);
        //Calculating circumference
        circumference = circleCircumference(radius);
        //Printing the circumference of the Circle
        System.out.printf("Circumference is: %.2f\n", circumference);

    }

    public static double circleArea(double radius) {
        double pi = Math.PI;
        return radius * radius * pi;
    }

    public static double circleDiameter(double radius) {
        double diameter;
        diameter = 2 * radius;
        return diameter;
    }

    public static double circleCircumference(double radius) {
        double pi = Math.PI;
        double circumference;
        circumference = 2 * pi * radius;
        return circumference;
    }
}