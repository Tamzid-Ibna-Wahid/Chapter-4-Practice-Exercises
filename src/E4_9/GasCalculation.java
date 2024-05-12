package E4_9;

import java.util.Scanner;

public class GasCalculation {
    public double gallonsInTank, fuelEfficiency, pricePerGallon;

    public GasCalculation(){
        scan();
    }
    public void scan(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the gallons in Tank: ");
        gallonsInTank = scan.nextDouble();
        System.out.print("Enter the fuel efficiency: ");
        fuelEfficiency = scan.nextDouble();
        System.out.print("Enter the pricePerGallon: ");
        pricePerGallon = scan.nextDouble();
    }
    public double costPer100Miles(){
        double costPer100Miles = (100.0 / fuelEfficiency) * pricePerGallon;
        return costPer100Miles;
    }
    public double Distence(){
        double distance = gallonsInTank * fuelEfficiency;
        return distance;

    }
}
