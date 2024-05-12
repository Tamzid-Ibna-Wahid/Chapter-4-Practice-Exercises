package E4_16;

import java.util.Scanner;

public class TimeDifferenceCalculator {

    public  int time1, time2;

    public TimeDifferenceCalculator(){
        scan();
    }
    public void scan(){
        Scanner scan = new Scanner(System.in);
        time1 = scan.nextInt();
        time2 = scan.nextInt();
    }
    public int getHoursDifference(){
        int hours1 = time1 / 100;
        int minutes1 = time1 % 100;
        int hours2 = time2 / 100;
        int minutes2 = time2 % 100;

        int totalMinutes1 = hours1 * 60 + minutes1;
        int totalMinutes2 = hours2 * 60 + minutes2;

        int differenceInMinutes = Math.abs(totalMinutes2 - totalMinutes1);

        int differenceHours = differenceInMinutes / 60;
        return differenceHours;
    }
    public int getMinutesDifference(){
        int hours1 = time1 / 100;
        int minutes1 = time1 % 100;
        int hours2 = time2 / 100;
        int minutes2 = time2 % 100;

        int totalMinutes1 = hours1 * 60 + minutes1;
        int totalMinutes2 = hours2 * 60 + minutes2;

        int differenceInMinutes = Math.abs(totalMinutes2 - totalMinutes1);

        int differenceMinutes = differenceInMinutes % 60;

        return differenceMinutes;
    }
}
