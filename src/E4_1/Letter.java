package E4_1;

public class Letter {
    public static final double INCH_TO_MM = 25.4;
    public double WIDTH_IN_INCHES;
    public  double HEIGHT_IN_INCHES;

    public double widthInMM, heightInMM;

    public Letter() {
        WIDTH_IN_INCHES = 8.5;
        HEIGHT_IN_INCHES = 11.0;
    }

    public double getSizeofWidth(){
        widthInMM = WIDTH_IN_INCHES * INCH_TO_MM;
        return widthInMM;
    }
    public double getSizeofHight(){
        heightInMM = HEIGHT_IN_INCHES * INCH_TO_MM;
        return heightInMM;
    }
    public double getSizeofperimeter(){
        double perimeterInMM = 2 * (widthInMM + heightInMM);
        return perimeterInMM;
    }
    public double getDiagonalLength(){
        double diagonalLengthInMM = Math.sqrt(Math.pow(widthInMM, 2) + Math.pow(heightInMM, 2));
        return diagonalLengthInMM;
    }

}
