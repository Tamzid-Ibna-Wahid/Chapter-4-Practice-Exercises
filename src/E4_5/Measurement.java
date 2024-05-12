package E4_5;

import java.util.Scanner;

public class Measurement {
    public int meters;

    public Measurement() {
        scan();
    }
    public void scan() {
        Scanner sc = new Scanner(System.in);
        meters = sc.nextInt();
    }
    public double getMiler() {
        double miles = meters * Constant.METERS_TO_MILES;
        return miles;
    }
    public double getfeet(){
        double feet = meters * Constant.METERS_TO_FEET;
        return feet;
    }
    public double getInches() {
        double inches = meters * Constant.METERS_TO_INCHES;
        return inches;
    }
}
