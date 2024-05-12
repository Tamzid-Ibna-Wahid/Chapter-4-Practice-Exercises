package E4_6;

import java.util.Scanner;

public class Area {
    public double radius;

    public Area(){
        scan();
    }
    public void scan(){
        Scanner scan = new Scanner(System.in);
        radius = scan.nextDouble();
    }
    public double getcircleArea(){
        double circleArea = Math.PI * Math.pow(radius, 2);
        return circleArea;
    }
    public double getcircumference(){
        double circumference = 2 * Math.PI * radius;
        return circumference;
    }
    public double sphereVolume (){
        double sphereVolume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        return sphereVolume;
    }
    public double sphereSurfaceArea  (){
        double sphereSurfaceArea = 4 * Math.PI * Math.pow(radius, 2);
        return sphereSurfaceArea ;
    }

}
