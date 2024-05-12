package E4_7;

import java.util.Scanner;

public class Area {
    public double length, width;

    public Area(){
        scan();
    }
    public void scan(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        length = scan.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        width = scan.nextDouble();
    }

    public double getArea(){
        double area = length * width;
        return area;
    }
    public double getPerimeter(){
        double perimeter = 2 * (length + width);
        return perimeter;
    }
    public double getDiagonal(){
        double diagonalLength = Math.sqrt(Math.pow(length, 2) + Math.pow(width, 2));
        return diagonalLength;
    }
}
