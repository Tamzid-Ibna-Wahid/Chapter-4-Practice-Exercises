package E4_22;

import java.util.Scanner;

public class SodaCan {
    private double height;
    private double diameter;

    public SodaCan() {
       scan();
    }
    private void scan() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter height: ");
        height = scan.nextDouble();
        System.out.println("Enter diameter: ");
        diameter = scan.nextDouble();
    }


    public double getVolume() {
        double radius = diameter / 2.0;
        return Math.PI * radius * radius * height;
    }


    public double getSurfaceArea() {
        double radius = diameter / 2.0;
        double bottomArea = Math.PI * radius * radius;
        double sideArea = Math.PI * diameter * height;
        return 2 * bottomArea + sideArea;
    }
}

