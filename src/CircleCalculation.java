import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class CircleCalculation {
    public static void main(String[] args) {
        double radius,diameter, circumference,area,pi;
        pi=Math.PI;
        Scanner rd= new Scanner(System.in);
        System.out.print("Enter the radius:");
        radius=rd.nextDouble();
        diameter=2*radius;
        area=pi*radius*radius;
        circumference=2*pi*radius;
        System.out.printf("Diameter is: %.2f\n", diameter);
        System.out.printf("circumference is: %.2f\n", circumference);
        System.out.printf("circumference is: %.2f\n", area);
    }
}