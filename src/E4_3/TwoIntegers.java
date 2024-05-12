package E4_3;

import java.util.Scanner;

public class TwoIntegers {

    public int number1, number2;

    public TwoIntegers() {
        scan();
    }
    public void scan() {
        Scanner sc = new Scanner(System.in);
        number1 = sc.nextInt();
        number2 = sc.nextInt();
    }
    public int getSum(){
        return number1 + number2;
    }
    public int getDifference(){
        return number1 - number2;
    }
    public int getProduct(){
        return number1 * number2;
    }
    public int getAvarage(){
        return (number1 + number2) / 2;
    }
    public int getDistance(){
        return Math.abs(number1 - number2);
    }
    public int getmaximum(){
        return Math.max(number1, number2);
    }
    public int getminimum(){
        return Math.min(number1, number2);
    }
}
