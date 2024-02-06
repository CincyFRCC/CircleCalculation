import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class CircleCalculation {
    public static void main(String[] args) {
        double radius,area,length,volume;

        Scanner rd= new Scanner(System.in);
        System.out.print("Enter the radius of a cylinder:");
        radius=rd.nextDouble();
        area=computeArea(radius);
        System.out.printf("Area is: %.2f\n", area);
        Scanner lt= new Scanner(System.in);
        System.out.print("Enter the length of a cylinder:");
        length=lt.nextDouble();
        volume=computeVolume(area,length);
        System.out.printf("volume is: %.2f\n", volume);
        //double radius,diameter, circumference,area,pi;
        //pi=Math.PI;
        //Scanner rd= new Scanner(System.in);
        //System.out.print("Enter the radius:");
        //radius=rd.nextDouble();
        //diameter=circleDiameter(radius);
        //System.out.printf("Diameter is: %.2f\n", diameter);
        //area=pi*radius*radius;
        //circumference=2*pi*radius;
        //System.out.printf("Diameter is: %.2f\n", diameter);
        //System.out.printf("circumference is: %.2f\n", circumference);
        //System.out.printf("circumference is: %.2f\n", area);
    }
    public  static double computeArea(double radius)
    {
        double pi=Math.PI;
        return radius*radius*pi;
    }
    public  static double computeVolume(double area,double length)
    {
        return area * length;
    }
    public  static double circleDiameter(double radius)
    {
        double diameter;
        diameter=2*radius;
        return diameter;
    }
}