package E4_18;

import java.util.Scanner;

public class NumberToMonth {
    public String[] month = {"january","February","March","April","May","June","July","August","September","October","November","December"};
    int number;
    public NumberToMonth(){
        scan();
    }
    public void scan(){
        Scanner scan = new Scanner(System.in);
        number = scan.nextInt();
        number--;
    }
    public String getMonth(){
        return month[number];
    }
}
