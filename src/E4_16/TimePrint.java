package E4_16;

public class TimePrint {
    public static void main(String[] args) {
        TimeDifferenceCalculator calculator = new TimeDifferenceCalculator();

        System.out.print(calculator.getHoursDifference()+" ");
        System.out.println(calculator.getMinutesDifference());
    }
}
